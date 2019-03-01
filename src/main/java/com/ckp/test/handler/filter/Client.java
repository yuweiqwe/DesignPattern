package com.ckp.test.handler.filter;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: Client
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:43
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:43
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Filter authFilter = new AuthFilter();
        Filter logFilter = new LogFilter();

        FilterChain chain = new FilterChain();
        chain.addFilter(logFilter);
        chain.addFilter(authFilter);

        FilterManager manager = new FilterManager(chain);

        Response response = manager.process(new Request("key=value"));

        System.out.println(response.getResult());
    }

}
