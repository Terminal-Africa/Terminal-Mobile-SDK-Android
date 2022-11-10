package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Invoice (

  @SerializedName("number"             )  @Expose var number             : String?                       = null,
  @SerializedName("date"               )  @Expose var date               : String?                       = null,
  @SerializedName("function"           )  @Expose var function           : String?                       = null,
  @SerializedName("totalNetWeight"     )  @Expose var totalNetWeight     : Int?                          = null,
  @SerializedName("totalGrossWeight"   )  @Expose var totalGrossWeight   : Int?                          = null,
  @SerializedName("customerReferences" )  @Expose var customerReferences : ArrayList<CustomerReferences> = arrayListOf()

)