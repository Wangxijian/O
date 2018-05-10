
package com.wxj.o.adapter;

import com.wxj.o.callback.Callback;
import com.wxj.o.model.Response;
import com.wxj.o.request.base.Request;

/**
 * 请求的包装类
 */
public interface Call<T> {
    /** 同步执行 */
    Response<T> execute() throws Exception;

    /** 异步回调执行 */
    void execute(Callback<T> callback);

    /** 是否已经执行 */
    boolean isExecuted();

    /** 取消 */
    void cancel();

    /** 是否取消 */
    boolean isCanceled();

    Call<T> clone();

    Request getRequest();
}
