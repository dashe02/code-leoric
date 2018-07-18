package com.leoric.code.design.pattern.factory.metaphysical;

/**
 * Created by wecash on 18/7/18.
 */
public class LinuxFactory implements AbstractFactory{
    public Button createButton() {
        return new LinuxButton();
    }

    public Text createText() {
        return new LinuxText();
    }
}
