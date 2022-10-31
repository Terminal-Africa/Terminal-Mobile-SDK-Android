package com.terminal.terminal_androidsdk.core.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
public class BaseData<T> {


    @SerializedName("status")
    @Expose
    private boolean error;

    @SerializedName("message")
    @Expose
    private String message = "";

    @SerializedName("data")
    @Expose
    private T data = null;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseData(T data) {
        setData(data);
        setError(false);
        setMessage("");
    }

    public BaseData(String message) {
        setError(true);
        setMessage(message);
        setData(null);
    }
}