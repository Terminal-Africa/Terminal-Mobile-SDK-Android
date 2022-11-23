package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.model.ShipmentRate;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModel;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModelList;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetEnableCarriers;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CarriesRemote {
    private static CarriesRemote Instance;
    private String  LOG_TAG =
            CarriesRemote.class.getSimpleName();
    public static CarriesRemote getInstance() {
        if (Instance == null) Instance = new CarriesRemote();
        return Instance;
    }

    public void getShipCarries(ITerminalConfiguration<GetCarriesModelList> terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getShipCarries().enqueue(new Callback<BaseData<GetCarriesModelList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetCarriesModelList>> call, @NonNull Response<BaseData<GetCarriesModelList>> response) {
                AppLog.d(LOG_TAG,"getShipCarries" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetCarriesModelList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipCarries" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void getSpecificShipCarries(ITerminalConfiguration<GetCarriesModel> terminalConfig, String shipCarrierId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificShipCarrier(shipCarrierId).enqueue(new Callback<BaseData<GetCarriesModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Response<BaseData<GetCarriesModel>> response) {
                AppLog.d(LOG_TAG,"getSpecificShipCarries" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getSpecificShipCarries" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getEnabledShipCarries(ITerminalConfiguration<GetEnableCarriers> terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getEnabledShipCarrier().enqueue(new Callback<BaseData<GetEnableCarriers>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetEnableCarriers>> call, @NonNull Response<BaseData<GetEnableCarriers>> response) {
                AppLog.d(LOG_TAG,"getEnabledShipCarries" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetEnableCarriers>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getEnabledShipCarries" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void enableShipCarries(ITerminalConfiguration<GetCarriesModel> terminalConfig, String carriers_ID, boolean domestic, boolean international, boolean regional) {
        RetrofitClientInstance.getInstance().getDataService().enableShipCarrier(carriers_ID,domestic, international, regional).enqueue(new Callback<BaseData<GetCarriesModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Response<BaseData<GetCarriesModel>> response) {
                AppLog.d(LOG_TAG,"enabledShipCarries" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"enabledShipCarries" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void disableShipCarries(ITerminalConfiguration<GetCarriesModel> terminalConfig,String carriers_ID, boolean domestic, boolean international, boolean regional) {
        RetrofitClientInstance.getInstance().getDataService().disabledShipCarrier(carriers_ID,domestic, international, regional).enqueue(new Callback<BaseData<GetCarriesModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Response<BaseData<GetCarriesModel>> response) {
                AppLog.d(LOG_TAG,"disabledShipCarries" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetCarriesModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"disabledShipCarries" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
