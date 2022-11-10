package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.CancelShipment;
import com.terminal.terminal_androidsdk.core.model.CreateShipmentResponse;
import com.terminal.terminal_androidsdk.core.model.GetShipmentModelList;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.model.ShipmentRate;
import com.terminal.terminal_androidsdk.core.model.Shipments;
import com.terminal.terminal_androidsdk.core.model.TrackShipmentResponse;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AYODEJI on 08/11/2020.
 *
 */

public class ShipmentRemote {
    private static ShipmentRemote Instance;
    private final String  LOG_TAG =
            ShipmentRemote.class.getSimpleName();
    public static ShipmentRemote getInstance() {
        if (Instance == null) Instance = new ShipmentRemote();
        return Instance;
    }


    public void createShipments(ITerminalConfiguration<CreateShipmentResponse> terminalConfig, Shipments shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().createShipments(shipmentRate).enqueue(new Callback<BaseData<CreateShipmentResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Response<BaseData<CreateShipmentResponse>> response) {
                AppLog.d(LOG_TAG,"createShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificShipment(ITerminalConfiguration<CreateShipmentResponse> terminalConfig, String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificShipment(shipmentId).enqueue(new Callback<BaseData<CreateShipmentResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Response<BaseData<CreateShipmentResponse>> response) {
                AppLog.d(LOG_TAG,"getSpecificShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getSpecificShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void cancelShipmentByID(ITerminalConfiguration<CreateShipmentResponse> terminalConfig, CancelShipment cancelShipment) {
        RetrofitClientInstance.getInstance().getDataService().cancelShipmentByID(cancelShipment).enqueue(new Callback<BaseData<CreateShipmentResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Response<BaseData<CreateShipmentResponse>> response) {
                AppLog.d(LOG_TAG,"cancelShipmentByID" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateShipmentResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"cancelShipmentByID" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getShipments(ITerminalConfiguration<GetShipmentModelList> terminalConfig, int perPage, int page) {
        RetrofitClientInstance.getInstance().getDataService().getShipments(perPage,page).enqueue(new Callback<BaseData<GetShipmentModelList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentModelList>> call, @NonNull Response<BaseData<GetShipmentModelList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentModelList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void trackShipment(ITerminalConfiguration<TrackShipmentResponse> terminalConfig, String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().trackShipment(shipmentId).enqueue(new Callback<BaseData<TrackShipmentResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<TrackShipmentResponse>> call, @NonNull Response<BaseData<TrackShipmentResponse>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<TrackShipmentResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
