package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ContactInformation (

  @SerializedName("email"       )   @Expose var email       : String? = null,
  @SerializedName("phone"       )  @Expose var phone       : String? = null,
  @SerializedName("companyName" )  @Expose var companyName : String? = null,
  @SerializedName("fullName"    )  @Expose var fullName    : String? = null

)