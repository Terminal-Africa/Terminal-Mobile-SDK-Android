package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Metadata (

  //@SerializedName("shipment_payload" )  @Expose var shipmentPayload : ShipmentPayload? = null,
 @SerializedName("carrier_shipment" )  @Expose var carrierShipment : CarrierShipment? = null,
  @SerializedName("carrier_pickup"   )  @Expose var carrierPickup   : CarrierPickup?   = null,
  @SerializedName("selected_rate")  @Expose var selectedRate    : SelectedRate?    = null

)