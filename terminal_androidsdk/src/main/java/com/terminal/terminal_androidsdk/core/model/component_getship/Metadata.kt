package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Metadata (

  @SerializedName("rate_payload"     ) var ratePayload    : RatePayload?   = null,
  @SerializedName("landed_cost_data" ) var landedCostData : LandedCostData? = null,
  @SerializedName("default_parcel"   ) var defaultParcel  : DefaultParcel?  = null,
  @SerializedName("address_payload"  ) var addressPayload : AddressPayload? = null,

)