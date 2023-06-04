package com.terminal.terminal_androidsdk.core

/**
 * Created by AYODEJI on 10/10/2020.
 * This is an interface class which the clients uses to get status of a Call from his applications
 *
 */
interface  ITerminalConfiguration<T> {
    fun onResponse(result: T)
    fun onError(status: Boolean, message:String)
}




