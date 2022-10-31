package com.terminal.terminal_androidsdk.core
import com.terminal.terminal_androidsdk.core.db.AddressRemote
import com.terminal.terminal_androidsdk.core.db.MiscellanousRemote
import com.terminal.terminal_androidsdk.core.db.RateRemote
import com.terminal.terminal_androidsdk.core.db.UserRemote
import com.terminal.terminal_androidsdk.core.iinterface.*
import com.terminal.terminal_androidsdk.core.model.*
import com.terminal.terminal_androidsdk.utils.AppLog
import com.terminal.terminal_androidsdk.utils.Constant.ERROR
import com.terminal.terminal_androidsdk.utils.MemoryManager

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
    private val LOG_TAG: String =
        TShipSDK::class.java.simpleName

    init {
        addressesRemote = AddressRemote.getInstance()
        miscellaneousRemote = MiscellanousRemote.getInstance()
        userRemote = UserRemote.getInstance()
        rateRemote = RateRemote.getInstance()
    }

    fun init(secretKey: String, isLive:Boolean){
          MemoryManager.getInstance().putUserSecretKey(secretKey)
          MemoryManager.getInstance().putIsLive(isLive)
         AppLog.i(LOG_TAG,"initsuccessful $secretKey $isLive")
    }

    fun getRateForShipment(shipmentRate: ShipmentRate,
                           callback: ITerminalConfiguration<List<RateModel>>
    ){
        AppLog.i(LOG_TAG,"getRateForShipment $shipmentRate")
        if(isSecretKeyAdded()){
            rateRemote?.getRateForShipment(callback,shipmentRate)
        } else callback.onError(false,ERROR)

    }

    fun getUserBalance(userId: String, callback: ITerminalConfiguration<UserBalance>) {
        AppLog.i(LOG_TAG,"getUserBalance $userId")
        if(isSecretKeyAdded()){
            userRemote?.getUserBalance(callback,userId)
        } else callback.onError(false,ERROR)
    }

    fun getUserProfile(callback: ITerminalConfiguration<List<UserProfile>>) {
        if(isSecretKeyAdded()){
            userRemote?.getUserProfile(callback)
        } else callback.onError(false,ERROR)
    }

    fun createAddress(createAddress: CreateAddress?,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"createAddress $createAddress")
        if(isSecretKeyAdded() && createAddress != null){
            addressesRemote?.createAddress(callback,createAddress)
        } else callback.onError(false,ERROR)
    }

    fun updateAddress(addressId: String, createAddress: UpdateAddress,callback: ITerminalConfiguration<Address>) {
        AppLog.i(LOG_TAG,"updateAddress $addressId  $createAddress")
        if(isSecretKeyAdded()){
            addressesRemote?.updateAddress(callback,addressId,createAddress)
        } else callback.onError(false,ERROR)
    }

    fun getAddresses( page:Int, limit:Int = 25,callback: ITerminalConfiguration<GetAddressModel>) {
        AppLog.i(LOG_TAG,"getAddresses $page  $limit")
        if(isSecretKeyAdded()){
           addressesRemote?.getAddresses(callback,page,limit)
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

    fun getStateInCountry(countryCode:String,callback:  ITerminalConfiguration<List<TerminalStates>>) {
        AppLog.i(LOG_TAG,"getStateInCountry $countryCode ")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getStatesInCountry(callback,countryCode)
        } else callback.onError(false,ERROR)
    }

    fun getCitiesInState(countryCode:String, stateCode:String, callback:  ITerminalConfiguration<List<TerminalCities>>) {
        AppLog.i(LOG_TAG,"getCitiesInState $countryCode $stateCode")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getCitiesInCountry(callback,countryCode,stateCode)
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

    fun getPackaging(callback: ITerminalConfiguration<GetPackagingList>) {
        AppLog.i(LOG_TAG,"getPackaging")
        if(isSecretKeyAdded()){
            miscellaneousRemote?.getPackaging(callback)
        } else callback.onError(false,ERROR)
    }

    private fun isSecretKeyAdded():Boolean{
        return MemoryManager.getInstance().isSecretActivated
    }
}
