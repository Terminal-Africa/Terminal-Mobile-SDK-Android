package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("description" ) @Expose var description : String? = null,
  @SerializedName("name"        )  @Expose var name        : String? = null,
  @SerializedName("currency"    )  @Expose var currency    : String? = null,
  @SerializedName("value"       )  @Expose var value       : Int?    = null,
  @SerializedName("quantity"    )  @Expose var quantity    : Int?    = null,
  @SerializedName("weight"      )  @Expose var weight      : Int?    = null

)