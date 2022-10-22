package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Packaging {
    val  name:String  = ""
    @SerializedName("size_unit")
    @Expose
    val sizeUnit:String = ""
    val type:String = ""
    val height:Double = 0.0
    val length:Double = 0.0
    val weight:Double = 0.0
    @SerializedName("weight_unit")
    @Expose
    val weightUnit = ""
    val width:Double = 0.0
    val description:String = ""
}


class PackagingResponse {
    val  name:String  = ""
    @SerializedName("size_unit")
    @Expose
    val sizeUnit:String = ""
    val type:String = ""
    val height:Double = 0.0
    val length:Double = 0.0
    val weight:Double = 0.0
    @SerializedName("weight_unit")
    @Expose
    val weightUnit = ""
    val width:Double = 0.0
    val description:String = ""
    @SerializedName("packaging_id")
    @Expose
    val packagingId = ""
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
    @SerializedName("id")
    @Expose
    val id:String = ""

}

