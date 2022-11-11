package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class ShipmentPayload (

  @SerializedName("Disclaimer"                      ) var Disclaimer                      : Disclaimer?     = null,
  @SerializedName("RatingMethod"                    ) var RatingMethod                    : String?          = null,
  @SerializedName("BillableWeightCalculationMethod" ) var BillableWeightCalculationMethod : String?          = null,
  @SerializedName("BillingWeight"                   ) var BillingWeight                   : BillingWeight?   = null,
  @SerializedName("ShipmentIdentificationNumber"    ) var ShipmentIdentificationNumber    : String?          = null,
  @SerializedName("PackageResults"                  ) var PackageResults                  : PackageResults? = null,

)