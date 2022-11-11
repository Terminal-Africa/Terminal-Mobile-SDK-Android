package  com.terminal.terminal_androidsdk.core.model.component_getship


import com.google.gson.annotations.SerializedName


data class ShipmentCharges (
  @SerializedName("TransportationCharges" ) var TransportationCharges : TransportationCharges? = null,
  @SerializedName("ServiceOptionsCharges" ) var ServiceOptionsCharges : ServiceOptionsCharges? = null,
  @SerializedName("TotalCharges"          ) var TotalCharges          : TotalCharges?      = null,

)