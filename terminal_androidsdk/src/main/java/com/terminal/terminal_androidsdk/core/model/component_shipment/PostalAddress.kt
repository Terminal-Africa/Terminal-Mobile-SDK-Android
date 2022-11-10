package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class PostalAddress (

  @SerializedName("postalCode"   )  @Expose var postalCode   : String? = null,
  @SerializedName("cityName"     )  @Expose var cityName     : String? = null,
  @SerializedName("countryCode"  )  @Expose var countryCode  : String? = null,
  @SerializedName("addressLine1" )  @Expose var addressLine1 : String? = null,
  @SerializedName("addressLine2" )  @Expose var addressLine2 : String? = null

)