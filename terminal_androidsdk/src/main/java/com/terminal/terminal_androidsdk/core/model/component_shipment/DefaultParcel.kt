package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DefaultParcel (

  @SerializedName("packaging_dimension" ) @Expose var packagingDimension : PackagingDimension? = PackagingDimension(),
  @SerializedName("parcel_total_weight" )  @Expose var parcelTotalWeight  : Double?                = null

)