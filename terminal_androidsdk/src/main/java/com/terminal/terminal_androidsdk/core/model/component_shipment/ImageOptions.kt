package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ImageOptions (

  @SerializedName("templateName" )  @Expose var templateName : String?  = null,
  @SerializedName("typeCode"     )  @Expose var typeCode     : String?  = null,
  @SerializedName("isRequested"  ) @Expose  var isRequested  : Boolean? = null

)