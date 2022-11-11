package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Parcel (

  @SerializedName("_id")  @Expose var Id          : String?          = null,
  @SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  @SerializedName("packaging")  @Expose var packaging   : Packaging?       = Packaging(),
  @SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
  @SerializedName("user")  @Expose var user        : String?          = null,
  @SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
  @SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
  @SerializedName("__v")  @Expose var _v          : Double?             = null

)