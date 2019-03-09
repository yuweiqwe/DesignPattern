package com.ckp.test.eventlistener;

import java.io.Serializable;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.eventlistener
 * @ClassName: Event
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/9 16:34
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/9 16:34
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class Event implements Serializable {

    private Object source;

    public Event(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }
}
