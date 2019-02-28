package com.ckp.test.abstractfactory;

public class ShapeCreator extends AbstractCreator {

    public Color getColor(String name) {
        return null;
    }

    public Shape getShape(String name) {
        if("ConcreteShape".equals(name)){
            return new ConcreteShape();
        }
        return null;
    }

}
