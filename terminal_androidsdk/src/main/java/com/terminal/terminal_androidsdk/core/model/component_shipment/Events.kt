package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Events (

  @SerializedName("created_at"  )  @Expose var createdAt   : String? = null,
  @SerializedName("description" )  @Expose var description : String? = null,
  @SerializedName("location"    )  @Expose var location    : String? = null,
  @SerializedName("status"      )  @Expose var status      : String? = null

)