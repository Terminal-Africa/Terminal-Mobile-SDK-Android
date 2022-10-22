package com.terminal.terminal_androidsdk.core
import com.terminal.terminal_androidsdk.core.db.DataCentric
import com.terminal.terminal_androidsdk.core.iinterface.*
import com.terminal.terminal_androidsdk.core.model.AddressValidation
import com.terminal.terminal_androidsdk.core.model.CreateAddress
import com.terminal.terminal_androidsdk.core.model.Packaging
import com.terminal.terminal_androidsdk.utils.MemoryManager

/**
 * Created by AYODEJI on 10/10/2020.
 * This can be referenced globally , achieve through the Object type in Kotlin
 * We have the various address end-point.
 * The class is initiated for transaction using the Init method
 */

object TShipSDK  {
    private var mProxy: DataCentric? = null
    init {
        mProxy = DataCentric.getInstance()
    }

    fun init(secretKey: String, isLive:Boolean){
          MemoryManager.getInstance().putUserSecretKey(secretKey)
          MemoryManager.getInstance().putIsLive(isLive)
    }

    fun createAddress(callback: ITerminalCreate?, createAddress: CreateAddress) {
        mProxy?.createAddress(callback,createAddress)
    }

    fun updateAddress(callback: ITerminalCreate?,addressId: String, createAddress: CreateAddress) {
        mProxy?.updateAddress(callback,addressId,createAddress)
    }

    fun getAddresses(callback: ITerminalAddress?, page:Int, limit:Int ) {
        mProxy?.getAddresses(callback,page,limit)
    }

    fun getAddressesById(callback: ITerminalAddress?, addressId:String) {
        mProxy?.getAddressesById(callback,addressId)
    }

    fun deleteAddress(callback: ITerminalCreate?, addressId:String) {
        mProxy?.deleteAddress(callback,addressId)
    }

    fun validateAddress(callback: ITerminalValidate?, addressValidation: AddressValidation) {
        mProxy?.validateAddress(callback,addressValidation)
    }

    fun getCountries(callback: ITerminalCountries) {
        mProxy?.getCountries(callback)
    }

    fun getStateInCountry(callback: ITerminalStates,countryCode:String) {
        mProxy?.getStatesInCountry(callback,countryCode)
    }

    fun getCitiesInState(callback: ITerminalCities,countryCode:String, stateCode:String) {
        mProxy?.getCitiesInCountry(callback,countryCode,stateCode)
    }

    fun createPackaging(callback:  ITerminalPackaging?, packaging: Packaging) {
        mProxy?.createPackaging(callback,packaging)
    }

    fun updatePackaging(callback:  ITerminalPackaging?, packagingId: String,  packaging: Packaging) {
        mProxy?.updatePackaging(callback,packagingId,packaging)
    }

    fun deletePackaging(callback:  ITerminalPackaging?, packagingId: String) {
        mProxy?.deletePackaging(callback,packagingId)
    }

    fun getSpecificPackaging(callback:  ITerminalPackaging?, packagingId: String) {
        mProxy?.getSpecificPackaging(callback,packagingId)
    }

    fun getSpecificPackaging(callback:  ITerminalPackagingList?) {
        mProxy?.getPackaging(callback)
    }

}
