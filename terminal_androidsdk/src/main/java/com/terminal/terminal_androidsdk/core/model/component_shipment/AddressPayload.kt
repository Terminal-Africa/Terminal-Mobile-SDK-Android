package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class AddressPayload (

  @SerializedName("pickup_address"   )  @Expose var pickupAddress   : PickupAddress?   = PickupAddress(),
  @SerializedName("delivery_address" )  @Expose var deliveryAddress : DeliveryAddress? = DeliveryAddress()

)