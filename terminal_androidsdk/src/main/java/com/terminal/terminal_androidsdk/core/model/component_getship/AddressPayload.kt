package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_shipment.DeliveryAddress
import com.terminal.terminal_androidsdk.core.model.component_shipment.PickupAddress


data class AddressPayload (

  @SerializedName("pickup_address"   ) var pickupAddress   : PickupAddress?   = null,
  @SerializedName("delivery_address" ) var deliveryAddress : DeliveryAddress?  = null

)