package com.terminal.terminal_androidsdk.core;

import static com.terminal.terminal_androidsdk.utils.Constant.CREATE_ADDRESS;

import com.terminal.terminal_androidsdk.core.model.Address;
import com.terminal.terminal_androidsdk.core.model.AddressValidation;
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse;
import com.terminal.terminal_androidsdk.core.model.Coordinates;
import com.terminal.terminal_androidsdk.core.model.CreateAddress;
import com.terminal.terminal_androidsdk.core.model.GetAddressModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by AYODEJI on 10/10/2020.
 * This represent the interface which prepares the connection to the backEnd
 */
public interface GetDataService {

    @POST(CREATE_ADDRESS)
    Call<BaseData<Address>> createAddress(@Body CreateAddress createAddress
                                          );

    @GET(CREATE_ADDRESS)
    Call<BaseData<GetAddressModel>> getAddresses();

    @GET(CREATE_ADDRESS+"/{address_id}")
    Call<BaseData<GetAddressModel>> getAddress( @Path("address_id") String address_id);

    @PUT(CREATE_ADDRESS+"/{address_id}")
    Call<BaseData<Address>> updateAddress(@Path("address_id") String address_id,
                                          @Body CreateAddress createAddress
    );

    @POST(CREATE_ADDRESS+"/validate")
    Call<BaseData<AddressValidationResponse>> validateAddresses(
            @Body AddressValidation addressValidation
            );

}
