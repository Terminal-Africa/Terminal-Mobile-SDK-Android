package com.terminal.terminal_androidsdk.core.db;

import androidx.annotation.NonNull;

import com.terminal.terminal_androidsdk.core.network.BaseData;
import com.terminal.terminal_androidsdk.core.network.RetrofitClientInstance;
import com.terminal.terminal_androidsdk.core.ITerminalCities;
import com.terminal.terminal_androidsdk.core.ITerminalCountries;
import com.terminal.terminal_androidsdk.core.ITerminalPackaging;
import com.terminal.terminal_androidsdk.core.ITerminalPackagingList;
import com.terminal.terminal_androidsdk.core.ITerminalStates;
import com.terminal.terminal_androidsdk.core.model.Packaging;
import com.terminal.terminal_androidsdk.core.model.PackagingResponse;
import com.terminal.terminal_androidsdk.core.model.TerminalCities;
import com.terminal.terminal_androidsdk.core.model.TerminalCountries;
import com.terminal.terminal_androidsdk.core.model.TerminalStates;
import com.terminal.terminal_androidsdk.utils.AppLog;
import com.terminal.terminal_androidsdk.utils.Constant;

import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
/**
 * Created by AYODEJI on 10/10/2020.
 * Implements the countries and other packaging end-points
 *
 */
public class MiscellanousRemote {
    private static MiscellanousRemote Instance;
    private String  LOG_TAG =
            MiscellanousRemote.class.getSimpleName();
    public static MiscellanousRemote getInstance() {
        if (Instance == null) Instance = new MiscellanousRemote();
        return Instance;
    }

    /**
     *
     * All Countries , City, State,  End-point
     */
    public void getCountries(@Nullable ITerminalCountries terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getCountries().enqueue(new Callback<BaseData<List<TerminalCountries>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalCountries>>> call, @NonNull Response<BaseData<List<TerminalCountries>>> response) {
                AppLog.d(LOG_TAG,"getCountries" + response);

                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(Objects.requireNonNull(errorResponse).isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalCountries>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getCountries" + t.getMessage());
                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));

            }
        });
    }

    public void getStatesInCountry(@Nullable ITerminalStates terminalConfig, String countryCode) {
        RetrofitClientInstance.getInstance().getDataService().getStateInCountry(countryCode).enqueue(new Callback<BaseData<List<TerminalStates>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalStates>>> call, @NonNull Response<BaseData<List<TerminalStates>>> response) {
                AppLog.d(LOG_TAG,"getStatesInCountry" + response);

                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalStates>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getStatesInCountry" + t.getMessage());

                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getCitiesInCountry(@Nullable ITerminalCities terminalConfig, String countryCode, String stateCode) {
        RetrofitClientInstance.getInstance().getDataService().getCitiesInState(countryCode,stateCode).enqueue(new Callback<BaseData<List<TerminalCities>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<TerminalCities>>> call, @NonNull Response<BaseData<List<TerminalCities>>> response) {
                AppLog.d(LOG_TAG,"getCitiesInCountry" + response);

                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                    }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<TerminalCities>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getCitiesInCountry" + t.getMessage());

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
                AppLog.d(LOG_TAG,"createPackaging" + response);

                if (response.isSuccessful()) {
                    Objects.requireNonNull(terminalConfig).onResponse(Objects.requireNonNull(response.body()));
                }
                else {
                    if (terminalConfig != null) {
                        BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                        terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                        }
                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"createPackaging" + t.getMessage());

                Objects.requireNonNull(terminalConfig).onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void deletePackaging(ITerminalPackaging terminalConfig, String packagingId) {
        RetrofitClientInstance.getInstance().getDataService().deletePackaging(packagingId).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                AppLog.d(LOG_TAG,"deletePackaging" + response);

                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"deletePackaging" + t.getMessage());

                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void updatePackaging(ITerminalPackaging terminalConfig, String packagingId,Packaging packaging) {
        RetrofitClientInstance.getInstance().getDataService().updatePackaging(packagingId,packaging).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                AppLog.d(LOG_TAG,"updatePackaging" + response);

                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"updatePackaging" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getPackaging(ITerminalPackagingList terminalConfig) {
        RetrofitClientInstance.getInstance().getDataService().getPackaging().enqueue(new Callback<BaseData<List<PackagingResponse>>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<List<PackagingResponse>>> call, @NonNull Response<BaseData<List<PackagingResponse>>> response) {
                AppLog.d(LOG_TAG,"getPackaging" + response);

                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<List<PackagingResponse>>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getPackaging" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

    public void getSpecificPackaging(ITerminalPackaging terminalConfig, String packagingId) {
        RetrofitClientInstance.getInstance().getDataService().getSpecificPackaging(packagingId).enqueue(new Callback<BaseData<PackagingResponse>>() {
            @Override
            public void onResponse(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Response<BaseData<PackagingResponse>> response) {
                AppLog.d(LOG_TAG,"getSpecificPackaging" + response);

                if (response.isSuccessful()) {
                    terminalConfig.onResponse(Objects.requireNonNull(response.body()));
                } else {
                    BaseData errorResponse = Constant.INSTANCE.getBaseError(response);
                    terminalConfig.onError(errorResponse.isError(),errorResponse.getMessage());                }
            }
            @Override
            public void onFailure(@NonNull Call<BaseData<PackagingResponse>> call, @NonNull Throwable t) {
                AppLog.d(LOG_TAG,"getSpecificPackaging" + t.getMessage());
                terminalConfig.onError(false, Objects.requireNonNull(t.getMessage()));
            }
        });
    }

}
