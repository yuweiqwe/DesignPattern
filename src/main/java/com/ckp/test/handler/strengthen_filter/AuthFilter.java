package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Request;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: AuthFilter
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:40
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:40
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class AuthFilter implements Filter {

    public void doFilter(Request req, Response resp, FilterChain chain) {
        System.out.println("pre AuthFilter");
        chain.doFilter(req, resp);
        System.out.println("post AuthFilter");
    }
}
