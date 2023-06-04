package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.utils.TerminalRealMerchant;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitTerminalUtilsClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UtilRemote {
    private static UtilRemote Instance;
    private String  LOG_TAG =
            UtilRemote.class.getSimpleName();
    public static UtilRemote getInstance() {
        if (Instance == null) Instance = new UtilRemote();
        return Instance;
    }

    public void getUtilsData(ITerminalConfiguration<TerminalRealMerchant> terminalConfig) {
        RetrofitTerminalUtilsClientInstance.getInstance().getDataService().getUtilsData().enqueue(new Callback<BaseData<TerminalRealMerchant>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<TerminalRealMerchant>> call, @NonNull Response<BaseData<TerminalRealMerchant>> response) {
                AppLog.d(LOG_TAG,"getUtilsData" + response);
                if (response.isSuccessful()) {
                     terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getUtilsData",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<TerminalRealMerchant>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getUtilsData" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }

}
