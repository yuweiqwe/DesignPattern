package com.ckp.test.abstractfactory;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.abstractfactory
 * @ClassName: FactoryProducer
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2018/12/16 22:47
 * @UpdateUser: yuwei2
 * @UpdateDate: 2018/12/16 22:47
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class FactoryProducer {

    public static AbstractCreator getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeCreator();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorCreator();
        }
        return null;
    }

}
