package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class TransportationCharges (

  @SerializedName("CurrencyCode"  ) var CurrencyCode  : String? = null,
  @SerializedName("MonetaryValue" ) var MonetaryValue : String? = null

)