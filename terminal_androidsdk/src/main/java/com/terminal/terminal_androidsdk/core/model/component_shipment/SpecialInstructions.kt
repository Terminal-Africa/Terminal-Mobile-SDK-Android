package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class SpecialInstructions (

  @SerializedName("value" )  @Expose var value : String? = null

)