package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.model.ShipmentRate;
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
 * Created by AYODEJI on 10/10/2020.
 *
 */
public class RateRemote {
    private static RateRemote Instance;
    private String  LOG_TAG =
            RateRemote.class.getSimpleName();
    public static RateRemote getInstance() {
        if (Instance == null) Instance = new RateRemote();
        return Instance;
    }


    public void getRateForShipment(ITerminalConfiguration<List<RateModel>> terminalConfig,  ShipmentRate shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().getRateForShipment(shipmentRate.getParcel_id(),shipmentRate.getPickup_address(),shipmentRate.getDelivery_address(),shipmentRate.getCurrency(),shipmentRate.getShipment_id()).enqueue(new Callback<BaseData<List<RateModel>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<RateModel>>> call, @NonNull Response<BaseData<List<RateModel>>> response) {
                AppLog.d(LOG_TAG,"getRateForShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<RateModel>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getRateForShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
