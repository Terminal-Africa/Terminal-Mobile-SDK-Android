package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Carrier (

  @SerializedName("active"              ) var active             : Boolean?          = null,
  @SerializedName("available_countries" ) var availableCountries : ArrayList<String> = arrayListOf(),
  @SerializedName("contact"             ) var contact            : Contact?         = null,
  @SerializedName("domestic"            ) var domestic           : Boolean?          = null,
  @SerializedName("international"       ) var international      : Boolean?          = null,
  @SerializedName("logo"                ) var logo               : String?           = null,
  @SerializedName("name"                ) var name               : String?           = null,
  @SerializedName("regional"            ) var regional           : Boolean?          = null,
  @SerializedName("requires_invoice"    ) var requiresInvoice    : Boolean?          = null,
  @SerializedName("requires_waybill"    ) var requiresWaybill    : Boolean?          = null,
  @SerializedName("slug"                ) var slug               : String?           = null,
  @SerializedName("carrier_id"          ) var carrierId          : String?           = null,
  @SerializedName("__v"                 ) var _v                 : Double?              = null,
  @SerializedName("created_at"          ) var createdAt          : String?           = null,
  @SerializedName("updated_at"          ) var updatedAt          : String?           = null,
  @SerializedName("metadata"            ) var metadata           : String?           = null,
  @SerializedName("id"                  ) var id                 : String?           = null

)