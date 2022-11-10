package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class PackagingDimension (

  @SerializedName("length" )  @Expose var length : Int? = null,
  @SerializedName("height" )  @Expose var height : Int? = null,
  @SerializedName("width"  )  @Expose var width  : Int? = null

)