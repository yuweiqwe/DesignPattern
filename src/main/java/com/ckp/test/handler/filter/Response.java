package com.ckp.test.handler.filter;

import com.ckp.test.handler.strengthen_filter.Result;

import java.io.Serializable;

/**
 * 描述：
 * ${DESCRIPTION}
 *
 * @ProjectName: DesignPattern
 * @Package: com.ckp.test.handler.filter
 * @ClassName: Response
 * @Description: java类作用描述
 * @Author: 余巍
 * @CreateDate: 2019/3/1 16:24
 * @UpdateUser: yuwei2
 * @UpdateDate: 2019/3/1 16:24
 * @UpdateRemark: The modified content
 * @Version: 1.0
 **/
public class Response implements Serializable {

    private Result result;

    public Response(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }
}
