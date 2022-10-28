package com.terminal.terminal_androidsdk.core

import com.terminal.terminal_androidsdk.core.network.BaseData
import com.terminal.terminal_androidsdk.core.model.*

/**
 * Created by AYODEJI on 10/10/2020.
 * This is an interface class which the clients uses to get status of a Call from his applications
 *
 */
interface  ITerminalConfiguration<T> {
    fun onResponse(result: T)
    fun onError(status: Boolean, message:String)
}



interface ITerminalAddress {
    fun onResponse(result: BaseData<GetAddressModel>)
    fun onError(status: Boolean, message:String)
}


interface ITerminalCreate {
    fun onResponse(result: BaseData<Address>)
    fun onError(status: Boolean, message:String)
}

interface ITerminalValidate {
    fun onResponse(result: BaseData<AddressValidationResponse>)
    fun onError(status: Boolean, message:String)
}

interface ITerminalCurrencyConfiguration {
    fun onResponse(result: BaseData<AddressValidationResponse>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalCountries{
    fun onResponse(callback: BaseData<List<TerminalCountries>>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalStates{
    fun onResponse(callback: BaseData<List<TerminalStates>>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalCities{
    fun onResponse(callback: BaseData<List<TerminalCities>>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalPackagingList{
    fun onResponse(callback: BaseData<List<PackagingResponse>>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalPackaging{
    fun onResponse(callback: BaseData<PackagingResponse>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalUserBalance{
    fun onResponse(callback: BaseData<UserBalance>)
    fun onError(status: Boolean, message:String)
}

interface  ITerminalUserProfile{
    fun onResponse(callback: BaseData<List<UserProfile>>)
    fun onError(status: Boolean, message:String)
}



interface  ITerminalRateForShipment{
    fun onResponse(callback: BaseData<List<RateModel>>)
    fun onError(status: Boolean, message:String)
}




