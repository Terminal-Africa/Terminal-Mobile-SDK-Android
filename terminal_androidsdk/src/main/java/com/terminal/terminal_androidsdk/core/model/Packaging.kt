package com.terminal.terminal_androidsdk.core.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
class Packaging (
    val  name:String,
    val size_unit:String,
    val type:String,
    val height:Double,
    val length:Double,
    val weight:Double,
    val weight_unit :String,
    val width:Double,
   // val description:String = ""
)


@Parcelize
class PackagingResponse : Parcelable {
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

data class GetPackagingList(val packaging:List<PackagingResponse> = arrayListOf(), val pagination: Pagination, )

