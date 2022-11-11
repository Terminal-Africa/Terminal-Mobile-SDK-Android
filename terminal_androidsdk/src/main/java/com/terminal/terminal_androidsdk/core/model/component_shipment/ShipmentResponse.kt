package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.ShipMetaData


data class ShipmentResponse (

  @SerializedName("address_to" )
  @Expose
  var addressTo        : String?           = null,
  @SerializedName("address_from")   @Expose var addressFrom      : String?           = null,
  @SerializedName("address_return")    @Expose var addressReturn    : String?           = null,
  @SerializedName("carrier")  @Expose var carrier          : String?           = null,
  @SerializedName("delivery_date")  @Expose var deliveryDate     : String?           = null,
  @SerializedName("delivery_arranged")  @Expose var deliveryArranged : String?           = null,
  @SerializedName("events")  @Expose var events           : ArrayList<Events> = arrayListOf(),
  @SerializedName("extras")  @Expose var extras           : Extras?           = Extras(),
  @SerializedName("metadata")  @Expose var metadata         : Metadata?         = null,
  //@SerializedName("metadata"          )  @Expose var metadata         : ShipMetaData?         = ShipMetaData(),
  @SerializedName("parcel")  @Expose var parcel           : String?           = null,
  @SerializedName("pickup_date")  @Expose var pickupDate       : String?           = null,
  @SerializedName("rate")  @Expose var rate             : String?           = null,
  @SerializedName("shipment_cost")  @Expose var shipmentCost     : Double?           = null,
  @SerializedName("shipment_currency")  @Expose var shipmentCurrency : String?           = null,
  @SerializedName("shipment_id")  @Expose var shipmentId       : String?           = null,
  @SerializedName("shipment_purpose")  @Expose var shipmentPurpose  : String?           = null,
  @SerializedName("status")  @Expose var status           : String?           = null,
  @SerializedName("user")  @Expose var user             : String?           = null,
  @SerializedName("created_at")  @Expose var createdAt        : String?           = null,
  @SerializedName("updated_at")  @Expose var updatedAt        : String?           = null,
  @SerializedName("__v")  @Expose var _v               : Int?              = null

)