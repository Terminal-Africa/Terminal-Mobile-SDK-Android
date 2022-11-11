package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.SerializedName


data class Coordinates (

  @SerializedName("lat"      ) var lat     : Double? = null,
  @SerializedName("lng"      ) var lng     : Double? = null,
  @SerializedName("place_id" ) var placeId : String? = null

)