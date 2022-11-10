package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Content (

  @SerializedName("description"           ) @Expose var description           : String?             = null,
  @SerializedName("packages"              ) @Expose  var packages              : ArrayList<Packages> = arrayListOf(),
  @SerializedName("declaredValueCurrency" )  @Expose var declaredValueCurrency : String?             = null,
  @SerializedName("declaredValue"         )  @Expose var declaredValue         : Int?                = null,
  @SerializedName("incoterm"              ) @Expose  var incoterm              : String?             = null,
  @SerializedName("isCustomsDeclarable"   ) @Expose  var isCustomsDeclarable   : Boolean?            = null,
  @SerializedName("unitOfMeasurement"     ) @Expose  var unitOfMeasurement     : String?             = null,
  @SerializedName("exportDeclaration"     ) @Expose  var exportDeclaration     : ExportDeclaration?  = ExportDeclaration()

)