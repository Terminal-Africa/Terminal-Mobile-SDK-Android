package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ShipmentNotification (

  @SerializedName("typeCode"   )  @Expose var typeCode   : String? = null,
  @SerializedName("receiverId" )  @Expose var receiverId : String? = null

)