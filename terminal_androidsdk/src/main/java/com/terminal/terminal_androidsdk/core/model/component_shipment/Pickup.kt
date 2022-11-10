package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Pickup (

  @SerializedName("isRequested"         )  @Expose var isRequested         : Boolean?                       = null,
  @SerializedName("specialInstructions" )  @Expose var specialInstructions : ArrayList<SpecialInstructions> = arrayListOf(),
  @SerializedName("pickupDetails"       )  @Expose var pickupDetails       : PickupDetails?                 = PickupDetails()

)