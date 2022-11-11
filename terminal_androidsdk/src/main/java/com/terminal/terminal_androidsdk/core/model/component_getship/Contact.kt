package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Contact (

  @SerializedName("email" ) var email : String? = null,
  @SerializedName("phone" ) var phone : String? = null

)