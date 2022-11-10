package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Metadata (

  @SerializedName("shipment_payload" )  @Expose var shipmentPayload : ShipmentPayload? = ShipmentPayload(),
  @SerializedName("carrier_shipment" )  @Expose var carrierShipment : CarrierShipment? = CarrierShipment(),
  @SerializedName("carrier_pickup"   )  @Expose var carrierPickup   : CarrierPickup?   = CarrierPickup(),
  @SerializedName("selected_rate"    )  @Expose var selectedRate    : SelectedRate?    = SelectedRate()

)