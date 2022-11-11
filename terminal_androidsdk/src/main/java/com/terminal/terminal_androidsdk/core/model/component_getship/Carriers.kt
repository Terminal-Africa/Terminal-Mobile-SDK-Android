 package com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Carriers (

  @SerializedName("domestic"      ) var domestic      : ArrayList<String> = arrayListOf(),
  @SerializedName("regional"      ) var regional      : ArrayList<String> = arrayListOf(),
  @SerializedName("international" ) var international : ArrayList<String> = arrayListOf()

)