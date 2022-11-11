package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CustomerDetails (

  @SerializedName("shipperDetails"  )  @Expose var shipperDetails  : ShipperDetails?  =null,
  @SerializedName("receiverDetails" )   @Expose var receiverDetails : ReceiverDetails? =null

)