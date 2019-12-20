package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Request;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: Target
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:37
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:37
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class Target {

    public Result doFilter(Request req){
        System.out.println(req.getParemeters());
        return new Result("result");
    }

}
