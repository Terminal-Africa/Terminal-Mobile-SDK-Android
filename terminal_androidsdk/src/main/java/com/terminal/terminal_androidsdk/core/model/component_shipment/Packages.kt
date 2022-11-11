package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Packages (

  @SerializedName("weight")  @Expose var weight     : Double?        = null,
  @SerializedName("dimensions")  @Expose var dimensions : Dimensions? = null

)