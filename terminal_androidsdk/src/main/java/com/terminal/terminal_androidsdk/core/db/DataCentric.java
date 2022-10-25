package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCities;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCountries;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalPackaging;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalPackagingList;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalStates;
import com.terminal.terminal_androidsdk.core.model.Address;
import com.terminal.terminal_androidsdk.core.model.AddressValidation;
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse;
import com.terminal.terminal_androidsdk.core.model.CreateAddress;
import com.terminal.terminal_androidsdk.core.model.GetAddressModel;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalAddress;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCreate;
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalValidate;
import com.terminal.terminal_androidsdk.core.model.Packaging;
import com.terminal.terminal_androidsdk.core.model.PackagingResponse;
import com.terminal.terminal_androidsdk.core.model.TerminalCities;
import com.terminal.terminal_androidsdk.core.model.TerminalCountries;
import com.terminal.terminal_androidsdk.core.model.TerminalStates;

import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.List;
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

    private  BaseData getBaseError(Response response){
        Gson gson = new Gson();
        Type type = new TypeToken<BaseData>() {}.getType();
        BaseData errorResponse = gson.fromJson(Objects.requireNonNull(response.errorBody()).charStream(),type);
       return  errorResponse;
    }

    public void getAddresses(ITerminalAddress terminalConfig, int page, int limit ) {
        RetrofitClientInstance.getInstance().getDataService().getAddresses(page,limit).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void createAddress(ITerminalCreate terminalConfig, CreateAddress createAddress) {
        RetrofitClientInstance.getInstance().getDataService().createAddress(createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void updateAddress(ITerminalCreate terminalConfig, String address_Id, CreateAddress createAddress) {
        RetrofitClientInstance.getInstance().getDataService().updateAddress(address_Id,createAddress).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void deleteAddress(ITerminalCreate terminalConfig, String addressId ) {
        RetrofitClientInstance.getInstance().getDataService().deleteAddress(addressId).enqueue(new Callback<BaseData<Address>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<Address>> call, @NonNull Response<BaseData<Address>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<Address>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getAddressesById(ITerminalAddress terminalConfig, String addressId) {
        RetrofitClientInstance.getInstance().getDataService().getAddress(addressId).enqueue(new Callback<BaseData<GetAddressModel>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Response<BaseData<GetAddressModel>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<GetAddressModel>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void validateAddress(ITerminalValidate terminalConfig, AddressValidation addressValidation) {
        RetrofitClientInstance.getInstance().getDataService().validateAddresses(addressValidation).enqueue(new Callback<BaseData<AddressValidationResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Response<BaseData<AddressValidationResponse>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<AddressValidationResponse>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    /**
     *
     * All Countries , City, State,  End-point
     */
    public void getCountries(@Nullable ITerminalCountries terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getCountries().enqueue(new Callback<BaseData<List<TerminalCountries>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalCountries>>> call, @NonNull Response<BaseData<List<TerminalCountries>>> response) {
                if (response.isSuccessful()) {
                        Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalCountries>>> call, @NonNull Throwable t) {

                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }

    public void getStatesInCountry(@Nullable ITerminalStates terminalConfig, String countryCode) {
        RetrofitClientInstance.getInstance().getDataService().getStateInCountry(countryCode).enqueue(new Callback<BaseData<List<TerminalStates>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalStates>>> call, @NonNull Response<BaseData<List<TerminalStates>>> response) {
                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalStates>>> call, @NonNull Throwable t) {
                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getCitiesInCountry(@Nullable ITerminalCities terminalConfig, String countryCode, String stateCode) {
        RetrofitClientInstance.getInstance().getDataService().getCitiesInState(countryCode,stateCode).enqueue(new Callback<BaseData<List<TerminalCities>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalCities>>> call, @NonNull Response<BaseData<List<TerminalCities>>> response) {
                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalCities>>> call, @NonNull Throwable t) {
                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }
        /**
         * All Packaging End-point
         */

    public void createPackaging(@Nullable ITerminalPackaging terminalConfig, Packaging packaging) {
            RetrofitClientInstance.getInstance().getDataService().createPackaging(packaging).enqueue(new Callback<BaseData<PackagingResponse>>() {
                @Override
                public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                    if (response.isSuccessful()) {
                        Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                    }
                    else {
                        if (terminalConfig != null) {
                            BaseData errorResponse = getBaseError(response);
                            terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                        }
                    }
                }
                @Override
                public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                    Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));
                }
            });
        }

    public void deletePackaging(ITerminalPackaging terminalConfig, String packagingId) {
        RetrofitClientInstance.getInstance().getDataService().deletePackaging(packagingId).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void updatePackaging(ITerminalPackaging terminalConfig, String packagingId,Packaging packaging) {
        RetrofitClientInstance.getInstance().getDataService().updatePackaging(packagingId,packaging).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getPackaging(ITerminalPackagingList terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getPackaging().enqueue(new Callback<BaseData<List<PackagingResponse>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<PackagingResponse>>> call, @NonNull Response<BaseData<List<PackagingResponse>>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<PackagingResponse>>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificPackaging(ITerminalPackaging terminalConfig, String packagingId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificPackaging(packagingId).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
