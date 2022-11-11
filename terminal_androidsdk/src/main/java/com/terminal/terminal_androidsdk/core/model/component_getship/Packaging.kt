package  com.terminal.terminal_androidsdk.core.model.component_getship

import com.google.gson.annotations.SerializedName


data class Packaging (

  @SerializedName("_id"          ) var Id          : String? = null,
  @SerializedName("user"         ) var user        : String? = null,
  @SerializedName("height"       ) var height      : Double?    = null,
  @SerializedName("length"       ) var length      : Double?    = null,
  @SerializedName("name"         ) var name        : String? = null,
  @SerializedName("size_unit"    ) var sizeUnit    : String? = null,
  @SerializedName("type"         ) var type        : String? = null,
  @SerializedName("weight"       ) var weight      : Double? = null,
  @SerializedName("weight_unit"  ) var weightUnit  : String? = null,
  @SerializedName("width"        ) var width       : Double? = null,
  @SerializedName("packaging_id" ) var packagingId : String? = null,
  @SerializedName("created_at"   ) var createdAt   : String? = null,
  @SerializedName("updated_at"   ) var updatedAt   : String? = null,
  @SerializedName("__v"          ) var _v          : Double?    = null,
  @SerializedName("id"           ) var packId          : String? = null

)