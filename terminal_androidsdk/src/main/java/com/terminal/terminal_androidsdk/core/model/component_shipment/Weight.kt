package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Weight (

  @SerializedName("netValue"   )  @Expose var netValue   : Double? = null,
  @SerializedName("grossValue" )  @Expose var grossValue : Double? = null

)