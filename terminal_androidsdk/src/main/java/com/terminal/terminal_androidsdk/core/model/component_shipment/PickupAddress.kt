package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class PickupAddress (

  @SerializedName("user")  @Expose var user          : String?      = null,
  @SerializedName("city")  @Expose var city          : String?      = null,
  @SerializedName("coordinates")  @Expose var coordinates   : Coordinates? = null,
  @SerializedName("country")  @Expose var country       : String?      = null,
  @SerializedName("email")  @Expose var email         : String?      = null,
  @SerializedName("first_name")  @Expose var firstName     : String?      = null,
  @SerializedName("is_residential")  @Expose var isResidential : Boolean?     = null,
  @SerializedName("last_name")  @Expose var lastName      : String?      = null,
  @SerializedName("line1")  @Expose var line1         : String?      = null,
  @SerializedName("line2")  @Expose var line2         : String?      = null,
  @SerializedName("phone")  @Expose var phone         : String?      = null,
  @SerializedName("place_id")  @Expose var placeId       : String?      = null,
  @SerializedName("state")  @Expose var state         : String?      = null,
  @SerializedName("zip")  @Expose var zip           : String?      = null,
  @SerializedName("address_id")  @Expose var addressId     : String?      = null,
  @SerializedName("created_at")  @Expose var createdAt     : String?      = null,
  @SerializedName("updated_at")  @Expose var updatedAt     : String?      = null,
  @SerializedName("__v")  @Expose var _v            : Double?         = null

)