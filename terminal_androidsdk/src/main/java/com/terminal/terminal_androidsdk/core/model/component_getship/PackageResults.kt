package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShippingLabel


data class PackageResults (

  @SerializedName("TrackingNumber"        ) var TrackingNumber        : String?                = null,
  @SerializedName("ServiceOptionsCharges" ) var ServiceOptionsCharges : ServiceOptionsCharges? = null,
  @SerializedName("ShippingLabel"         ) var ShippingLabel         : ShippingLabel?        = null,

)