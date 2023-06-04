package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.model.ArrangePickupAndDelivery;
import com.terminal.terminal_androidsdk.core.model.CancelShipment;
import com.terminal.terminal_androidsdk.core.model.GetShipmentModelList;
import com.terminal.terminal_androidsdk.core.model.GetShipmentPopulateList;
import com.terminal.terminal_androidsdk.core.model.Shipments;
import com.terminal.terminal_androidsdk.core.model.ShopShipments;
import com.terminal.terminal_androidsdk.core.model.claims.FIleAClaim;
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateShipmentRes;
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateShopShipmentRes;
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateSummaryShipmentRes;
import com.terminal.terminal_androidsdk.core.model.component_shipment.DeleteDraft;
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentUnpopulated;
import com.terminal.terminal_androidsdk.core.model.component_track.TrackShipmentRes;
import com.terminal.terminal_androidsdk.core.model.insurance.CheckInsurance;
import com.terminal.terminal_androidsdk.core.model.insurance.CheckInsuranceResponse;
import com.terminal.terminal_androidsdk.core.model.shopandship.ArrangePickupShopResponse;
import com.terminal.terminal_androidsdk.core.model.shopandship.ArrangePickupShopSh;
import com.terminal.terminal_androidsdk.core.model.shopandship.MakeChargeResponse;
import com.terminal.terminal_androidsdk.core.model.utils.SuccessModel;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientHomeInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

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


    public void updateDraftShipments(ITerminalConfiguration<CreateSummaryShipmentRes> terminalConfig, Shipments shipmentRate,String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().updateDraftShipments(shipmentRate,shipmentId).enqueue(new Callback<BaseData<CreateSummaryShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Response<BaseData<CreateSummaryShipmentRes>> response) {
                AppLog.d(LOG_TAG,"createShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("createShipments",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createShipments(ITerminalConfiguration<CreateSummaryShipmentRes> terminalConfig, Shipments shipmentRate) {
        shipmentRate.setSource("android");
        RetrofitClientInstance.getInstance().getDataService().createShipments(shipmentRate).enqueue(new Callback<BaseData<CreateSummaryShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Response<BaseData<CreateSummaryShipmentRes>> response) {
                AppLog.d(LOG_TAG,"createShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("createShipments",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createShipments(ITerminalConfiguration<CreateSummaryShipmentRes> terminalConfig, ShopShipments shipmentRate) {
        RetrofitClientInstance.getInstance().getDataService().createShipments(shipmentRate).enqueue(new Callback<BaseData<CreateSummaryShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Response<BaseData<CreateSummaryShipmentRes>> response) {
                AppLog.d(LOG_TAG,"createShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("createShipments",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateSummaryShipmentRes>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void getSpecificShipment(ITerminalConfiguration<CreateShipmentRes> terminalConfig, String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificShipment(shipmentId).enqueue(new Callback<BaseData<CreateShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateShipmentRes>> call, @NonNull Response<BaseData<CreateShipmentRes>> response) {
                AppLog.d(LOG_TAG,"getSpecificShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        //AppLog.e("getSpecificShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                  }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateShipmentRes>> call, @NonNull Throwable t) {
                   // AppLog.d(LOG_TAG,"getSpecificShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificShopShipment(ITerminalConfiguration<CreateShopShipmentRes> terminalConfig, String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificShopShipment(shipmentId).enqueue(new Callback<BaseData<CreateShopShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CreateShopShipmentRes>> call, @NonNull Response<BaseData<CreateShopShipmentRes>> response) {
                AppLog.d(LOG_TAG,"getSpecificShopShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        //AppLog.e("getSpecificShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CreateShopShipmentRes>> call, @NonNull Throwable t) {
                // AppLog.d(LOG_TAG,"getSpecificShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void deleteDraftShipment(ITerminalConfiguration<SuccessModel> terminalConfig,String  shipmentId) {
        DeleteDraft deleteDraft = new DeleteDraft(shipmentId);
        RetrofitClientInstance.getInstance().getDataService().deleteDraftShipment(deleteDraft).enqueue(new Callback<BaseData<SuccessModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<SuccessModel>> call, @NonNull Response<BaseData<SuccessModel>> response) {
                AppLog.d(LOG_TAG,"deleteDraftShipment" + response);
                if (response.isSuccessful()) {
                    SuccessModel successModel = new SuccessModel(Objects.requireNonNull(response.body()).isError(),response.body().getMessage(),deleteDraft.shipment_id, 0);
                    AppLog.d(LOG_TAG,"deleteDraftShipment" + response);
                    terminalConfig.onResponse(successModel);
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());

                    }catch (Exception e){
                        AppLog.e("deleteDraftShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }

            }
            @Override
            public void onFailure(@NonNull Call<BaseData<SuccessModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"fileAClaim" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void cancelShipmentByID(ITerminalConfiguration<ShipmentUnpopulated> terminalConfig, CancelShipment cancelShipment) {
        RetrofitClientInstance.getInstance().getDataService().cancelShipmentByID(cancelShipment).enqueue(new Callback<BaseData<ShipmentUnpopulated>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ShipmentUnpopulated>> call, @NonNull Response<BaseData<ShipmentUnpopulated>> response) {
                AppLog.d(LOG_TAG,"cancelShipmentByID" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("cancelShipmentByID",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ShipmentUnpopulated>> call, @NonNull Throwable t) {
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
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getShipments",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentModelList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getShipmentsPopulate(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page) {
          RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulate(perPage,page,true).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getShipments",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });

    }

    public void getShipmentsPopulateStatus(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulateStatus(perPage,page,true,status).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                        try {
                            BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                            terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                        }catch (Exception e){
                            AppLog.d(LOG_TAG,"getShipments" + e.getMessage());
                            terminalConfig.onError(false,"");
                        }
                        }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getShipmentsPopulateStatusCancelled(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulateStatus(perPage,page,true,status).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.d(LOG_TAG,"getShipments" + e.getMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }
    public void getShipmentsPopulateStatusComplete(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulateStatus(perPage,page,true,status).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.d(LOG_TAG,"getShipments" + e.getMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }
    public void getShipmentsPopulateStatusConfirmed(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulateStatus(perPage,page,true,status).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.d(LOG_TAG,"getShipments" + e.getMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getShipmentsPopulateStatusOngoing(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulateStatus(perPage,page,true,status).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipments" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.d(LOG_TAG,"getShipments" + e.getMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getShipmentsPopulateStatusAll(ITerminalConfiguration<GetShipmentPopulateList> terminalConfig, int perPage, int page,String status) {
        RetrofitClientInstance.getInstance().getDataService().getShipmentsPopulate(perPage,page,true).enqueue(new Callback<BaseData<GetShipmentPopulateList>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Response<BaseData<GetShipmentPopulateList>> response) {
                AppLog.d(LOG_TAG,"getShipmentsPopulateStatusAll" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.d(LOG_TAG,"getShipmentsPopulateStatusAll" + e.getMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetShipmentPopulateList>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getShipments" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void trackShipment(ITerminalConfiguration<TrackShipmentRes> terminalConfig, String shipmentId) {
        RetrofitClientInstance.getInstance().getDataService().trackShipment(shipmentId).enqueue(new Callback<BaseData<TrackShipmentRes>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<TrackShipmentRes>> call, @NonNull Response<BaseData<TrackShipmentRes>> response) {
                AppLog.d(LOG_TAG,"trackShipment" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("trackShipment",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<TrackShipmentRes>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"trackShipment" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void checkInsuranceStand(ITerminalConfiguration<CheckInsuranceResponse> terminalConfig, CheckInsurance checkInsurance) {
        RetrofitClientInstance.getInstance().getDataService().checkInsuranceStand(checkInsurance).enqueue(new Callback<BaseData<CheckInsuranceResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<CheckInsuranceResponse>> call, @NonNull Response<BaseData<CheckInsuranceResponse>> response) {
                AppLog.d(LOG_TAG,"checkInsuranceStand" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("checkInsuranceStand",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<CheckInsuranceResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"checkInsuranceStand" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void arrangePickupAndDelivery(ITerminalConfiguration<ShipmentUnpopulated> terminalConfig, ArrangePickupAndDelivery andDelivery) {
        RetrofitClientInstance.getInstance().getDataService().ArrangePickupDelivery(andDelivery).enqueue(new Callback<BaseData<ShipmentUnpopulated>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ShipmentUnpopulated>> call, @NonNull Response<BaseData<ShipmentUnpopulated>> response) {
                AppLog.d(LOG_TAG,"arrangePickupAndDelivery" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("arrangePickupAndDelivery",e.getLocalizedMessage());
                        terminalConfig.onError(false,"Failed to Arrange Shipment");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ShipmentUnpopulated>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"arrangePickupAndDelivery" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void arrangePickupAndDelivery(ITerminalConfiguration<ArrangePickupShopResponse> terminalConfig, ArrangePickupShopSh andDelivery) {
        RetrofitClientInstance.getInstance().getDataService().arrangePickupDelivery(andDelivery).enqueue(new Callback<BaseData<ArrangePickupShopResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<ArrangePickupShopResponse>> call, @NonNull Response<BaseData<ArrangePickupShopResponse>> response) {
                AppLog.d(LOG_TAG,"arrangePickupAndDelivery" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("arrangePickupAndDelivery",e.getLocalizedMessage());
                        terminalConfig.onError(false,"Failed to Arrange Shipment");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<ArrangePickupShopResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"arrangePickupAndDelivery" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void fileAClaim(ITerminalConfiguration<SuccessModel> terminalConfig, FIleAClaim fIleAClaim) {
        RetrofitClientInstance.getInstance().getDataService().FileAClaim(fIleAClaim).enqueue(new Callback<BaseData<SuccessModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<SuccessModel>> call, @NonNull Response<BaseData<SuccessModel>> response) {
                AppLog.d(LOG_TAG,"fileAClaim" + response);
                if (response.isSuccessful()) {
                    SuccessModel successModel = new SuccessModel(Objects.requireNonNull(response.body()).isError(),response.body().getMessage(),fIleAClaim.insurance, 0);
                    AppLog.d(LOG_TAG,"fileAClaim" + response);
                    terminalConfig.onResponse(successModel);
                } else {
                    try {
                        BaseData<?> errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());

                    }catch (Exception e){
                        AppLog.e("fileAClaim",e.getLocalizedMessage());
                        terminalConfig.onError(false,"");
                    }
                }

            }
            @Override
            public void onFailure(@NonNull Call<BaseData<SuccessModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"fileAClaim" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


}
