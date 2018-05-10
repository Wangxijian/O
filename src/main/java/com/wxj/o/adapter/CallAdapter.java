
package com.wxj.o.adapter;

/**
 * 返回值的适配器
 */
public interface CallAdapter<T, R> {

    /** call执行的代理方法 */
    R adapt(Call<T> call, AdapterParam param);
}
