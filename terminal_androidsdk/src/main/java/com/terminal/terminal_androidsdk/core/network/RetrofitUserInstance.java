package com.terminal.terminal_androidsdk.core.network;

import static com.terminal.terminal_androidsdk.utils.Constant.BASE_LIVE_URL;
import static com.terminal.terminal_androidsdk.utils.Constant.BASE_TEST_URL;
import com.terminal.terminal_androidsdk.core.iinterface.GetTerminalUserService;
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
public class RetrofitUserInstance {
    private static RetrofitUserInstance mInstance;
    private  Retrofit mRetrofit;

    private RetrofitUserInstance() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        authorization = MemoryManager.getInstance().getStoreKey() != null ? MemoryManager.getInstance().getStoreKey(): "";
        boolean isLive =  MemoryManager.getInstance().getIsLive();
        Interceptor authInterceptor = chain -> {
            Request newRequest = chain.request().newBuilder()
                    .header("content-type", "application/json")
                    .addHeader("source", "android")
                    .build();
            return chain.proceed(newRequest);
        };

        OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
        okHttpBuilder.readTimeout(2, TimeUnit.MINUTES);
        okHttpBuilder.connectTimeout(2, TimeUnit.MINUTES);
        okHttpBuilder.addInterceptor(authInterceptor);
        if(isLive){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_LIVE_URL)
                    .client(okHttpBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } else {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_TEST_URL)
                    .client(okHttpBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static synchronized RetrofitUserInstance getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitUserInstance();
        }
        return mInstance;
    }

    public GetTerminalUserService getDataService() {
        return mRetrofit.create(GetTerminalUserService.class);
    }

    private String authorization;

    public void reset() {
        mInstance = null;
        getInstance();
    }
}
