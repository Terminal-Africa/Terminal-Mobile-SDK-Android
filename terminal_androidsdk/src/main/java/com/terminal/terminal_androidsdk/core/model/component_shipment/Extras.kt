package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Extras (

  @SerializedName("carrier_tracking_url"   )  @Expose var carrierTrackingUrl   : String?        = null,
  @SerializedName("commercial_invoice_url" )  @Expose var commercialInvoiceUrl : String?        = null,
  @SerializedName("reference"              )  @Expose var reference            : String?        = null,
  @SerializedName("shipping_label"         )  @Expose var shippingLabel        : Documents? = Documents(),
  @SerializedName("shipping_label_url"     )  @Expose var shippingLabelUrl     : String?        = null,
  @SerializedName("tracking_number"        )  @Expose var trackingNumber       : String?        = null,
  @SerializedName("tracking_url"           )  @Expose var trackingUrl          : String?        = null

)