package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ShippingLabel (

  @SerializedName("imageFormat" )  @Expose var imageFormat : String? = null,
  @SerializedName("content"     )  @Expose var content     : String? = null,
  @SerializedName("typeCode"    )  @Expose var typeCode    : String? = null,
  @SerializedName("format"      )  @Expose var format      : String? = null,
  @SerializedName("url"         )  @Expose var url         : String? = null

)