package com.ckp.test.handler.strengthen_filter;

import com.ckp.test.handler.filter.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.strengthen_filter
 * @ClassName: FilterChain
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 17:52
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 17:52
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class FilterChain {

    private Target target;

    private static final List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    public FilterChain() {
        this.target = new Target();
    }

    public void doFilter(Request req, Response resp) {
        if(index == filters.size()){
            Result result = target.doFilter(req);
            resp.setResult(result);
            return;
        }

        System.out.println(index);
        Filter filter = filters.get(index++);

        filter.doFilter(req, resp, this);
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }

}
