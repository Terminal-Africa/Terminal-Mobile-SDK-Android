package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class OutputImageProperties (

  @SerializedName("allDocumentsInOneImage" ) @Expose var allDocumentsInOneImage : Boolean?                = null,
  @SerializedName("encodingFormat"         ) @Expose  var encodingFormat         : String?                 = null,
  @SerializedName("imageOptions"           ) @Expose  var imageOptions           : ArrayList<ImageOptions> = arrayListOf()

)