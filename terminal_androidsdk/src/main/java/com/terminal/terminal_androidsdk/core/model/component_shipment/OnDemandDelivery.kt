package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class OnDemandDelivery (

  @SerializedName("deliveryOption"      )  @Expose var deliveryOption      : String? = null,
  @SerializedName("location"            ) @Expose  var location            : String? = null,
  @SerializedName("specialInstructions" )  @Expose var specialInstructions : String? = null,
  @SerializedName("authorizerName"      )  @Expose var authorizerName      : String? = null

)