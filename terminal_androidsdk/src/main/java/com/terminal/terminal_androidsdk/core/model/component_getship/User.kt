package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class User (

  @SerializedName("barred_countries" ) var barredCountries : ArrayList<String> = arrayListOf(),
  @SerializedName("_id"              ) var user_Id              : String?           = null,
  @SerializedName("admin"            ) var admin           : Boolean?          = null,
  @SerializedName("carriers"         ) var carriers        : Carriers?        = null,
  @SerializedName("company_name"     ) var companyName     : String?           = null,
  @SerializedName("country"          ) var country         : String?           = null,
  @SerializedName("email"            ) var email           : String?           = null,
  @SerializedName("first_name"       ) var firstName       : String?           = null,
  @SerializedName("last_name"        ) var lastName        : String?           = null,
  @SerializedName("metadata"         ) var metadata        : Metadata?        = null,
  @SerializedName("phone"            ) var phone           : String?           = null,
  @SerializedName("public_key"       ) var publicKey       : String?           = null,
  @SerializedName("secret_key"       ) var secretKey       : String?           = null,
  @SerializedName("wallet"           ) var wallet          : String?           = null,
  @SerializedName("user_id"          ) var userId          : String?           = null,
  @SerializedName("created_at"       ) var createdAt       : String?           = null,
  @SerializedName("updated_at"       ) var updatedAt       : String?           = null,
  @SerializedName("__v"              ) var _v              : Double?              = null,
  @SerializedName("plan"             ) var plan            : String?           = null,
  @SerializedName("account_active"   ) var accountActive   : Boolean?          = null,
  @SerializedName("wallet_enabled"   ) var walletEnabled   : Boolean?          = null,
  @SerializedName("name"             ) var name            : String?           = null,
  @SerializedName("id"               ) var id              : String?           = null

)