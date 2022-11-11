package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class RatePayload (

  //@SerializedName("Service"               ) var Service               : Service?               = Service(),
  @SerializedName("RatedShipmentAlert"    ) var RatedShipmentAlert    : RatedShipmentAlert?   = null,
  @SerializedName("BillingWeight"         ) var BillingWeight         : BillingWeight?        = null,
  @SerializedName("TransportationCharges" ) var TransportationCharges : TransportationCharges? = null,
  @SerializedName("ServiceOptionsCharges" ) var ServiceOptionsCharges : ServiceOptionsCharges? = null,
  @SerializedName("TotalCharges"          ) var TotalCharges          : TotalCharges?         = null,
  @SerializedName("RatedPackage"          ) var RatedPackage          : RatedPackage?        = null,

)