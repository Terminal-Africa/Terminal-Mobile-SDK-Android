package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class ReceiverDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?      = PostalAddress(),
  @SerializedName("contactInformation" )  @Expose var contactInformation : ContactInformation? = ContactInformation()

)