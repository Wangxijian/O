
package com.wxj.o.callback;

import com.wxj.o.convert.StringConvert;

import okhttp3.Response;

/**
 * 返回字符串类型的数据
 */
public abstract class StringCallback extends AbsCallback<String> {

    private StringConvert convert;

    public StringCallback() {
        convert = new StringConvert();
    }

    @Override
    public String convertResponse(Response response) throws Throwable {
        String s = convert.convertResponse(response);
        response.close();
        return s;
    }
}
