package com.wxj.o.request;

import com.wxj.o.model.HttpMethod;
import com.wxj.o.request.base.BodyRequest;

import okhttp3.Request;
import okhttp3.RequestBody;


public class OptionsRequest<T> extends BodyRequest<T, OptionsRequest<T>> {

    public OptionsRequest(String url) {
        super(url);
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.OPTIONS;
    }

    @Override
    public Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = generateRequestBuilder(requestBody);
        return requestBuilder.method("OPTIONS", requestBody).url(url).tag(tag).build();
    }
}
