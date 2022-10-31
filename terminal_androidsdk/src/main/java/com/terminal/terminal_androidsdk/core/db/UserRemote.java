package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.UserBalance;
import com.terminal.terminal_androidsdk.core.model.UserProfile;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.List;
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
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<UserBalance>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUserBalance" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getUserProfile(ITerminalConfiguration<List<UserProfile>> terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getUserProfile().enqueue(new Callback<BaseData<List<UserProfile>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<UserProfile>>> call, @NonNull Response<BaseData<List<UserProfile>>> response) {
                AppLog.d(LOG_TAG,"getUserProfile" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<UserProfile>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUserProfile" + t.getMessage());

                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


}
