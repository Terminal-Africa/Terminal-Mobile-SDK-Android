package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.GetTransactionModelList;
import com.terminal.terminal_androidsdk.core.model.Transaction;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AYODEJI on 10/10/2020.
 */
public class TransactionRemote {

    private static TransactionRemote Instance;
    private String  LOG_TAG =
            TransactionRemote.class.getSimpleName();


    public static TransactionRemote getInstance() {
        if (Instance == null) Instance = new TransactionRemote();
        return Instance;
    }

    public void getTransaction(ITerminalConfiguration<GetTransactionModelList> terminalConfig, String walletID, int perPage, int page) {
        RetrofitClientInstance.getInstance().getDataService().getTransaction(walletID,perPage,page).enqueue(new Callback<BaseData<GetTransactionModelList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetTransactionModelList>> call, @NonNull Response<BaseData<GetTransactionModelList>> response) {
                AppLog.d(LOG_TAG,"getTransaction" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getTransaction",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetTransactionModelList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getTransaction" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificTransaction(ITerminalConfiguration<Transaction> terminalConfig, String transactions_id) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificTransaction(transactions_id).enqueue(new Callback<BaseData<Transaction>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Transaction>> call, @NonNull Response<BaseData<Transaction>> response) {
                AppLog.d(LOG_TAG,"getSpecificTransaction" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getSpecificTransaction",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Transaction>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getSpecificTransaction" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
