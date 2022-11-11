package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class LandedCostData (

  @SerializedName("grandTotal" ) var grandTotal : Double?  = null,
  @SerializedName("currency"   ) var currency   : String?  = null,
  @SerializedName("status"     ) var status     : Boolean? = null

)