package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientHomeInstance;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.core.model.Address;
import com.terminal.terminal_androidsdk.core.model.AddressValidation;
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse;
import com.terminal.terminal_androidsdk.core.model.CreateAddress;
import com.terminal.terminal_androidsdk.core.model.GetAddressModel;
import com.terminal.terminal_androidsdk.core.model.UpdateAddress;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import java.util.Objects;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * Created by AYODEJI on 10/10/2020.
 * This is a singleton class in the SDK, which allows only one instance of the class throughout the application
 * lifecycle
 *
 * Connects directly to the backend API
 */
public class AddressRemote {
    private static AddressRemote Instance;
    private String  LOG_TAG =
            AddressRemote.class.getSimpleName();
    public static AddressRemote getInstance() {
        if (Instance == null) Instance = new AddressRemote();
        return Instance;
    }
    public void getAddresses(ITerminalConfiguration<GetAddressModel> terminalConfig, int page, int limit ) {
        RetrofitClientInstance.getInstance().getDataService().getAddresses(page
                 ,limit
        ).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                AppLog.d(LOG_TAG,"getAddresses" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getAddresses",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getAddresses" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getAddressesBySearch(ITerminalConfiguration<GetAddressModel> terminalConfig, int page, String search  ) {
        RetrofitClientInstance.getInstance().getDataService().getAddressesBySearch(page,search//,limit
        ).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                AppLog.d(LOG_TAG,"getAddressesBySearch" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getAddressesBySearch",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getAddresses" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createAddress(ITerminalConfiguration<Address> terminalConfig, CreateAddress createAddress) {
        RetrofitClientInstance.getInstance().getDataService().createAddress(createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                AppLog.d(LOG_TAG,"createHomeAddress" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body().getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("createHomeAddress",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createHomeAddress" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }


    public void createHomeAddress(ITerminalConfiguration<Address> terminalConfig, CreateAddress createAddress) {
        RetrofitClientHomeInstance.getInstance().getDataService().createAddress(createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                AppLog.d(LOG_TAG,"createAddress" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body().getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("createAddress",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createAddress" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }



    public void updateAddress(ITerminalConfiguration<Address> terminalConfig, String address_Id,  UpdateAddress createAddress) {
        String to = new Gson().toJson(createAddress);
        RetrofitClientInstance.getInstance().getDataService().updateAddress(address_Id,createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                AppLog.d(LOG_TAG,"updateAddress" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(Objects.requireNonNull(response.body()).getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("updateAddress",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"updateAddress" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void deleteAddress(ITerminalConfiguration<Address> terminalConfig, String addressId ) {
        RetrofitClientInstance.getInstance().getDataService().deleteAddress(addressId).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                AppLog.d(LOG_TAG,"deleteAddress" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body().getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("deleteAddress",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"deleteAddress" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getAddressesById(ITerminalConfiguration<GetAddressModel> terminalConfig, String addressId) {
        RetrofitClientInstance.getInstance().getDataService().getAddress(addressId).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                AppLog.d(LOG_TAG,"getAddressesById" + response);
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body().getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("getAddressesById",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getAddressesById" + t.getMessage());

                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void validateAddress(ITerminalConfiguration<AddressValidationResponse> terminalConfig, AddressValidation addressValidation) {
        RetrofitClientInstance.getInstance().getDataService().validateAddresses(addressValidation).enqueue(new Callback<BaseData<AddressValidationResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Response<BaseData<AddressValidationResponse>> response) {
                AppLog.d(LOG_TAG,"validateAddress" + response);

                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body().getData()));
                } else {
                    try {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                    }catch (Exception e){
                        AppLog.e("validateAddress",e.getLocalizedMessage());
                        terminalConfig.onError(false, "");
                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"validateAddress" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
