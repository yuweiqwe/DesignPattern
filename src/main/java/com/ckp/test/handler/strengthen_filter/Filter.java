package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Response;
import com.ckp.test.handler.filter.Request;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.strengthen_filter
 * @ClassName: Filter
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 17:51
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 17:51
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public interface Filter {

    public void doFilter(Request req, Response resp, FilterChain chain);

}
