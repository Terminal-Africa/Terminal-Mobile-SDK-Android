package com.terminal.terminal_androidsdk.core.network;

import static com.terminal.terminal_androidsdk.utils.Constant.BASE_TER_LIVE_URL;
import static com.terminal.terminal_androidsdk.utils.Constant.BASE_TER_TEST_URL;

import android.util.Log;

import com.terminal.terminal_androidsdk.core.iinterface.GetTerminalDataService;
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
public class RetrofitMerchantInstance {
    private static RetrofitMerchantInstance mInstance;
    private  Retrofit mRetrofit;


    private RetrofitMerchantInstance() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        authorization = MemoryManager.getInstance().getSecretKey() != null ? MemoryManager.getInstance().getSecretKey(): "";
        boolean isLive =  MemoryManager.getInstance().getIsLive();
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
        if(isLive){
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_TER_LIVE_URL)
                    .client(okHttpBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        } else {
            mRetrofit = new Retrofit.Builder()
                    .baseUrl(BASE_TER_TEST_URL)
                    .client(okHttpBuilder.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static synchronized RetrofitMerchantInstance getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitMerchantInstance();
        }
        return mInstance;
    }

    public GetTerminalDataService getDataService() {
        return mRetrofit.create(GetTerminalDataService.class);
    }

    private String authorization;

    public void reset() {
        mInstance = null;
        getInstance();
    }
}
