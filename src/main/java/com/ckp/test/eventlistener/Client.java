package com.ckp.test.eventlistener;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.eventlistener
 * @ClassName: Client
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/9 16:39
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/9 16:39
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        EventSource eventSource = new EventSource("Window");

        eventSource.addListener(new EventListener(){

            @Override
            public void handleEvent(Event event) {
                if(event instanceof WindowEvent){
                    System.out.println("WindowEvent");
                }

                if(((EventSource) event.getSource()).getName().equals("Window")){
                    System.out.println("Window");
                }
            }

        });


        /*
         * 传入openWindows事件，通知listener，事件监听器，
         对open事件感兴趣的listener将会执行
         **/
        eventSource.fireWindowClosed();

    }

}
