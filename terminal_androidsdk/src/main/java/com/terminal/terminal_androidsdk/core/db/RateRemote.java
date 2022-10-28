package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;
import com.terminal.terminal_androidsdk.core.ITerminalRateForShipment;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;
import java.util.List;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RateRemote {
    private static RateRemote Instance;
    private String  LOG_TAG =
            RateRemote.class.getSimpleName();
    public static RateRemote getInstance() {
        if (Instance == null) Instance = new RateRemote();
        return Instance;
    }


    public void getRateForShipment(ITerminalRateForShipment terminalConfig, String parcel_id, String pickup_address,String delivery_address,String currency,String shipment_id) {
        RetrofitClientInstance.getInstance().getDataService().getRateForShipment(parcel_id,pickup_address,delivery_address,currency,shipment_id).enqueue(new Callback<BaseData<List<RateModel>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<RateModel>>> call, @NonNull Response<BaseData<List<RateModel>>> response) {
                AppLog.d(LOG_TAG,"getRateForShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
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
