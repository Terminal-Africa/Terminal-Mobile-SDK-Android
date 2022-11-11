package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ShipmentPayload (

  @SerializedName("shipmentTrackingNumber"     )  @Expose var shipmentTrackingNumber     : String?                    = null,
  @SerializedName("cancelPickupUrl"            )  @Expose var cancelPickupUrl            : String?                    = null,
  @SerializedName("trackingUrl"                )  @Expose var trackingUrl                : String?                    = null,
  @SerializedName("dispatchConfirmationNumber" )  @Expose var dispatchConfirmationNumber : String?                    = null,
  @SerializedName("packages"                   )  @Expose var packages                   : ArrayList<Packages>        = arrayListOf(),
  @SerializedName("documents"                  )  @Expose var documents                  : ArrayList<Documents>       = arrayListOf(),
  @SerializedName("shipmentDetails"            )  @Expose var shipmentDetails            : ArrayList<ShipmentDetails> = arrayListOf(),
 @SerializedName("warnings"                   )  @Expose var warnings                   : ArrayList<String>          = arrayListOf()

)