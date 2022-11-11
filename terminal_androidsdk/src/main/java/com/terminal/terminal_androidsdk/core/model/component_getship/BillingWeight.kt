package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class BillingWeight (

  @SerializedName("UnitOfMeasurement" ) var UnitOfMeasurement : UnitOfMeasurement? = null,
  @SerializedName("Weight"            ) var Weight            : String?            = null

)