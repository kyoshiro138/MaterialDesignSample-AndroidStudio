package com.jp.materialdesignsample.service.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse<T> {
    @JsonProperty("status")
    private boolean mStatus;

    @JsonProperty("message")
    private String mMessage;

    @JsonProperty("data")
    private T mData;

    public boolean getResponseStatus() {
        return mStatus;
    }

    public String getMessage() {
        return mMessage;
    }

    public T getData() {
        return mData;
    }
}
