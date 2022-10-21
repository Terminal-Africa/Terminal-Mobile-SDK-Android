package com.terminal.terminal_androidsdk.core
import com.terminal.terminal_androidsdk.core.model.AddressValidation
import com.terminal.terminal_androidsdk.core.model.CreateAddress
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCreateConfiguration
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalValidateConfiguration
import com.terminal.terminal_androidsdk.utils.MemoryManager

/**
 * Created by AYODEJI on 10/10/2020.
 * This can be referenced globally , achieve through the Object type in Kotlin
 * We have the various address end-point.
 * The class is initiated for transaction using the Init method
 */

object TerminalConfiguration  {
    private var mProxy: DataCentric? = null
    init {
        mProxy = DataCentric.getInstance()
    }

    fun init(secretKey: String, isLive:Boolean){
          MemoryManager.getInstance().putUserSecretKey(secretKey)
          MemoryManager.getInstance().putIsLive(isLive)
    }

    fun createAddress(callback: ITerminalCreateConfiguration?, createAddress: CreateAddress) {
        mProxy?.createAddress(callback,createAddress)
    }

    fun validateAddress(callback: ITerminalCreateConfiguration?, createAddress: CreateAddress) {
        mProxy?.createAddress(callback,createAddress)
    }

    fun getAddresses(callback: ITerminalConfiguration?) {
        mProxy?.getAddresses(callback)
    }

    fun getAddressesById(callback: ITerminalConfiguration?, addressId:String) {
        mProxy?.getAddressesById(callback,addressId)
    }

    fun validateAddress(callback: ITerminalValidateConfiguration?, addressValidation: AddressValidation) {
        mProxy?.validateAddress(callback,addressValidation)
    }


}
