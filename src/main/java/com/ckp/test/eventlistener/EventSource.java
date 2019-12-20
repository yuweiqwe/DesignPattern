package com.ckp.test.eventlistener;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * 事件源：可以是任意一个需要监听的物体
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.eventlistener
 * @ClassName: EventSource
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/9 16:34
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/9 16:34
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class EventSource {

    private String name;

    public EventSource(String name) {
        this.name = name;
    }

    //监听器列表，监听器的注册则加入此列表
    private List<EventListener> listeners = new ArrayList<EventListener>();

    //注册监听器
    public void addListener(EventListener eventListener) {
        listeners.add(eventListener);
    }

    //撤销注册
    public void removeListener(EventListener eventListener) {
        listeners.remove(eventListener);
    }

    //接受外部事件
    public void notifyListenerEvents(Event event) {
        for (EventListener eventListener : listeners) {
            eventListener.handleEvent(event);
        }
    }

    public void fireWindowClosed(){
        this.notifyListenerEvents(new WindowEvent(this));
    }

    public String getName() {
        return name;
    }
}
