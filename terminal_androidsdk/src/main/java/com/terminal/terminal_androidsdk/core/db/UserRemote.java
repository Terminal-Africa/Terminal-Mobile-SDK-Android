package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.UserBalance;
import com.terminal.terminal_androidsdk.core.model.UserProfile;
import com.terminal.terminal_androidsdk.core.model.component_user.FetchProfileResponse;
import com.terminal.terminal_androidsdk.core.model.component_user.ResetPassword;
import com.terminal.terminal_androidsdk.core.model.component_user.SignUpResponse;
import com.terminal.terminal_androidsdk.core.model.component_user.SignUpUser;
import com.terminal.terminal_androidsdk.core.model.component_user.UpdateProfile;
import com.terminal.terminal_androidsdk.core.model.component_user.VerifyBvn;
import com.terminal.terminal_androidsdk.core.model.component_user.VerifyKYC;
import com.terminal.terminal_androidsdk.core.model.component_user.VerifyKYCResponse;
import com.terminal.terminal_androidsdk.core.model.component_user.WalletInfo;
import com.terminal.terminal_androidsdk.core.model.utils.SuccessModel;
import com.terminal.terminal_androidsdk.core.model.utils.UpdateToken;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientHomeInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitMerchantInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitTerminalClientInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitUserInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;
import com.terminal.terminal_androidsdk.utils.MemoryManager;

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

    public void fetchUserProfile(ITerminalConfiguration<FetchProfileResponse> terminalConfig, String userId) {
            RetrofitUserInstance.getInstance().getDataService().fetchUserProfile(MemoryManager.getInstance().getStoreKey(),userId).enqueue(new Callback<BaseData<FetchProfileResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<FetchProfileResponse>> call, @NonNull Response<BaseData<FetchProfileResponse>> response) {
                AppLog.d(LOG_TAG,"fetchUserProfile" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("fetchUserProfile",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<FetchProfileResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"fetchUserProfile" + t.getMessage());
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

    public void updateUserProfile(ITerminalConfiguration<FetchProfileResponse> terminalConfig, UpdateProfile signUpUser) {
        RetrofitClientInstance.getInstance().getDataService().updateProfile(signUpUser).enqueue(new Callback<BaseData<FetchProfileResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<FetchProfileResponse>> call, @NonNull Response<BaseData<FetchProfileResponse>> response) {
                AppLog.d(LOG_TAG,"updateUserProfile" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("updateUserProfile",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<FetchProfileResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"updateUserProfile" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }
}
