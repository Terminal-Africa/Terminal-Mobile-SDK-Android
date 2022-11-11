package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("description" ) @Expose var description : String? = null,
  @SerializedName("name"        )  @Expose var name        : String? = null,
  @SerializedName("currency"    )  @Expose var currency    : String? = null,
  @SerializedName("value"       )  @Expose var value       : Double?    = null,
  @SerializedName("quantity"    )  @Expose var quantity    : Double?    = null,
  @SerializedName("weight"      )  @Expose var weight      : Double?    = null

)