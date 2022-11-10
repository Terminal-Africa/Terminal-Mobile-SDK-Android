package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ShipmentDetails (

  @SerializedName("productCode"           )  @Expose var productCode           : String?             = null,
  @SerializedName("isCustomsDeclarable"   )  @Expose var isCustomsDeclarable   : Boolean?            = null,
  @SerializedName("declaredValue"         )  @Expose var declaredValue         : Int?                = null,
  @SerializedName("declaredValueCurrency" )  @Expose var declaredValueCurrency : String?             = null,
  @SerializedName("packages"              )  @Expose var packages              : ArrayList<Packages> = arrayListOf(),
  @SerializedName("unitOfMeasurement"     )  @Expose var unitOfMeasurement     : String?             = null

)