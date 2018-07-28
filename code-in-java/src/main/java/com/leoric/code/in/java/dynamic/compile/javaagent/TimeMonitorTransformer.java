package com.leoric.code.in.java.dynamic.compile.javaagent;

import com.google.common.base.Objects;
import javassist.*;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * Created by wecash on 18/7/28.
 */
public class TimeMonitorTransformer implements ClassFileTransformer {

    private static final String STRAT_TIME = "\nlong startTime = System.currentTimeMillis();\n";

    private static final String END_TIME = "\nlong endTime = System.currentTimeMillis();\n";

    private static final String METHOD_RETURN_VALUE_VAR = "_time_monitor_result";

    private static final String EMPTY = "";

    private String classNameKeyWord;

    public TimeMonitorTransformer(String classNameKeyWord) {
        this.classNameKeyWord = classNameKeyWord;
    }

    public byte[] transform(ClassLoader loader, String className,
                            Class<?> classBeingRedefined,
                            ProtectionDomain protectionDomain,
                            byte[] classfileBuffer) throws IllegalClassFormatException {
        className = className.replace("/", ".");
        CtClass ctClass = null;
        try {
            //使用全称,用于获取字节码类
            ctClass = ClassPool.getDefault().get(className);
            if (Objects.equal(classNameKeyWord, EMPTY) || (!Objects.equal(classNameKeyWord, EMPTY)
                    && className.indexOf(classNameKeyWord) != -1)) {
                //所有方法
                CtMethod[] ctMethods = ctClass.getDeclaredMethods();
                for (CtMethod ctMethod : ctMethods) {
                    //修改方法的字节码
                    transformMethod(ctMethod, ctClass);
                }
            }
            return ctClass.toBytecode();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 为每一个拦截到的方法,执行一个方法的耗时操作
     *
     * @param ctMethod
     * @param ctClass
     */
    private void transformMethod(CtMethod ctMethod, CtClass ctClass) throws Exception {

        //抽象的方法是不能修改的,或者前面加了final关键字
        if ((ctMethod.getModifiers() & Modifier.ABSTRACT) > 0) {
            return;
        }
        //获取原始方法名称
        String methodName = ctMethod.getName();
        String monitorStr = "\nSystem.out.println(\"method " + ctMethod.getLongName() + " cost:\" +(endTime - startTime) +\"ms.\");";
        //实例化新方法名称
        String newMethodName = methodName + "$impl";
        //设置新的方法名称
        ctMethod.setName(newMethodName);
        //创建新的方法,复制原来的方法，名字为原来的名字
        CtMethod newMethod = CtNewMethod.copy(ctMethod, methodName, ctClass, null);
        StringBuilder bodyStr = new StringBuilder();
        //拼接新方法内容
        bodyStr.append("{");
        //返回类型
        CtClass returnType = ctMethod.getReturnType();
        //是否需要返回
        boolean hasReturnValue = CtClass.voidType != returnType;
        if (hasReturnValue) {
            String returnClass = returnType.getName();
            bodyStr.append("\n").append(returnClass + " " + METHOD_RETURN_VALUE_VAR + ";");
        }
        bodyStr.append(END_TIME);

        if (hasReturnValue) {
            bodyStr.append("\n").append(METHOD_RETURN_VALUE_VAR + " = ($r)" + newMethodName + "($$);");
        } else {
            bodyStr.append("\n").append(newMethodName + "($$);");
        }

        bodyStr.append(END_TIME);
        bodyStr.append(monitorStr);
        if (hasReturnValue){
            bodyStr.append("\n").append("return " + METHOD_RETURN_VALUE_VAR+" ;");
        }

        bodyStr.append("}");
        //替换新方法
        newMethod.setBody(bodyStr.toString());
        //增加新方法
        ctClass.addMethod(newMethod);
    }
}
