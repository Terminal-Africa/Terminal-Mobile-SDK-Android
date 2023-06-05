package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.UserBalance;
import com.terminal.terminal_androidsdk.core.model.UserProfile;
import com.terminal.terminal_androidsdk.core.model.component_user.WalletInfo;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientHomeInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserRemote {
    private static UserRemote Instance;
    private String  LOG_TAG =
            UserRemote.class.getSimpleName();
    public static UserRemote getInstance() {
        if (Instance == null) Instance = new UserRemote();
        return Instance;
    }

    public void getUserBalance(ITerminalConfiguration<UserBalance> terminalConfig, String userId) {
        RetrofitClientInstance.getInstance().getDataService().getUserBalance(userId).enqueue(new Callback<BaseData<UserBalance>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<UserBalance>> call, @NonNull Response<BaseData<UserBalance>> response) {
                AppLog.d(LOG_TAG,"getUserBalance" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getUserBalance",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<UserBalance>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUserBalance" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void getUserProfile(ITerminalConfiguration<UserProfile> terminalConfig,String user_id) {
        RetrofitClientInstance.getInstance().getDataService().getUserProfile(user_id).enqueue(new Callback<BaseData<UserProfile>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<UserProfile>> call, @NonNull Response<BaseData<UserProfile>> response) {
                AppLog.d(LOG_TAG,"getUserProfile" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getUserProfile",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<UserProfile>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUserProfile" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getUserWalletInfo(ITerminalConfiguration<WalletInfo> terminalConfig, String user_id) {
        RetrofitClientInstance.getInstance().getDataService().getUserWalletInfo(user_id).enqueue(new Callback<BaseData<WalletInfo>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<WalletInfo>> call, @NonNull Response<BaseData<WalletInfo>> response) {
                AppLog.d(LOG_TAG,"getUserWallet" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getUserWallet",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<WalletInfo>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUserWallet" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }

    public void getHomeUserWalletInfo(ITerminalConfiguration<WalletInfo> terminalConfig, String user_id) {
        RetrofitClientHomeInstance.getInstance().getDataService().getUserWalletInfo(user_id).enqueue(new Callback<BaseData<WalletInfo>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<WalletInfo>> call, @NonNull Response<BaseData<WalletInfo>> response) {
                AppLog.d(LOG_TAG,"getHomeUserWalletInfo" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getUserWallet",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<WalletInfo>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getHomeUserWalletInfo" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }

}
