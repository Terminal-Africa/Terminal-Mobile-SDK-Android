package com.terminal.terminal_androidsdk;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * Created by AYODEJI on 10/10/2020.
 * This is the start of the application used in getting a good turn context as well as network connectivity
 *
 */
public class MainApplication extends Application {


    private static final ExecutorService executorService = Executors.newCachedThreadPool();
    private static MainApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public static ExecutorService getExecutorService() {
        return executorService;
    }

    public static MainApplication getInstance() {
        return instance;
    }

    public static boolean isConnectionActive(Context contexts) {
        ConnectivityManager connectivityManager = (ConnectivityManager) contexts.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnected();
    }

}
