package com.terminal.terminal_androidsdk.core;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.model.Address;
import com.terminal.terminal_androidsdk.core.model.AddressValidation;
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse;
import com.terminal.terminal_androidsdk.core.model.CreateAddress;
import com.terminal.terminal_androidsdk.core.model.GetAddressModel;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalConfiguration;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCreateConfiguration;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalValidateConfiguration;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

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
public class DataCentric {
    private static DataCentric Instance;
    private static Executor executor;

    public static DataCentric getInstance() {
        if (Instance == null) Instance = new DataCentric();
        executor = Executors.newFixedThreadPool(4);
        return Instance;
    }

    public void getAddresses(ITerminalConfiguration terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getAddresses().enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    terminalConfig.onError(Objects.requireNonNull(response.body()).isError(), Objects.requireNonNull(response.body()).getMessage());
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createAddress(ITerminalCreateConfiguration terminalConfig, CreateAddress createAddress) {
        RetrofitClientInstance.getInstance().getDataService().createAddress(createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    terminalConfig.onError(Objects.requireNonNull(response.body()).isError(), Objects.requireNonNull(response.body()).getMessage());
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getAddressesById(ITerminalConfiguration terminalConfig, String addressId) {
        RetrofitClientInstance.getInstance().getDataService().getAddress(addressId).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    terminalConfig.onError(Objects.requireNonNull(response.body()).isError(), Objects.requireNonNull(response.body()).getMessage());
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void validateAddress(ITerminalValidateConfiguration terminalConfig, AddressValidation addressValidation) {
        RetrofitClientInstance.getInstance().getDataService().validateAddresses(addressValidation).enqueue(new Callback<BaseData<AddressValidationResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Response<BaseData<AddressValidationResponse>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    terminalConfig.onError(Objects.requireNonNull(response.body()).isError(), Objects.requireNonNull(response.body()).getMessage());
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
