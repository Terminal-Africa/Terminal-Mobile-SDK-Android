package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CustomerReferences (

  @SerializedName("typeCode" )  @Expose var typeCode : String? = null,
  @SerializedName("value"    )  @Expose var value    : String? = null

)