package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class LineItems (

  @SerializedName("number"              )  @Expose var number              : Int?      = null,
  @SerializedName("description"         )  @Expose var description         : String?   = null,
  @SerializedName("price"               )  @Expose var price               : Int?      = null,
  @SerializedName("quantity"            )  @Expose var quantity            : Quantity? = Quantity(),
  @SerializedName("manufacturerCountry" )  @Expose var manufacturerCountry : String?   = null,
  @SerializedName("weight"              )  @Expose var weight              : Weight?   = Weight()

)