package com.terminal.terminal_androidsdk.core.iinterface

import com.terminal.terminal_androidsdk.core.db.BaseData
import com.terminal.terminal_androidsdk.core.model.*

/**
 * Created by AYODEJI on 10/10/2020.
 * This is an interface class which the clients uses to get status of a Call from his applications
 *
 */
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




