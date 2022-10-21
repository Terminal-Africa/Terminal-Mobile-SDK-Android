package com.terminal.terminal_androidsdk.core.iinterface

import com.terminal.terminal_androidsdk.core.BaseData
import com.terminal.terminal_androidsdk.core.model.Address
import com.terminal.terminal_androidsdk.core.model.AddressValidationResponse
import com.terminal.terminal_androidsdk.core.model.GetAddressModel
/**
 * Created by AYODEJI on 10/10/2020.
 * This is an interface class which the clients uses to get status of a Call from his applications
 *
 */
interface ITerminalConfiguration {
    fun onResponse(result:BaseData<GetAddressModel>)
    fun onError(status: Boolean, message:String)
}


interface ITerminalCreateConfiguration {
    fun onResponse(result:BaseData<Address>)
    fun onError(status: Boolean, message:String)
}


interface ITerminalValidateConfiguration {
    fun onResponse(result:BaseData<AddressValidationResponse>)
    fun onError(status: Boolean, message:String)
}
