package com.ckp.test.abstractfactory;

public class ShapeCreator extends AbstractCreator {

    @Override
    public Color getColor(String name) {
        return null;
    }

    @Override
    public Shape getShape(String name) {
        if("ConcreteShape".equals(name)){
            return new ConcreteShape();
        }
        return null;
    }

}
