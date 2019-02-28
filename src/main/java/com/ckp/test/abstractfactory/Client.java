package com.ckp.test.abstractfactory;

public class Client {
	
	public static void main(String[] args) {
        //获取形状工厂
        AbstractCreator shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape concreteShape = shapeFactory.getShape("ConcreteShape");

        //获取形状工厂
        AbstractCreator colorFactory = FactoryProducer.getFactory("COLOR");

        Color colorCreator = colorFactory.getColor("ColorCreator");

    }

}
