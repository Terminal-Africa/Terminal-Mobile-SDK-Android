package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Accounts (

  @SerializedName("typeCode" )  @Expose var typeCode : String? = null,
  @SerializedName("number"   )  @Expose var number   : String? = null

)