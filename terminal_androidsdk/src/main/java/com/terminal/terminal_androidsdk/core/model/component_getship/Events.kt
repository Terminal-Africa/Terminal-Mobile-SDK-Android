 package com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Events (

  @SerializedName("created_at"  ) var createdAt   : String? = null,
  @SerializedName("description" ) var description : String? = null,
  @SerializedName("location"    ) var location    : String? = null,
  @SerializedName("status"      ) var status      : String? = null

)