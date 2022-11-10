package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Packaging (

  @SerializedName("_id"          )   @Expose var Id          : String? = null,
  @SerializedName("height"       )  @Expose var height      : Int?    = null,
  @SerializedName("length"       )  @Expose var length      : Int?    = null,
  @SerializedName("name"         )  @Expose var name        : String? = null,
  @SerializedName("size_unit"    )  @Expose var sizeUnit    : String? = null,
  @SerializedName("type"         )  @Expose var type        : String? = null,
  @SerializedName("user"         )  @Expose var user        : String? = null,
  @SerializedName("weight"       )  @Expose var weight      : Int?    = null,
  @SerializedName("weight_unit"  )  @Expose var weightUnit  : String? = null,
  @SerializedName("width"        )  @Expose var width       : Int?    = null,
  @SerializedName("packaging_id" )  @Expose var packagingId : String? = null,
  @SerializedName("created_at"   )  @Expose var createdAt   : String? = null,
  @SerializedName("updated_at"   )  @Expose var updatedAt   : String? = null,
  @SerializedName("__v"          )  @Expose var _v          : Int?    = null

)