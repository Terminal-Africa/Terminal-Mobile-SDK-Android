package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.Coordinates


data class AddressTo (

  @SerializedName("user"           ) var user          : String?      = null,
  @SerializedName("city"           ) var city          : String?      = null,
  @SerializedName("coordinates"    ) var coordinates   : Coordinates?  = null,
  @SerializedName("country"        ) var country       : String?      = null,
  @SerializedName("email"          ) var email         : String?      = null,
  @SerializedName("first_name"     ) var firstName     : String?      = null,
  @SerializedName("is_residential" ) var isResidential : Boolean?     = null,
  @SerializedName("last_name"      ) var lastName      : String?      = null,
  @SerializedName("line1"          ) var line1         : String?      = null,
  @SerializedName("line2"          ) var line2         : String?      = null,
  @SerializedName("metadata"       ) var metadata      : Metadata?    = null,
  @SerializedName("phone"          ) var phone         : String?      = null,
  @SerializedName("place_id"       ) var placeId       : String?      = null,
  @SerializedName("state"          ) var state         : String?      = null,
  @SerializedName("zip"            ) var zip           : String?      = null,
  @SerializedName("address_id"     ) var addressId     : String?      = null,
  @SerializedName("created_at"     ) var createdAt     : String?      = null,
  @SerializedName("updated_at"     ) var updatedAt     : String?      = null,
  @SerializedName("__v"            ) var _v            : Double?         = null

)