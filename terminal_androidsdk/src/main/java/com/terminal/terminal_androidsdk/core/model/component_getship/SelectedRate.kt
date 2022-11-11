package com.terminal.terminal_androidsdk.core.model.component_getship

import com.terminal.terminal_androidsdk.core.model.component_shipment.DeliveryAddress
import com.terminal.terminal_androidsdk.core.model.component_shipment.Parcel
import com.terminal.terminal_androidsdk.core.model.component_shipment.PickupAddress


import com.google.gson.annotations.SerializedName


data class SelectedRate (

  @SerializedName("_id"                      ) var Id                     : String?           = null,
  @SerializedName("amount"                   ) var amount                 : Double?           = null,
  @SerializedName("carrier_logo"             ) var carrierLogo            : String?           = null,
  @SerializedName("carrier_name"             ) var carrierName            : String?           = null,
  @SerializedName("carrier_rate_description" ) var carrierRateDescription : String?           = null,
  @SerializedName("carrier_reference"        ) var carrierReference       : String?           = null,
  @SerializedName("carrier_slug"             ) var carrierSlug            : String?           = null,
  @SerializedName("currency"                 ) var currency               : String?           = null,
  @SerializedName("delivery_address"         ) var deliveryAddress        : DeliveryAddress? = null,
  @SerializedName("delivery_date"            ) var deliveryDate           : String?           = null,
  @SerializedName("delivery_eta"             ) var deliveryEta            : Double?              = null,
  @SerializedName("delivery_time"            ) var deliveryTime           : String?           = null,
  @SerializedName("id"                       ) var selectedId                     : String?           = null,
  @SerializedName("insurance_coverage"       ) var insuranceCoverage      : Double?              = null,
  @SerializedName("includes_duties"          ) var includesDuties         : Boolean?          = null,
  @SerializedName("insurance_fee"            ) var insuranceFee           : Double?              = null,
  @SerializedName("includes_insurance"       ) var includesInsurance      : Boolean?          = null,
  @SerializedName("metadata"                 ) var metadata               : Metadata?         = null,
  @SerializedName("parcel"                   ) var parcel                 : Parcel?          = null,
  @SerializedName("pickup_address"           ) var pickupAddress          : PickupAddress?   = null,
  @SerializedName("pickup_eta"               ) var pickupEta              : Double?              = null,
  @SerializedName("pickup_time"              ) var pickupTime             : String?           = null,
  @SerializedName("rate_id"                  ) var rateId                 : String?           = null,
  @SerializedName("used"                     ) var used                   : Boolean?          = null,
  @SerializedName("user"                     ) var user                   : User?            = null,
  @SerializedName("breakdown"                ) var breakdown              : ArrayList<String> = arrayListOf(),
  @SerializedName("__v"                      ) var _v                     : Double?              = null,
  @SerializedName("created_at"               ) var createdAt              : String?           = null,
  @SerializedName("updated_at"               ) var updatedAt              : String?           = null

)