package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ExportDeclaration (

  @SerializedName("lineItems" ) @Expose var lineItems : ArrayList<LineItems> = arrayListOf(),
  @SerializedName("invoice"   )  @Expose var invoice   : Invoice?             = Invoice()

)