package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Items (

  @SerializedName("description" ) var description : String? = null,
  @SerializedName("name"        ) var name        : String? = null,
  @SerializedName("currency"    ) var currency    : String? = null,
  @SerializedName("value"       ) var value       : Double?    = null,
  @SerializedName("quantity"    ) var quantity    : Double?    = null,
  @SerializedName("weight"      ) var weight      : Double?    = null

)