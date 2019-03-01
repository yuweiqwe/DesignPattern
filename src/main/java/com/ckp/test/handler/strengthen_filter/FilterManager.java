package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Request;
import com.ckp.test.handler.filter.Response;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.strengthen_filter
 * @ClassName: FilterManager
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 18:07
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 18:07
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class FilterManager {

    private final FilterChain chain;

    public FilterManager(FilterChain chain) {
        this.chain = chain;
    }

    public Response process(Request req){
        Response response = new Response("init");
        chain.doFilter(req, response);

        return response;
    }

    public FilterChain getChain() {
        return chain;
    }

}
