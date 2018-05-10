package com.wxj.o.request;

import com.wxj.o.model.HttpMethod;
import com.wxj.o.request.base.NoBodyRequest;

import okhttp3.Request;
import okhttp3.RequestBody;


public class GetRequest<T> extends NoBodyRequest<T, GetRequest<T>> {

    public GetRequest(String url) {
        super(url);
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }

    @Override
    public okhttp3.Request generateRequest(RequestBody requestBody) {
        Request.Builder requestBuilder = generateRequestBuilder(requestBody);
        return requestBuilder.get().url(url).tag(tag).build();
    }
}
