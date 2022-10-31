package com.terminal.terminal_androidsdk.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.terminal.terminal_androidsdk.core.network.BaseData
import retrofit2.Response
/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
object Constant {

    const val BASE_TEST_URL = "https://sandbox.terminal.africa/"
    const val BASE_LIVE_URL = "https://api.terminal.africa/"

    const val DEVELOPER = "developer"
    const val CREATE_ADDRESS = "v1"

    const val ERROR = "Unable to initialize TShip SDK, API Key not found."

     fun getBaseError(response: Response<*>): BaseData<*>? {
        val gson = Gson()
        val type =
            object : TypeToken<BaseData<*>?>() {}.type
        return gson.fromJson(response.errorBody()?.charStream(), type)
    }
}