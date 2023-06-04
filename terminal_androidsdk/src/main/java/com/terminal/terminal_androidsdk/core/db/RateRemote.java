package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.MultiShipmentRate;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.model.ShipRates;
import com.terminal.terminal_androidsdk.core.model.ShipmentRate;
import com.terminal.terminal_androidsdk.core.model.component_getship.Rate;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientHomeInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;
import java.util.List;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
public class RateRemote {
    private static RateRemote Instance;
    private final String  LOG_TAG =
            RateRemote.class.getSimpleName();
    public static RateRemote getInstance() {
        if (Instance == null) Instance = new RateRemote();
        return Instance;
    }

    public void getRateForShipment(ITerminalConfiguration<List<RateModel>> terminalConfig,  ShipmentRate shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().getRateForShipment(shipmentRate.getParcel_id(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address(),shipmentRate.getCurrency().name(),shipmentRate.getShipment_id()).enqueue(new Callback<BaseData<List<RateModel>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<RateModel>>> call, @NonNull Response<BaseData<List<RateModel>>> response) {
                AppLog.d(LOG_TAG,"getRateForShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getRateForShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<RateModel>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getRateForShipment(ITerminalConfiguration<List<Rate>> terminalConfig,String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().getRateForShipmentHome(shipmentId).enqueue(new Callback<BaseData<List<Rate>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Response<BaseData<List<Rate>>> response) {
                AppLog.d(LOG_TAG,"getRateForShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getRateForShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getRateForMultiShipment(ITerminalConfiguration<List<Rate>> terminalConfig,  MultiShipmentRate shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().getRateForMultiShipment(shipmentRate.getParcels(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address(),shipmentRate.getCurrency().name(),shipmentRate.getShipment_id()).enqueue(new Callback<BaseData<List<Rate>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Response<BaseData<List<Rate>>> response) {
                AppLog.d(LOG_TAG,"getRateForMultiShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getRateForMultiShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForMultiShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void getRateForShipmentHome(ITerminalConfiguration<List<Rate>> terminalConfig, ShipmentRate shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().getRateForShipmentHome(shipmentRate.getParcel_id(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address()).enqueue(new Callback<BaseData<List<Rate>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Response<BaseData<List<Rate>>> response) {
                AppLog.d(LOG_TAG,"getRateForShipmentHome" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                         AppLog.e("getRateForShipmentHome",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForShipmentHome" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getRateForHomeShipmentHome(ITerminalConfiguration<List<Rate>> terminalConfig, ShipmentRate shipmentRate) {
        RetrofitClientHomeInstance.getInstance().getDataService().getRateForShipmentHome(shipmentRate.getParcel_id(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address()).enqueue(new Callback<BaseData<List<Rate>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Response<BaseData<List<Rate>>> response) {
                AppLog.d(LOG_TAG,"getRateForHomeShipmentHome" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getRateForHomeShipmentHome",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForHomeShipmentHome" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void gotoGetShipmentShip(ITerminalConfiguration<List<Rate>> terminalConfig, ShipmentRate shipmentRate) {
        RetrofitClientHomeInstance.getInstance().getDataService().gotoGetShipmentShip(shipmentRate.getParcel_id(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address()).enqueue(new Callback<BaseData<List<Rate>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Response<BaseData<List<Rate>>> response) {
                AppLog.d(LOG_TAG,"gotoGetShipmentShip" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("gotoGetShipmentShip",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<Rate>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"gotoGetShipmentShip" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


}
