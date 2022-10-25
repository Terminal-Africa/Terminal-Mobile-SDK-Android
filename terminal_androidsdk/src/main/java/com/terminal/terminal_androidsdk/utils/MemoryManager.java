package com.terminal.terminal_androidsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.terminal.terminal_androidsdk.MainApplication;

public class MemoryManager {

    private static MemoryManager sInstance;
    private final SharedPreferences mSharedPreferences;
    private final SharedPreferences.Editor editor;
    private static final String PREF_NAME = "terminal_sdk_app";
    private static final int PREF_MODE = 0;
    private static final String KEY_USER1 = "user1";
    private static final String KEY_FCM_TO_SERVER = "fcm_token_to_server";


    private static final String KEY_AUTH_TOKEN = "auth_token";
    private static final String FIRD_TIME_LAUNCH = "first_time";
    private static final String KEY_IS_LIVE_TOKEN = "is_live";

    private static final String KEY_KEEP_STATE = "keep_state";





    private MemoryManager() {
        mSharedPreferences = MainApplication.getInstance().getApplicationContext()
                .getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        editor = mSharedPreferences.edit();
    }

    public static synchronized MemoryManager getInstance() {
        if (sInstance == null) sInstance = new MemoryManager();
        return sInstance;
    }


    public String getSecretKey() {
        if (mSharedPreferences.getString(KEY_USER1, null) != null) {
            String secretKey = mSharedPreferences.getString(KEY_USER1, null);
            return secretKey;
        }
        return null;
    }

    public void putUserSecretKey(String secretKey) {
        editor.putString(KEY_USER1, secretKey);
        editor.commit();
    }


    public boolean isSecretActivated(){ return mSharedPreferences.contains(KEY_USER1);}


    public void putIsLive(boolean value) {
        editor.putBoolean(KEY_IS_LIVE_TOKEN, value);
        editor.commit();
    }
    public boolean getIsLive(){ return mSharedPreferences.getBoolean(KEY_IS_LIVE_TOKEN,false); }

    public boolean isActivated(){ return mSharedPreferences.contains(KEY_IS_LIVE_TOKEN);}


    public void keepPickState(String value){
        editor.putString(KEY_KEEP_STATE,value);
        editor.commit();
    }

    public String getKeepedState(){
        return  mSharedPreferences.getString(KEY_KEEP_STATE, null);
    }



    public void setFCMTokenSavedToServer(boolean value) {
        editor.putBoolean(KEY_FCM_TO_SERVER, value).apply();
    }

    public boolean isFCMTokenSavedToServer() {
        return mSharedPreferences.getBoolean(KEY_FCM_TO_SERVER, false);
    }

    public String getToken() {
        return mSharedPreferences.getString(KEY_AUTH_TOKEN, "");
    }

    public void putToken(String token) {
        editor.putString(KEY_AUTH_TOKEN, token).apply();
    }

    public void signOut() {
        editor.clear().apply();
        MainApplication.getExecutorService().execute(new Runnable() {
            @Override
            public void run() {
                //AppDatabase.getDatabase().clearAllTables();
            }
        });
    }

    public void setFirstTimeLaunch(boolean b) {
        editor.putBoolean(FIRD_TIME_LAUNCH, b).apply();
    }

    public boolean getFirstTimeLaunch() {
        return mSharedPreferences.getBoolean(FIRD_TIME_LAUNCH, false);
    }
}
