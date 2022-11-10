package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CarrierPickup (

  @SerializedName("plannedPickupDateAndTime" )  @Expose var plannedPickupDateAndTime : String?                        = null,
  @SerializedName("accounts"                 )  @Expose var accounts                 : ArrayList<Accounts>            = arrayListOf(),
  @SerializedName("customerDetails"          )  @Expose var customerDetails          : CustomerDetails?               = CustomerDetails(),
  @SerializedName("specialInstructions"      )  @Expose var specialInstructions      : ArrayList<SpecialInstructions> = arrayListOf(),
  @SerializedName("shipmentDetails"          )  @Expose var shipmentDetails          : ArrayList<ShipmentDetails>     = arrayListOf()

)