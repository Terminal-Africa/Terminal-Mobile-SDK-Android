package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Quantity (

  @SerializedName("value"             )  @Expose var value             : Double?    = null,
  @SerializedName("unitOfMeasurement" )  @Expose var unitOfMeasurement : String? = null

)