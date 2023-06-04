package com.terminal.terminal_androidsdk.utils

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.terminal.terminal_androidsdk.core.network.BaseData
import retrofit2.Response
/**
 * Created by AYODEJI on 10/10/2020
 *
 *
 */

object Constant {

    const val BASE_TEST_URL = "https://sandbox.terminal.africa/"
    const val BASE_LIVE_URL = "https://api.terminal.africa/"


    const val BASE_TERMINAL_LIVE_URL = "https://terminal-api-staging.herokuapp.com/"
    const val BASE_TERMINAL_LIVE_UTIL = "https://terminal-api-production.herokuapp.com/"


    const val BASE_TER_TEST_URL = "https://staging-terminal.herokuapp.com/"
    const val BASE_TER_LIVE_URL = "https://terminal-node.herokuapp.com/"



    const val BASE_UR_RAVE = "https://api.flutterwave.com/"



    const val CREATE_ADDRESS = "v1"
    const val TERMINAL_ID_PATH= "store"
    const val TERMINAL_MER_PATH= "api/merchant"
    const val TERMINAL_UR_PATH= "api/users"
    const val BASE_TERMINAL_UTILS = "api/v1/utils"
    const val BASE_BANK_RAVE ="v3/banks/NG"
    const val BASE_BANK_RAVE_RESOLVE ="v3/accounts/resolve"
    const val BASE_WITHDRAW = "api/wallet/withdraw"
    const val BASE_DELAY = "/shipments/pickup-delay-report"


    const val ERROR = "Unable to initialize TShip SDK, API Key not found."

     fun getBaseError(response: Response<*>): BaseData<*>? {
        val gson = Gson()
        val type =
            object : TypeToken<BaseData<*>?>() {}.type
        return gson.fromJson(response.errorBody()?.charStream(), type)
    }
}