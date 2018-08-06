package com.leoric.code.jvm;

/**
 * Created by wecash on 18/8/4.
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLength() {
        stackLength++;
        stackLength();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLength();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
