package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class User (

  //@SerializedName("barred_countries")  @Expose var barredCountries : ArrayList<String> = arrayListOf(),
  @SerializedName("_id")  @Expose var Id              : String?           = null,
  @SerializedName("admin")  @Expose var admin           : Boolean?          = null,
  @SerializedName("carriers")  @Expose var carriers        : Carriers?         = Carriers(),
  @SerializedName("company_name")  @Expose var companyName     : String?           = null,
  @SerializedName("country")  @Expose var country         : String?           = null,
  @SerializedName("email")  @Expose var email           : String?           = null,
  @SerializedName("first_name")  @Expose var firstName       : String?           = null,
  @SerializedName("last_name")  @Expose var lastName        : String?           = null,
 // @SerializedName("metadata")  @Expose var metadata        : Metadata?         = Metadata(),
  @SerializedName("phone"            )  @Expose var phone           : String?           = null,
  @SerializedName("public_key"       )   @Expose var publicKey       : String?           = null,
  @SerializedName("secret_key"       )   @Expose var secretKey       : String?           = null,
  @SerializedName("wallet"           )  @Expose var wallet          : String?           = null,
  @SerializedName("user_id"          )  @Expose var userId          : String?           = null,
  @SerializedName("created_at"       )  @Expose var createdAt       : String?           = null,
  @SerializedName("updated_at"       )  @Expose var updatedAt       : String?           = null,
  @SerializedName("__v"              )  @Expose var _v              : Int?              = null,
  @SerializedName("plan"             )  @Expose var plan            : String?           = null,
  @SerializedName("account_active"   )  @Expose var accountActive   : Boolean?          = null,
  @SerializedName("wallet_enabled"   )  @Expose var walletEnabled   : Boolean?          = null

)