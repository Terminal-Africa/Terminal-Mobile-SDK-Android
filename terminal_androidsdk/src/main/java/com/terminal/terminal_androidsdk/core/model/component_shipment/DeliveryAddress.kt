package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DeliveryAddress (

  @SerializedName("city"    ) @Expose var city    : String? = null,
  @SerializedName("state"   )  @Expose var state   : String? = null,
  @SerializedName("country" )  @Expose var country : String? = null,
  @SerializedName("zip"     )  @Expose var zip     : String? = null

)