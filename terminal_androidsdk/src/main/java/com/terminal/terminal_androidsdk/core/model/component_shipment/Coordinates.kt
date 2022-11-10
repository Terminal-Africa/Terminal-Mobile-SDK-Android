package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Coordinates (

  @SerializedName("lat"      )  @Expose var lat     : Double? = null,
  @SerializedName("lng"      )  @Expose var lng     : Double? = null,
  @SerializedName("place_id" )  @Expose var placeId : String? = null

)