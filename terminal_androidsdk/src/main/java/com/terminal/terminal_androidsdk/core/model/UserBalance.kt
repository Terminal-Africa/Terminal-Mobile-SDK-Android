package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
class UserBalance {
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
    val active:Boolean = false
    val amount:Double = 0.0
    val currency:String? = null
    val name:String? = null
    val user:String? =null

}