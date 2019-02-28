package com.ckp.test.abstractfactory;

public class ColorCreator extends AbstractCreator {

    public Color getColor(String name) {
        if("ConcreteColor".equals(name)){
            return new ConcreteColor();
        }
        return null;
    }

    public Shape getShape(String name) {
        return null;
    }

}
