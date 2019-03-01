package com.ckp.test.handler.filter;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: FilterManager
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:34
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:34
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class FilterManager {

    private final FilterChain chain;

    public FilterManager(FilterChain chain) {
        this.chain = chain;
    }

    public Response process(Request req){
        return chain.execute(req);
    }

    public FilterChain getChain() {
        return chain;
    }

}
