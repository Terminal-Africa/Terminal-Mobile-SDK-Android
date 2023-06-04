package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.CreateParcel;
import com.terminal.terminal_androidsdk.core.model.GetPackagingList;
import com.terminal.terminal_androidsdk.core.model.GetParcelModelList;
import com.terminal.terminal_androidsdk.core.model.ParcelResponse;
import com.terminal.terminal_androidsdk.core.model.UpdateParcelModel;
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
public class ParcelRemote{

    private static ParcelRemote Instance;
    private final String  LOG_TAG =
            ParcelRemote.class.getSimpleName();


    public static ParcelRemote getInstance() {
        if (Instance == null) Instance = new ParcelRemote();
        return Instance;
    }

    public void getParcels(ITerminalConfiguration<GetParcelModelList> terminalConfig, int perPage, int page) {
        RetrofitClientInstance.getInstance().getDataService().getParcels(perPage,page).enqueue(new Callback<BaseData<GetParcelModelList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetParcelModelList>> call, @NonNull Response<BaseData<GetParcelModelList>> response) {
                AppLog.d(LOG_TAG,"getParcels" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetParcelModelList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getParcels" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificParcel(ITerminalConfiguration<ParcelResponse> terminalConfig, String parcelId) {
        RetrofitClientInstance.getInstance().getDataService().getParcel(parcelId).enqueue(new Callback<BaseData<ParcelResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Response<BaseData<ParcelResponse>> response) {
                AppLog.d(LOG_TAG,"getSpecificParcel" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getSpecificParcel" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void updateParcel(ITerminalConfiguration<ParcelResponse> terminalConfig, String parcelId,UpdateParcelModel updateParcelModel) {
        RetrofitClientInstance.getInstance().getDataService().updateParcel(parcelId,updateParcelModel).enqueue(new Callback<BaseData<ParcelResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Response<BaseData<ParcelResponse>> response) {
                AppLog.d(LOG_TAG,"updateParcel" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"updateParcel" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createParcel(ITerminalConfiguration<ParcelResponse> terminalConfig, CreateParcel createParcel) {
        RetrofitClientInstance.getInstance().getDataService().createParcel(createParcel).enqueue(new Callback<BaseData<ParcelResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Response<BaseData<ParcelResponse>> response) {
                AppLog.d(LOG_TAG,"createParcel" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ParcelResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createParcel" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


}
