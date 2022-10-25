package com.terminal.terminal_androidsdk.core
import com.terminal.terminal_androidsdk.core.db.AddressRemote
import com.terminal.terminal_androidsdk.core.db.MiscellanousRemote
import com.terminal.terminal_androidsdk.core.iinterface.*
import com.terminal.terminal_androidsdk.core.model.*
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
    private var miscellanousRemote: MiscellanousRemote? = null


    init {
        addressesRemote = AddressRemote.getInstance()
        miscellanousRemote = MiscellanousRemote.getInstance()
    }

    fun init(secretKey: String, isLive:Boolean){
          MemoryManager.getInstance().putUserSecretKey(secretKey)
          MemoryManager.getInstance().putIsLive(isLive)
    }

    fun createAddress(callback: ITerminalCreate?, createAddress: CreateAddress?) {
        if(isSecretKeyAdded() && createAddress != null){
            addressesRemote?.createAddress(callback,createAddress)
        } else callback?.onError(false,ERROR)
    }

    fun updateAddress(callback: ITerminalCreate?,addressId: String, createAddress: UpdateAddress) {
        if(isSecretKeyAdded()){
            addressesRemote?.updateAddress(callback,addressId,createAddress)
        } else callback?.onError(false,ERROR)
    }

    fun getAddresses(callback: ITerminalAddress?, page:Int, limit:Int = 25) {
        if(isSecretKeyAdded()){
            addressesRemote?.getAddresses(callback,page,limit)
        } else callback?.onError(false,ERROR)
    }

    fun getAddressesById(callback: ITerminalAddress?, addressId:String) {
        if(isSecretKeyAdded()){
            addressesRemote?.getAddressesById(callback,addressId)
        } else callback?.onError(false,ERROR)
    }

    fun deleteAddress(callback: ITerminalCreate?, addressId:String) {
        if(isSecretKeyAdded()){
            addressesRemote?.deleteAddress(callback,addressId)
        } else callback?.onError(false,ERROR)
    }

    fun validateAddress(callback: ITerminalValidate?, addressValidation: AddressValidation) {
        if(isSecretKeyAdded()){
            addressesRemote?.validateAddress(callback,addressValidation)
        } else callback?.onError(false,ERROR)

    }

    fun getCountries(callback: ITerminalCountries) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.getCountries(callback)
        } else callback.onError(false,ERROR)

    }

    fun getStateInCountry(callback: ITerminalStates,countryCode:String) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.getStatesInCountry(callback,countryCode)
        } else callback.onError(false,ERROR)
    }

    fun getCitiesInState(callback: ITerminalCities,countryCode:String, stateCode:String) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.getCitiesInCountry(callback,countryCode,stateCode)
        } else callback.onError(false,ERROR)
    }

    fun createPackaging(callback:  ITerminalPackaging?, packaging: Packaging) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.createPackaging(callback,packaging)
        } else callback?.onError(false,ERROR)
    }

    fun updatePackaging(callback:  ITerminalPackaging?, packagingId: String,  packaging: Packaging) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.updatePackaging(callback,packagingId,packaging)
        } else callback?.onError(false,ERROR)
    }

    fun deletePackaging(callback:  ITerminalPackaging?, packagingId: String) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.deletePackaging(callback,packagingId)
        } else callback?.onError(false,ERROR)

    }

    fun getSpecificPackaging(callback:  ITerminalPackaging?, packagingId: String) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.getSpecificPackaging(callback,packagingId)
        } else callback?.onError(false,ERROR)
    }

    fun getSpecificPackaging(callback:  ITerminalPackagingList?) {
        if(isSecretKeyAdded()){
            miscellanousRemote?.getPackaging(callback)
        } else callback?.onError(false,ERROR)
    }


    private fun isSecretKeyAdded():Boolean{
        return MemoryManager.getInstance().isSecretActivated
    }
}
