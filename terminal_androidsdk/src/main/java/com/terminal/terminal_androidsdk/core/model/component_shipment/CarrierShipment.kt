package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CarrierShipment (

  @SerializedName("plannedShippingDateAndTime" ) @Expose var plannedShippingDateAndTime : String?                         = null,
  @SerializedName("pickup"                     ) @Expose  var pickup                     : Pickup?                         = Pickup(),
  @SerializedName("productCode"                ) @Expose  var productCode                : String?                         = null,
  @SerializedName("localProductCode"           ) @Expose  var localProductCode           : String?                         = null,
  @SerializedName("accounts"                   ) @Expose  var accounts                   : ArrayList<Accounts>             = arrayListOf(),
  @SerializedName("valueAddedServices"         ) @Expose  var valueAddedServices         : ArrayList<String>               = arrayListOf(),
  @SerializedName("customerReferences"         ) @Expose  var customerReferences         : ArrayList<CustomerReferences>   = arrayListOf(),
  @SerializedName("outputImageProperties"      ) @Expose  var outputImageProperties      : OutputImageProperties?          = OutputImageProperties(),
  @SerializedName("customerDetails"            ) @Expose  var customerDetails            : CustomerDetails?                = CustomerDetails(),
  @SerializedName("content"                    ) @Expose  var content                    : Content?                        = Content(),
  @SerializedName("requestOndemandDeliveryURL" ) @Expose  var requestOndemandDeliveryURL : Boolean?                        = null,
  @SerializedName("shipmentNotification"       ) @Expose  var shipmentNotification       : ArrayList<ShipmentNotification> = arrayListOf(),
  @SerializedName("getOptionalInformation"     ) @Expose  var getOptionalInformation     : Boolean?                        = null,
  @SerializedName("onDemandDelivery"           ) @Expose  var onDemandDelivery           : OnDemandDelivery?               = OnDemandDelivery()

)