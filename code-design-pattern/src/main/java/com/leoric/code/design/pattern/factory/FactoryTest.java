package com.leoric.code.design.pattern.factory;

import com.leoric.code.design.pattern.factory.metaphysical.AbstractFactory;
import com.leoric.code.design.pattern.factory.metaphysical.LinuxFactory;
import com.leoric.code.design.pattern.factory.metaphysical.WindowsFactory;
import com.leoric.code.design.pattern.factory.simple.INoodles;
import com.leoric.code.design.pattern.factory.simple.SimpleNoodleFactory;

/**
 * Created by wecash on 18/7/18.
 */
public class FactoryTest {

    public static void main(String[] args) {
        invokeSimpleFactory();
        invokeAbstractFactory();
    }

    private static void invokeSimpleFactory() {
        INoodles noodle = SimpleNoodleFactory.
                createNoodle(SimpleNoodleFactory.LZ_NOODLE);
        noodle.desc();
    }

    private static void invokeAbstractFactory() {
        AbstractFactory linuxFactory = new LinuxFactory();
        linuxFactory.createButton().processEvent();
        linuxFactory.createText().getWholeText();
        AbstractFactory windowsFactory = new WindowsFactory();
        windowsFactory.createButton().processEvent();
        windowsFactory.createText().getWholeText();
    }
}
