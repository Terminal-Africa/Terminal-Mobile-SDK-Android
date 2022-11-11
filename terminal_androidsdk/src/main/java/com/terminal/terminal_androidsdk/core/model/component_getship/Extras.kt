 package com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShippingLabel


 data class Extras (

   @SerializedName("carrier_tracking_url" ) var carrierTrackingUrl : String?        = null,
   @SerializedName("shipping_label"       ) var shippingLabel      : ShippingLabel? = null,
   @SerializedName("shipping_label_url"   ) var shippingLabelUrl   : String?        = null,
   @SerializedName("tracking_number"      ) var trackingNumber     : String?        = null,
   @SerializedName("tracking_url"         ) var trackingUrl        : String?        = null,
   @SerializedName("reference"            ) var reference          : String?        = null

)