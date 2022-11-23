package com.terminal.terminal_androidsdk.core.iinterface;

import static com.terminal.terminal_androidsdk.utils.Constant.CREATE_ADDRESS;

import com.terminal.terminal_androidsdk.core.model.ArrangePickupAndDelivery;
import com.terminal.terminal_androidsdk.core.model.CancelShipment;
import com.terminal.terminal_androidsdk.core.model.CreateParcel;
import com.terminal.terminal_androidsdk.core.model.CreateShipmentResponse;
import com.terminal.terminal_androidsdk.core.model.GetPackagingList;
import com.terminal.terminal_androidsdk.core.model.GetParcelModelList;
import com.terminal.terminal_androidsdk.core.model.GetShipmentModelList;
import com.terminal.terminal_androidsdk.core.model.GetTransactionModelList;
import com.terminal.terminal_androidsdk.core.model.ParcelResponse;
import com.terminal.terminal_androidsdk.core.model.RateModel;
import com.terminal.terminal_androidsdk.core.model.Shipments;
import com.terminal.terminal_androidsdk.core.model.Transaction;
import com.terminal.terminal_androidsdk.core.model.TransactionList;
import com.terminal.terminal_androidsdk.core.model.UpdateParcelModel;
import com.terminal.terminal_androidsdk.core.model.UserBalance;
import com.terminal.terminal_androidsdk.core.model.UserProfile;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModel;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModelList;
import com.terminal.terminal_androidsdk.core.model.component_carries.GetEnableCarriers;
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateShipmentRes;
import com.terminal.terminal_androidsdk.core.model.component_track.TrackShipmentRes;
import com.terminal.terminal_androidsdk.core.network.BaseData;
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
import com.terminal.terminal_androidsdk.core.model.UpdateAddress;

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

    /*Todo Address Endpoint */
    @POST(CREATE_ADDRESS+"/addresses")
    Call<BaseData<Address>> createAddress(@Body CreateAddress createAddress
                                          );

    @GET(CREATE_ADDRESS+"/addresses")
    Call<BaseData<GetAddressModel>> getAddresses(
            @Query("page") int page,
            @Query("limit") int limit
    );

    @GET(CREATE_ADDRESS+"/addresses/{address_id}")
    Call<BaseData<GetAddressModel>> getAddress( @Path("address_id") String address_id);

    @PUT(CREATE_ADDRESS+"/addresses/{address_id}")
    Call<BaseData<Address>> updateAddress(@Path("address_id") String address_id,
                                          @Body UpdateAddress createAddress
    );

    @POST(CREATE_ADDRESS+"/addresses/validate")
    Call<BaseData<AddressValidationResponse>> validateAddresses(
            @Body AddressValidation addressValidation);

    @DELETE(CREATE_ADDRESS+"/addresses/delete/{delete_ID}")
    Call<BaseData<Address>> deleteAddress(@Path("delete_ID") String delete_ID);


    /*Todo Country, State, Cities Endpoint */

    @GET(CREATE_ADDRESS+"/countries")
    Call<BaseData<List<TerminalCountries>>> getCountries();

    @GET(CREATE_ADDRESS+"/states")
    Call<BaseData<List<TerminalStates>>> getStateInCountry(@Query("country_code") String country_code);

    @GET(CREATE_ADDRESS+"/cities")
    Call<BaseData<List<TerminalCities>>> getCitiesInState(@Query("country_code") String country_code,
                                                          @Query("state_code") String stateCode);

    /*Todo Packaging Endpoint */

    @GET(CREATE_ADDRESS+"/packaging")
    Call<BaseData<GetPackagingList>> getPackaging(
                             @Query("type") String type,
                               @Query("perPage") int perPage,
                                 @Query("page") int page

    );

    @GET(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> getSpecificPackaging(@Path("packagingID") String packagingID);

    @PUT(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> updatePackaging(@Path("packagingID") String packagingID,
                                          @Body Packaging packaging);
    @POST(CREATE_ADDRESS+"/packaging")
    Call<BaseData<PackagingResponse>> createPackaging(@Body Packaging packaging);

    @DELETE(CREATE_ADDRESS+"/packaging/{packagingID}")
    Call<BaseData<PackagingResponse>> deletePackaging(@Path("packagingID") String packagingID);


    /*Todo Users Endpoint */

    @GET(CREATE_ADDRESS+"/users/{user_id}")
    Call<BaseData<UserProfile>> getUserProfile(@Path("user_id") String user_id);

    @GET(CREATE_ADDRESS+"/users/wallet-balance")
    Call<BaseData<UserBalance>> getUserBalance(@Query("user_id") String user_id);


    /*Todo Shipment Rates Endpoint */
    @GET(CREATE_ADDRESS+"/rates/shipment")
    Call<BaseData<List<RateModel>>> getRateForShipment(@Query("parcel_id") String parcel_id,
                                                       @Query("pickup_address") String pickup_address,
                                                       @Query("delivery_address") String delivery_address,
                                                       @Query("currency") String currency,
                                                       @Query("shipment_id") String shipment_id
                                                       );


    /*Todo Parcels Endpoint */

    @GET(CREATE_ADDRESS+"/parcels/{parcel_id}")
    Call<BaseData<ParcelResponse>> getParcel(@Path("parcel_id") String parcel_id);

    @GET(CREATE_ADDRESS+"/parcels")
    Call<BaseData<GetParcelModelList>> getParcels(@Query("perPage") int perPage,
                                                  @Query("page") int page);

    @PUT(CREATE_ADDRESS+"/parcels/{parcel_id}")
    Call<BaseData<ParcelResponse>> updateParcel(@Path("parcel_id") String parcel_id,
                                                   @Body UpdateParcelModel updateParcelModel
                                                   );
    @POST(CREATE_ADDRESS+"/parcels")
    Call<BaseData<ParcelResponse>> createParcel(@Body CreateParcel createParcel
    );

    /*Todo Transactions Endpoint */

    @GET(CREATE_ADDRESS+"/transactions/{transactions_id}")
    Call<BaseData<Transaction>> getSpecificTransaction(
            @Path("transactions_id") String transactions_id);

    @GET(CREATE_ADDRESS+"/transactions")
    Call<BaseData<GetTransactionModelList>> getTransaction(
            @Query("wallet") String wallet,
            @Query("perPage") int perPage,
            @Query("page") int page
    );

    /*Todo Shipment End-point */
    @POST(CREATE_ADDRESS+"/shipments")
    Call<BaseData<CreateShipmentRes>> createShipments(@Body Shipments shipments
    );


    @GET(CREATE_ADDRESS+"/shipments/{shipments_Id}")
    Call<BaseData<CreateShipmentRes>> getSpecificShipment(
            @Path("shipments_Id") String shipments_Id
            );

    @GET(CREATE_ADDRESS+"/shipments")
    Call<BaseData<GetShipmentModelList>> getShipments(
            @Query("perPage") int perPage,
            @Query("page") int page
    );

    @POST(CREATE_ADDRESS+"/shipments/cancel")
    Call<BaseData<TrackShipmentRes>> cancelShipmentByID(
            @Body CancelShipment cancelShipment
    );

    @GET(CREATE_ADDRESS+"/shipments/track/{shipments_Id}")
    Call<BaseData<TrackShipmentRes>> trackShipment(
            @Path("shipments_Id") String shipments_Id
    );

    @POST(CREATE_ADDRESS+"/shipments/pickup")
    Call<BaseData<TrackShipmentRes>> ArrangePickupDelivery(
            @Body ArrangePickupAndDelivery regional
    );


    /*Todo Carries Endpoint */
    @GET(CREATE_ADDRESS+"/carriers")
    Call<BaseData<GetCarriesModelList>> getShipCarries();

    @GET(CREATE_ADDRESS+"/carriers/{carriers_ID}")
    Call<BaseData<GetCarriesModel>> getSpecificShipCarrier(
            @Path("carriers_ID") String carriers_ID
    );

    @GET(CREATE_ADDRESS+"/carriers/enabled/user")
    Call<BaseData<GetEnableCarriers>> getEnabledShipCarrier();

    @POST(CREATE_ADDRESS+"/carriers/enable/{carriers_ID}")
    Call<BaseData<GetCarriesModel>> enableShipCarrier(
            @Path("carriers_ID") String carriers_ID,
            @Query("domestic") boolean domestic,
            @Query("international") boolean international,
            @Query("regional") boolean regional
    );
    @POST(CREATE_ADDRESS+"/carriers/disable/{carriers_ID}")
    Call<BaseData<GetCarriesModel>> disabledShipCarrier(
            @Path("carriers_ID") String carriers_ID,
            @Query("domestic") boolean domestic,
            @Query("international") boolean international,
            @Query("regional") boolean regional

    );




}

