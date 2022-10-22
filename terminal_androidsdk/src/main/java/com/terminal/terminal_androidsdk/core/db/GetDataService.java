package com.terminal.terminal_androidsdk.core.db;

import static com.terminal.terminal_androidsdk.utils.Constant.CREATE_ADDRESS;

import com.terminal.terminal_androidsdk.core.model.Address;
import com.terminal.terminal_androidsdk.core.model.AddressValidation;
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse;
import com.terminal.terminal_androidsdk.core.model.CreateAddress;
import com.terminal.terminal_androidsdk.core.model.GetAddressModel;
import com.terminal.terminal_androidsdk.core.model.Packaging;
import com.terminal.terminal_androidsdk.core.model.PackagingResponse;
import com.terminal.terminal_androidsdk.core.model.TerminalCities;
import com.terminal.terminal_androidsdk.core.model.TerminalCountries;
import com.terminal.terminal_androidsdk.core.model.TerminalStates;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by AYODEJI on 10/10/2020.
 * This represent the interface which prepares the connection to the backEnd
 */
public interface GetDataService {

    @POST(CREATE_ADDRESS)
    Call<BaseData<Address>> createAddress(@Body CreateAddress createAddress
                                          );

    @GET(CREATE_ADDRESS)
    Call<BaseData<GetAddressModel>> getAddresses(
            @Query("page") int page,
            @Query("limit") int limit
    );

    @GET(CREATE_ADDRESS+"/{address_id}")
    Call<BaseData<GetAddressModel>> getAddress( @Path("address_id") String address_id);

    @PUT(CREATE_ADDRESS+"/{address_id}")
    Call<BaseData<Address>> updateAddress(@Path("address_id") String address_id,
                                          @Body CreateAddress createAddress
    );

    @POST(CREATE_ADDRESS+"/validate")
    Call<BaseData<AddressValidationResponse>> validateAddresses(
            @Body AddressValidation addressValidation);

    @GET(CREATE_ADDRESS+"/countries")
    Call<BaseData<List<TerminalCountries>>> getCountries();

    @GET(CREATE_ADDRESS+"/states?country_code="+"{Country_Code}")
    Call<BaseData<List<TerminalStates>>> getStateInCountry(@Path("Country_Code") String Country_Code);

    @GET(CREATE_ADDRESS+"/cities?country_code="+"{Country_Code}&state_code="+"{stateCode}")
    Call<BaseData<List<TerminalCities>>> getCitiesInState(@Path("Country_Code") String Country_Code, String stateCode);

    @DELETE(CREATE_ADDRESS+"/addresses/delete/{delete_ID}")
    Call<BaseData<Address>> deleteAddress(@Path("delete_ID") String delete_ID);


    @GET(CREATE_ADDRESS+"/packaging")
    Call<BaseData<List<PackagingResponse>>> getPackaging();

    @GET(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> getSpecificPackaging(@Path("packagingID") String packagingID);

    @PUT(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> updatePackaging(@Path("packagingID") String packagingID,
                                          @Body Packaging packaging);
    @POST(CREATE_ADDRESS+"/packaging")
    Call<BaseData<PackagingResponse>> createPackaging(@Body Packaging packaging);

    @DELETE(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> deletePackaging(@Path("packagingID") String packagingID);

}

