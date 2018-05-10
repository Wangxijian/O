package com.wxj.o.request;

import com.wxj.o.model.HttpMethod;
import com.wxj.o.request.base.NoBodyRequest;

import okhttp3.Request;
import okhttp3.RequestBody;


public class HeadRequest<T> extends NoBodyRequest<T, HeadRequest<T>> {

    public HeadRequest(String url) {
        super(url);
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.HEAD;
    }

    @Override
    public okhttp3.Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = generateRequestBuilder(requestBody);
        return requestBuilder.head().url(url).tag(tag).build();
    }
}
