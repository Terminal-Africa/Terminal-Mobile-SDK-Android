package com.terminal.terminal_androidsdk.core.network;

import static com.terminal.terminal_androidsdk.utils.Constant.BASE_TERMINAL_LIVE_UTIL;

import android.util.Log;

import com.terminal.terminal_androidsdk.core.iinterface.GetTerminalUtilsService;
import com.terminal.terminal_androidsdk.utils.MemoryManager;

import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
public class RetrofitTerminalUtilsClientInstance {
    private static RetrofitTerminalUtilsClientInstance mInstance;
    private  Retrofit mRetrofit;

    private RetrofitTerminalUtilsClientInstance() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        authorization = MemoryManager.getInstance().getSecretKey() != null ? MemoryManager.getInstance().getSecretKey(): "";
        Log.d("AAA",authorization);
        String authValue = "Bearer " + authorization;
        Interceptor authInterceptor = chain -> {
            Request newRequest = chain.request().newBuilder()
                    .addHeader("Authorization", authValue)
                    .addHeader("content-type", "application/json")
                    .addHeader("source", "android")
                    .build();
            return chain.proceed(newRequest);
        };

        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.readTimeout(2, TimeUnit.MINUTES);
        okHttpBuilder.connectTimeout(2, TimeUnit.MINUTES);
        okHttpBuilder.addInterceptor(authInterceptor);
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_TERMINAL_LIVE_UTIL)
                .client(okHttpBuilder.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitTerminalUtilsClientInstance getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitTerminalUtilsClientInstance();
        }
        return mInstance;
    }

    public GetTerminalUtilsService getDataService() {
        return mRetrofit.create(GetTerminalUtilsService.class);
    }

    private String authorization;

    public void reset() {
        mInstance = null;
        getInstance();
    }
}
