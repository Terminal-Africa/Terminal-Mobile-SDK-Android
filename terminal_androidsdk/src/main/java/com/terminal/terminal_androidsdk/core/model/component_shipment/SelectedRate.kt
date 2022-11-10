package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class SelectedRate (

  @SerializedName("_id"                      )  @Expose var Id                     : String?           = null,
  @SerializedName("amount"                   )  @Expose var amount                 : Double?           = null,
  @SerializedName("breakdown"                )  @Expose var breakdown              : ArrayList<String> = arrayListOf(),
  @SerializedName("carrier_logo"             )  @Expose var carrierLogo            : String?           = null,
  @SerializedName("carrier_name"             )  @Expose var carrierName            : String?           = null,
  @SerializedName("carrier_rate_description" )   @Expose var carrierRateDescription : String?           = null,
  @SerializedName("carrier_reference"        )  @Expose var carrierReference       : String?           = null,
  @SerializedName("carrier_slug"             )  @Expose var carrierSlug            : String?           = null,
  @SerializedName("currency"                 )  @Expose var currency               : String?           = null,
  @SerializedName("delivery_address"         )  @Expose var deliveryAddress        : DeliveryAddress?  = DeliveryAddress(),
  @SerializedName("delivery_date"            )  @Expose var deliveryDate           : String?           = null,
  @SerializedName("delivery_eta"             )   @Expose var deliveryEta            : Int?              = null,
  @SerializedName("delivery_time"            )  @Expose var deliveryTime           : String?           = null,
  @SerializedName("id"                       )  @Expose var rate_Id                     : String?           = null,
  @SerializedName("insurance_coverage"       )  @Expose var insuranceCoverage      : Int?              = null,
  @SerializedName("includes_duties"          )  @Expose var includesDuties         : Boolean?          = null,
  @SerializedName("insurance_fee"            )  @Expose var insuranceFee           : Int?              = null,
  @SerializedName("includes_insurance"       )  @Expose var includesInsurance      : Boolean?          = null,
  @SerializedName("metadata"                 )  @Expose var metadata               : Metadata?         = Metadata(),
  @SerializedName("parcel"                   )  @Expose var parcel                 : Parcel?           = Parcel(),
  @SerializedName("pickup_address"           )  @Expose var pickupAddress          : PickupAddress?    = PickupAddress(),
  @SerializedName("pickup_eta"               )  @Expose var pickupEta              : Int?              = null,
  @SerializedName("pickup_time"              )  @Expose var pickupTime             : String?           = null,
  @SerializedName("rate_id"                  )  @Expose var rateId                 : String?           = null,
  @SerializedName("used"                     )  @Expose var used                   : Boolean?          = null,
  @SerializedName("user"                     )  @Expose var user                   : User?             = User(),
  @SerializedName("__v"                      )  @Expose var _v                     : Int?              = null,
  @SerializedName("created_at"               )  @Expose var createdAt              : String?           = null,
  @SerializedName("updated_at"               )  @Expose var updatedAt              : String?           = null

)