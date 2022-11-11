package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class PackagingDimension (

  @SerializedName("length" )  @Expose var length : Double? = null,
  @SerializedName("height" )  @Expose var height : Double? = null,
  @SerializedName("width"  )  @Expose var width  : Double? = null

)