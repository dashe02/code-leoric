package com.leoric.code.design.pattern.factory.metaphysical;

/**
 * Created by wecash on 18/7/18.
 */
public class WindowsFactory implements AbstractFactory{
    public Button createButton() {
        return new WindowsButton();
    }

    public Text createText() {
        return new WindowsText();
    }
}
