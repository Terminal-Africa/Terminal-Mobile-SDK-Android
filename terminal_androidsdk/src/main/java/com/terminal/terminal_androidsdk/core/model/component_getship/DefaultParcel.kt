 package com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_shipment.PackagingDimension


 data class DefaultParcel (

   @SerializedName("packaging_dimension" ) var packagingDimension : PackagingDimension? = null,
   @SerializedName("parcel_total_weight" ) var parcelTotalWeight  : Double?                = null

)