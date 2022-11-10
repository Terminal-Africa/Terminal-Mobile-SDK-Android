package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Carriers (

  @SerializedName("domestic"      ) @Expose var domestic      : ArrayList<String> = arrayListOf(),
  @SerializedName("regional"      ) @Expose  var regional      : ArrayList<String> = arrayListOf(),
  @SerializedName("international" ) @Expose  var international : ArrayList<String> = arrayListOf()

)