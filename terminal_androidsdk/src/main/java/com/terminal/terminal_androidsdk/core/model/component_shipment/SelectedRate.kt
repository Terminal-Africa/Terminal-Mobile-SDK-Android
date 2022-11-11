package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class SelectedRate (

  @SerializedName("_id")  @Expose var Id                     : String?           = null,
  @SerializedName("amount")  @Expose var amount                 : Double?           = null,
 // @SerializedName("breakdown")  @Expose var breakdown              : ArrayList<String> = arrayListOf(),
  @SerializedName("carrier_logo")  @Expose var carrierLogo            : String?           = null,
  @SerializedName("carrier_name")  @Expose var carrierName            : String?           = null,
  @SerializedName("carrier_rate_description")   @Expose var carrierRateDescription : String?           = null,
  @SerializedName("carrier_reference")  @Expose var carrierReference       : String?           = null,
  @SerializedName("carrier_slug")  @Expose var carrierSlug            : String?           = null,
  @SerializedName("currency")  @Expose var currency               : String?           = null,
  @SerializedName("delivery_address")  @Expose var deliveryAddress        : DeliveryAddress?  = null,
  @SerializedName("delivery_date")  @Expose var deliveryDate           : String?           = null,
  @SerializedName("delivery_eta")   @Expose var deliveryEta            : Double?              = null,
  @SerializedName("delivery_time")  @Expose var deliveryTime           : String?           = null,
  @SerializedName("id")  @Expose var rate_Id                     : String?           = null,
  @SerializedName("insurance_coverage")  @Expose var insuranceCoverage      : Double?              = null,
  @SerializedName("includes_duties")  @Expose var includesDuties         : Boolean?          = null,
  @SerializedName("insurance_fee")  @Expose var insuranceFee           : Double?              = null,
  @SerializedName("includes_insurance")  @Expose var includesInsurance      : Boolean?          = null,
 @SerializedName("metadata")  @Expose var metadata               : Metadata?         = null,
@SerializedName("parcel")  @Expose var parcel                 : Parcel?           = null,
 @SerializedName("pickup_address")  @Expose var pickupAddress          : PickupAddress?    =null,
  @SerializedName("pickup_eta")  @Expose var pickupEta              : Double?              = null,
  @SerializedName("pickup_time")  @Expose var pickupTime             : String?           = null,
  @SerializedName("rate_id")  @Expose var rateId                 : String?           = null,
  @SerializedName("used")  @Expose var used                   : Boolean?          = null,
 @SerializedName("user")  @Expose var user                   : User?             = null,
  @SerializedName("__v")  @Expose var _v                     : Double?              = null,
  @SerializedName("created_at")  @Expose var createdAt              : String?           = null,
  @SerializedName("updated_at")  @Expose var updatedAt              : String?           = null

)