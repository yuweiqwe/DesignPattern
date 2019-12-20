package com.ckp.test.abstractfactory;

public class ColorCreator extends AbstractCreator {

    @Override
    public Color getColor(String name) {
        if("ConcreteColor".equals(name)){
            return new ConcreteColor();
        }
        return null;
    }

    @Override
    public Shape getShape(String name) {
        return null;
    }

}
