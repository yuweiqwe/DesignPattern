package com.ckp.test.eventlistener;

/**
 * 描述：
 * 事件监听器
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.eventlistener
 * @ClassName: EventListener
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/9 16:35
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/9 16:35
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public interface EventListener {

    void handleEvent(Event event);

}
