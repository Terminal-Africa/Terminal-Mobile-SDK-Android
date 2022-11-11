 package com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Service (

  @SerializedName("Code"        ) var Code        : String? = null,
  @SerializedName("Description" ) var Description : String? = null

)