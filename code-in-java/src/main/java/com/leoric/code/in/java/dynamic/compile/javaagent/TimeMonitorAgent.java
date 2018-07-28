package com.leoric.code.in.java.dynamic.compile.javaagent;

import java.lang.instrument.Instrumentation;

/**
 * Created by wecash on 18/7/28.
 */
public class TimeMonitorAgent {

    public static void premain(String agentArgs, Instrumentation inst){
        System.out.println("execute insert method interceptor");
        System.out.println(agentArgs);
        //添加自定义类转换器
        inst.addTransformer(new TimeMonitorTransformer(agentArgs));
    }
}
