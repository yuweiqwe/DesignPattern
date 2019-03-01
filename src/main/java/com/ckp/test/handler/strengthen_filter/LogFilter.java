package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Request;
import com.ckp.test.handler.filter.Response;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: LogFilter
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:40
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:40
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class LogFilter implements Filter {

    public void doFilter(Request req, Response resp, FilterChain chain) {
        System.out.println("pre LogFilter");
        chain.doFilter(req, resp);
        System.out.println("post LogFilter");
    }

}
