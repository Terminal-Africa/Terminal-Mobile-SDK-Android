package com.terminal.terminal_androidsdk.core
import com.terminal.terminal_androidsdk.core.db.*
import com.terminal.terminal_androidsdk.core.model.*
import com.terminal.terminal_androidsdk.core.model.Packaging
import com.terminal.terminal_androidsdk.core.model.claims.FIleAClaim
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModel
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModelList
import com.terminal.terminal_androidsdk.core.model.component_carries.GetEnableCarriers
import com.terminal.terminal_androidsdk.core.model.component_getship.*
import com.terminal.terminal_androidsdk.utils.AppLog
import com.terminal.terminal_androidsdk.utils.Constant.ERROR
import com.terminal.terminal_androidsdk.utils.MemoryManager
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentUnpopulated
import com.terminal.terminal_androidsdk.core.model.component_track.TrackShipmentRes
import com.terminal.terminal_androidsdk.core.model.component_user.*
import com.terminal.terminal_androidsdk.core.model.insurance.CheckInsurance
import com.terminal.terminal_androidsdk.core.model.insurance.CheckInsuranceResponse
import com.terminal.terminal_androidsdk.core.model.insurance.PurchasePremiumInsurance
import com.terminal.terminal_androidsdk.core.model.insurance.SpecificInsurance
import com.terminal.terminal_androidsdk.core.model.utils.SuccessModel
import com.terminal.terminal_androidsdk.core.model.utils.TerminalRealMerchant

/**
 * Created by AYODEJI on 10/10/2020.
 * This can be referenced globally , achieve through the Object type in Kotlin
 * We have the various address end-point.
 * The class is initiated for transaction using the Init method
 */

object TShipSDK  {
    private var addressesRemote: AddressRemote? = null
    private var miscellaneousRemote: MiscellanousRemote? = null
    private  var userRemote: UserRemote? = null
    private  var rateRemote: RateRemote? = null
    private  var parcelRemote: ParcelRemote? = null
    private  var transactionRemote:TransactionRemote? = null
    private  var shipmentRemote:ShipmentRemote? = null
    private  var carriesRemote:CarriesRemote? = null
    private  var utilRemote:UtilRemote? = null
    private val LOG_TAG: String =
        TShipSDK::class.java.simpleName

    init {
        addressesRemote = AddressRemote.getInstance()
        miscellaneousRemote = MiscellanousRemote.getInstance()
        userRemote = UserRemote.getInstance()
        rateRemote = RateRemote.getInstance()
        parcelRemote = ParcelRemote.getInstance()
        transactionRemote = TransactionRemote.getInstance()
        shipmentRemote = ShipmentRemote.getInstance()
        carriesRemote = CarriesRemote.getInstance()
        utilRemote = UtilRemote.getInstance()
    }

    fun init(secretKey: String, isLive:Boolean = false){
          MemoryManager.getInstance().putUserSecretKey(secretKey)
          MemoryManager.getInstance().putIsLive(isLive)
        AppLog.i(LOG_TAG,"init-successful $secretKey $isLive")
    }

    fun initHome(secretKey: String, isLive:Boolean = false){
        MemoryManager.getInstance().putUserHomeQuote(secretKey)
        MemoryManager.getInstance().putIsHomeLive(isLive)
    }

    fun getRateForShipment(shipmentRate: ShipmentRate, callback: ITerminalConfiguration<List<RateModel>>){
        AppLog.i(LOG_TAG,"getRateForShipment $shipmentRate")
        if(isSecretKeyAdded()){
            rateRemote?.getRateForShipment(callback,shipmentRate)
        } else callback.onError(false,ERROR)

    }

    fun getRateForMultiShipment(shipmentRate: MultiShipmentRate,
                           callback: ITerminalConfiguration<List<Rate>>
    ){
        AppLog.i(LOG_TAG,"getRateForMultiShipment $shipmentRate")
        if(isSecretKeyAdded()){
            rateRemote?.getRateForMultiShipment(callback,shipmentRate)
        } else callback.onError(false,ERROR)

    }


    fun getRateForShipmentHome(shipmentRate: ShipmentRate,
                           callback: ITerminalConfiguration<List<Rate>>
    ){
        AppLog.i(LOG_TAG,"getRateForShipmentHome $shipmentRate")
        if(isSecretKeyAdded()){
            rateRemote?.getRateForShipmentHome(callback,shipmentRate)
        } else callback.onError(false,ERROR)

    }

    fun getRateForShipmentHome(shipmentId:String,
                               callback: ITerminalConfiguration<List<Rate>>
    ){
        if(isSecretKeyAdded()){
            rateRemote?.getRateForShipment(callback,shipmentId,)
        } else callback.onError(false,ERROR)

    }

    fun getRateForHomeShipmentHome(shipmentRate: ShipmentRate,
                               callback: ITerminalConfiguration<List<Rate>>
    ){
        AppLog.i(LOG_TAG,"getRateForHomeShipmentHome $shipmentRate")
        if(isHomeSecretKeyAdded()){
            rateRemote?.getRateForHomeShipmentHome(callback,shipmentRate)
        } else callback.onError(false,ERROR)

    }

    fun gotoGetShipmentShip(shipmentRate: ShipmentRate,
                                   callback: ITerminalConfiguration<List<Rate>>
    ){
        AppLog.i(LOG_TAG,"getRateForHomeShipmentHome $shipmentRate")
        if(isHomeSecretKeyAdded()){
            rateRemote?.gotoGetShipmentShip(callback,shipmentRate)
        } else callback.onError(false,ERROR)
    }

    fun getUserBalance(userId: String, callback: ITerminalConfiguration<UserBalance>) {
        AppLog.i(LOG_TAG,"getUserBalance $userId")
        if(isSecretKeyAdded()){
            userRemote?.getUserBalance(callback,userId)
        } else callback.onError(false,ERROR)
    }



    fun getUserProfile( user_id:String,callback: ITerminalConfiguration<UserProfile>) {
        if(isSecretKeyAdded()){
            userRemote?.getUserProfile(callback,user_id)
        } else callback.onError(false,ERROR)
    }

    fun getUserWalletInfo( user_id:String,callback: ITerminalConfiguration<WalletInfo>) {
        if(isSecretKeyAdded()){
            userRemote?.getUserWalletInfo(callback,user_id)
        } else callback.onError(false,ERROR)
    }

    fun getHomeUserWalletInfo( user_id:String,callback: ITerminalConfiguration<WalletInfo>) {
        if(isHomeSecretKeyAdded()){
            userRemote?.getHomeUserWalletInfo(callback,user_id)
        } else callback.onError(false,ERROR)
    }

    fun getUtilsData(callback: ITerminalConfiguration<TerminalRealMerchant>) {
        if(isHomeSecretKeyAdded()){
            utilRemote?.getUtilsData(callback,)
        } else callback.onError(false,ERROR)
    }

    fun createAddress(createAddress: CreateAddress?,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"createAddress $createAddress")
        if(isSecretKeyAdded() && createAddress != null){
            addressesRemote?.createAddress(callback,createAddress)
        } else callback.onError(false,ERROR)
    }


    fun createHomeAddress(createAddress: CreateAddress?,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"createHomeAddress $createAddress")
        if(isHomeSecretKeyAdded() && createAddress != null){
            addressesRemote?.createHomeAddress(callback,createAddress)
        } else callback.onError(false,ERROR)
    }

    fun updateAddress(addressId: String, createAddress: UpdateAddress,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"updateAddress $addressId  $createAddress")
        if(isSecretKeyAdded()){
            addressesRemote?.updateAddress(callback,addressId,createAddress)
        } else callback.onError(false,ERROR)
    }

    fun getAddresses(callback: ITerminalConfiguration<GetAddressModel>,page:Int = 1, limit:Int = 25,) {
        AppLog.i(LOG_TAG,"getAddresses $page  $limit")
        if(isSecretKeyAdded()){
           addressesRemote?.getAddresses(callback,page,limit)
        } else callback.onError(false,ERROR)
    }

    fun getAddressesBySearch(callback: ITerminalConfiguration<GetAddressModel>,search:String, page:Int = 1, limit:Int = 25,) {
        AppLog.i(LOG_TAG,"getAddressesBySearch $page  $limit")
        if(isSecretKeyAdded()){
            addressesRemote?.getAddressesBySearch(callback,page,search)
        } else callback.onError(false,ERROR)
    }


    fun getAddressesById(addressId:String,callback: ITerminalConfiguration<GetAddressModel>) {
        AppLog.i(LOG_TAG,"getAddressesById $addressId ")
        if(isSecretKeyAdded()){
            addressesRemote?.getAddressesById(callback,addressId)
        } else callback.onError(false,ERROR)
    }

    fun deleteAddress( addressId:String,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"deleteAddress $addressId ")
        if(isSecretKeyAdded()){
            addressesRemote?.deleteAddress(callback,addressId)
        } else callback.onError(false,ERROR)
    }

    fun validateAddress(addressValidation: AddressValidation,callback: ITerminalConfiguration<AddressValidationResponse>) {
        AppLog.i(LOG_TAG,"getCitiesInState $addressValidation ")
        if(isSecretKeyAdded()){
            addressesRemote?.validateAddress(callback,addressValidation)
        } else callback.onError(false,ERROR)

    }

    fun getCountries(callback: ITerminalConfiguration<List<TerminalCountries>>) {
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getCountries(callback)
        } else callback.onError(false,ERROR)

    }

    fun getHomeCountries(callback: ITerminalConfiguration<List<TerminalCountries>>) {
        if(isHomeSecretKeyAdded()){
            miscellaneousRemote?.getHomeCountries(callback)
        } else callback.onError(false,ERROR)

    }


    fun getStateInCountry(countryCode:String,callback:  ITerminalConfiguration<List<TerminalStates>>) {
        AppLog.i(LOG_TAG,"getStateInCountry $countryCode ")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getStatesInCountry(callback,countryCode)
        } else callback.onError(false,ERROR)
    }

    fun getHomeStateInCountry(countryCode:String,callback:  ITerminalConfiguration<List<TerminalStates>>) {
        AppLog.i(LOG_TAG,"getStateInCountry $countryCode ")
        if(isHomeSecretKeyAdded()){
            miscellaneousRemote?.getHomeStatesInCountry(callback,countryCode)
        } else callback.onError(false,ERROR)
    }

    fun getCitiesInState(countryCode:String, stateCode:String, callback:  ITerminalConfiguration<List<TerminalCities>>) {
        AppLog.i(LOG_TAG,"getCitiesInState $countryCode $stateCode")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getCitiesInCountry(callback,countryCode,stateCode)
        } else callback.onError(false,ERROR)
    }

    fun getHomeCitiesInState(countryCode:String, stateCode:String, callback:  ITerminalConfiguration<List<TerminalCities>>) {
        AppLog.i(LOG_TAG,"getCitiesInState $countryCode $stateCode")
        if(isHomeSecretKeyAdded()){
            miscellaneousRemote?.getHomeCitiesInCountry(callback,countryCode,stateCode)
        } else callback.onError(false,ERROR)
    }


    fun createPackaging(packaging: Packaging,callback:  ITerminalConfiguration<PackagingResponse>) {
        AppLog.i(LOG_TAG,"createPackaging $packaging")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.createPackaging(callback,packaging)
        } else callback.onError(false,ERROR)
    }

    fun updatePackaging(packagingId: String,  packaging: Packaging,callback: ITerminalConfiguration<PackagingResponse>) {
        AppLog.i(LOG_TAG,"updatePackaging $packagingId $packaging")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.updatePackaging(callback,packagingId,packaging)
        } else callback.onError(false,ERROR)
    }

    fun deletePackaging( packagingId: String,callback: ITerminalConfiguration<PackagingResponse>) {
        AppLog.i(LOG_TAG,"deletePackaging $packagingId")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.deletePackaging(callback,packagingId)
        } else callback.onError(false,ERROR)

    }

    fun getSpecificPackaging( packagingId: String,callback: ITerminalConfiguration<PackagingResponse>) {
        AppLog.i(LOG_TAG,"getSpecificPackaging $packagingId")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getSpecificPackaging(callback,packagingId)
        } else callback.onError(false,ERROR)
    }

    fun getPackaging(
        callback:ITerminalConfiguration<GetPackagingList>,  perPage:Int = 100, page:Int = 1,  type: String? = null,) {
        AppLog.i(LOG_TAG,"getPackaging")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getPackaging(callback,type,perPage,page)
        } else callback.onError(false,ERROR)
    }

    fun getParcels(
         callback:ITerminalConfiguration<GetParcelModelList>,  perPage:Int = 100, page:Int = 1,) {
        AppLog.i(LOG_TAG,"getParcels")
        if(isSecretKeyAdded()){
            parcelRemote?.getParcels(callback,perPage,page)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificParcel(
        parcelId:String, callback:ITerminalConfiguration<ParcelResponse>) {
        AppLog.i(LOG_TAG,"getParcels")
        if(isSecretKeyAdded()){
            parcelRemote?.getSpecificParcel(callback,parcelId)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificInsurance(
        shipmentID:String, callback:ITerminalConfiguration<SpecificInsurance>) {
        AppLog.i(LOG_TAG,"getSpecificInsurance")
        if(isSecretKeyAdded()){
            parcelRemote?.getSpecificInsurance(callback,shipmentID)
        } else callback.onError(false,ERROR)
    }

    fun getInsurancePremium(
        parcelId:String,callback:ITerminalConfiguration<PurchasePremiumInsurance>) {
        AppLog.i(LOG_TAG,"getInsurancePremium")
        if(isSecretKeyAdded()){
            parcelRemote?.getInsurancePremium(callback,parcelId)
        } else callback.onError(false,ERROR)
    }
    fun getHomeInsurancePremium(
        parcelId:String,callback:ITerminalConfiguration<PurchasePremiumInsurance>) {
        AppLog.i(LOG_TAG,"getHomeInsurancePremium")
        if(isSecretKeyAdded()){
            parcelRemote?.getHomeInsurancePremium(callback,parcelId)
        } else callback.onError(false,ERROR)
    }


    fun updateParcel(
       parcelId:String,updateParcelModel: UpdateParcelModel,callback:ITerminalConfiguration<ParcelResponse>) {
        AppLog.i(LOG_TAG,"getParcels")
        if(isSecretKeyAdded()){
            parcelRemote?.updateParcel(callback,parcelId,updateParcelModel)
        } else callback.onError(false,ERROR)
    }

    fun createParcel(
        createParcel: CreateParcel,callback:ITerminalConfiguration<ParcelResponse>) {
        AppLog.i(LOG_TAG,"createParcel")
        if(isSecretKeyAdded()){
            parcelRemote?.createParcel(callback,createParcel)
        } else callback.onError(false,ERROR)
    }

    fun createHomeParcel(
        createParcel: CreateParcel,callback:ITerminalConfiguration<ParcelResponse>) {
        AppLog.i(LOG_TAG,"createHomeParcel")
        if(isHomeSecretKeyAdded()){
            parcelRemote?.createHomeParcel(callback,createParcel)
        } else callback.onError(false,ERROR)
    }

    fun updateHomeParcel(
      parcelId:String,  createParcel: UpdateParcelModel,callback:ITerminalConfiguration<ParcelResponse>) {
        AppLog.i(LOG_TAG,"updateHomeParcel")
        if(isHomeSecretKeyAdded()){
            parcelRemote?.updateHomeParcel(callback,createParcel,parcelId)
        } else callback.onError(false,ERROR)
    }

    fun getTransaction(
         walletID:String, callback:ITerminalConfiguration<GetTransactionModelList>, perPage:Int = 100, page:Int = 1,) {
        AppLog.i(LOG_TAG,"getTransaction")
        if(isSecretKeyAdded()){
            transactionRemote?.getTransaction(callback,walletID,perPage,page)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificTransaction(
        transactionID:String, callback:ITerminalConfiguration<Transaction>) {
        AppLog.i(LOG_TAG,"getSpecificTransaction")
        if(isSecretKeyAdded()){
            transactionRemote?.getSpecificTransaction(callback,transactionID)
        } else callback.onError(false,ERROR)
    }

    fun updateDraftShipments(
        shipmentId:String,
        shipments: Shipments, callback:ITerminalConfiguration<CreateSummaryShipmentRes>) {
        AppLog.i(LOG_TAG,"updateDraftShipments")
        if(isSecretKeyAdded()){
            shipmentRemote?.updateDraftShipments(callback,shipments,shipmentId)
        } else callback.onError(false,ERROR)
    }
    fun createShipments(
        shipments: Shipments, callback:ITerminalConfiguration<CreateSummaryShipmentRes>) {
        AppLog.i(LOG_TAG,"createShipments")
        if(isSecretKeyAdded()){
            shipmentRemote?.createShipments(callback,shipments)
        } else callback.onError(false,ERROR)
    }

    fun createShipments(
        shipments:ShopShipments, callback:ITerminalConfiguration<CreateSummaryShipmentRes>) {
        AppLog.i(LOG_TAG,"createShipments")
        if(isSecretKeyAdded()){
            shipmentRemote?.createShipments(callback,shipments)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificShipment(
        shipmentId: String, callback:ITerminalConfiguration<CreateShipmentRes>) {
        AppLog.i(LOG_TAG,"getSpecificShipment")
        if(isSecretKeyAdded()){
            shipmentRemote?.getSpecificShipment(callback,shipmentId)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificShopShipment(
        shipmentId: String, callback:ITerminalConfiguration<CreateShopShipmentRes>) {
        AppLog.i(LOG_TAG,"getSpecificShopShipment")
        if(isSecretKeyAdded()){
            shipmentRemote?.getSpecificShopShipment(callback,shipmentId)
        } else callback.onError(false,ERROR)
    }



    fun cancelShipmentByID(
        cancelShipment: CancelShipment, callback:ITerminalConfiguration<ShipmentUnpopulated>) {
        AppLog.i(LOG_TAG,"cancelShipmentByID")
        if(isSecretKeyAdded()){
            shipmentRemote?.cancelShipmentByID(callback,cancelShipment)
        } else callback.onError(false,ERROR)
    }

    fun deleteDraftShipment(
        cancelShipment: String, callback:ITerminalConfiguration<SuccessModel>) {
        AppLog.i(LOG_TAG,"deleteDraftShipment")
        if(isSecretKeyAdded()){
            shipmentRemote?.deleteDraftShipment(callback,cancelShipment)
        } else callback.onError(false,ERROR)
    }

    fun getShipments(
         callback:ITerminalConfiguration<GetShipmentModelList>, perPage:Int = 5, page:Int = 1,) {
        AppLog.i(LOG_TAG,"getShipments")
        if(isSecretKeyAdded()){
            shipmentRemote?.getShipments(callback,perPage,page)
        } else callback.onError(false,ERROR)
    }

    fun getShipmentsPopulate(
        callback:ITerminalConfiguration<GetShipmentPopulateList>, perPage:Int = 5, page:Int = 1,) {
        AppLog.i(LOG_TAG,"getShipmentsPopulate")
        if(isSecretKeyAdded()){
            shipmentRemote?.getShipmentsPopulate(callback,perPage,page)
        } else callback.onError(false,ERROR)
    }

    fun getShipmentsPopulateStatus(
        callback:ITerminalConfiguration<GetShipmentPopulateList>,status:String, perPage:Int = 5, page:Int = 1,) {
        AppLog.i(LOG_TAG,"getShipmentsPopulateStatus")
        if(isSecretKeyAdded()){
            when(status){
                "draft"->{
                    shipmentRemote?.getShipmentsPopulateStatus(callback,perPage,page,status)
                }
                "cancelled"->{
                    shipmentRemote?.getShipmentsPopulateStatusCancelled(callback,perPage,page,status)
                }
                "delivered"->{
                    shipmentRemote?.getShipmentsPopulateStatusComplete(callback,perPage,page,status)
                }
                "confirmed"->{
                    shipmentRemote?.getShipmentsPopulateStatusConfirmed(callback,perPage,page,status)
                }
                "in-transit"->{
                    shipmentRemote?.getShipmentsPopulateStatusOngoing(callback,perPage,page,status)
                }
                "all_status"->{
                    shipmentRemote?.getShipmentsPopulateStatusAll(callback,perPage,page,status)
                }
            }
        } else callback.onError(false,ERROR)
    }

    fun trackShipment(
        shipmentId:String, callback:ITerminalConfiguration<TrackShipmentRes>) {
        AppLog.i(LOG_TAG,"trackShipment")
        if(isSecretKeyAdded()){
            shipmentRemote?.trackShipment(callback,shipmentId)
        } else callback.onError(false,ERROR)
    }

    fun checkInsuranceStand(
        checkInsurance: CheckInsurance, callback:ITerminalConfiguration<CheckInsuranceResponse>) {
        AppLog.i(LOG_TAG,"checkInsuranceStand")
        if(isSecretKeyAdded()){
            shipmentRemote?.checkInsuranceStand(callback,checkInsurance)
        } else callback.onError(false,ERROR)
    }


    fun arrangePickupAndDelivery(
        arrangePickupAndDelivery: ArrangePickupAndDelivery, callback:ITerminalConfiguration<ShipmentUnpopulated>) {
        AppLog.i(LOG_TAG,"arrangePickupAndDelivery")
        if(isSecretKeyAdded()){
            shipmentRemote?.arrangePickupAndDelivery(callback,arrangePickupAndDelivery)
        } else callback.onError(false,ERROR)
    }


    fun fileAClaim(
        fIleAClaim: FIleAClaim, callback:ITerminalConfiguration<SuccessModel>) {
        AppLog.i(LOG_TAG,"fileAClaim")
        if(isSecretKeyAdded()){
            shipmentRemote?.fileAClaim(callback,fIleAClaim)
        } else callback.onError(false,ERROR)
    }


    fun getShipCarriers(
        type:String,callback:ITerminalConfiguration<GetCarriesModelList>) {
        AppLog.i(LOG_TAG,"getShipCarries")
        if(isSecretKeyAdded()){
            carriesRemote?.getShipCarries(callback,type)
        } else callback.onError(false,ERROR)
    }

    fun getSpecificShipCarriers(
        shipCarrierId:String, callback:ITerminalConfiguration<GetCarriesModel>) {
        AppLog.i(LOG_TAG,"getSpecificShipCarries")
        if(isSecretKeyAdded()){
            carriesRemote?.getSpecificShipCarries(callback,shipCarrierId)
        } else callback.onError(false,ERROR)
    }
    fun getEnabledShipCarriers(
        callback:ITerminalConfiguration<GetEnableCarriers>) {
        AppLog.i(LOG_TAG,"getEnabledShipCarries")
        if(isSecretKeyAdded()){
            carriesRemote?.getEnabledShipCarries(callback)
        } else callback.onError(false,ERROR)
    }
    fun enableShipCarriers(
        shipCarrierId:String, callback:ITerminalConfiguration<GetCarriesModel>, domestic:Boolean = false,international:Boolean = false, regional:Boolean = false ) {
        AppLog.i(LOG_TAG,"enableShipCarries")
        if(isSecretKeyAdded()){
            carriesRemote?.enableShipCarries(callback,shipCarrierId,domestic,international, regional)
        } else callback.onError(false,ERROR)
    }
    fun disableShipCarriers(
        shipCarrierId:String, callback:ITerminalConfiguration<SuccessModel>, domestic:Boolean = false,international:Boolean = false, regional:Boolean = false ) {
        AppLog.i(LOG_TAG,"disableShipCarries")
        if(isSecretKeyAdded()){
            carriesRemote?.disableShipCarries(callback,shipCarrierId,domestic,international, regional)
        } else callback.onError(false,ERROR)
    }


    private fun isSecretKeyAdded():Boolean{
        return MemoryManager.getInstance().isSecretActivated
    }

    private fun isHomeSecretKeyAdded():Boolean{
        return MemoryManager.getInstance().isHomeSecretActivated
    }
}
