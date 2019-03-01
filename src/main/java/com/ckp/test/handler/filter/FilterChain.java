package com.ckp.test.handler.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: FilterChain
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:31
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:31
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class FilterChain {

    private Target target;

    private final List<Filter> filters = new ArrayList<Filter>();

    public FilterChain() {
        this.target = new Target();
    }

    public Response execute(Request req){
        for (Filter filter : filters) {
            filter.doFilter(req);
        }

        return target.doFilter(req);
    }

    public void addFilter(Filter filter){
        this.filters.add(filter);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
