package com.terminal.terminal_androidsdk.core.model.component_carries

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.Pagination
import com.terminal.terminal_androidsdk.core.model.component_getship.Contact
import com.terminal.terminal_androidsdk.core.model.component_shipment.Carriers

data class GetCarriesModel (
    @SerializedName("active"              ) @Expose var active             : Boolean?          = null,
    @SerializedName("available_countries" ) @Expose var availableCountries : ArrayList<String> = arrayListOf(),
    @SerializedName("contact"             ) @Expose var contact            : Contact?           = null,
    @SerializedName("domestic"            ) @Expose var domestic           : Boolean?          = null,
    @SerializedName("international"       ) @Expose var international      : Boolean?          = null,
    @SerializedName("logo"                ) @Expose var logo               : String?           = null,
    @SerializedName("metadata"            ) @Expose var metadata           : String?           = null,
    @SerializedName("name"                ) @Expose var name               : String?           = null,
    @SerializedName("regional"            ) @Expose var regional           : Boolean?          = null,
    @SerializedName("requires_invoice"    ) @Expose var requiresInvoice    : Boolean?          = null,
    @SerializedName("requires_waybill"    ) @Expose var requiresWaybill    : Boolean?          = null,
    @SerializedName("slug"                ) @Expose var slug               : String?           = null,
    @SerializedName("carrier_id"          ) @Expose var carrierId          : String?           = null,
    @SerializedName("created_at"          ) @Expose var createdAt          : String?           = null,
    @SerializedName("updated_at"          ) @Expose var updatedAt          : String?           = null,
    @SerializedName("__v"                 ) @Expose var _v                 : Int?              = null
)

data class GetCarriesModelList(val carriers:List<GetCarriesModel>, val pagination: Pagination, )

data class GetEnableCarriers(
    @SerializedName("_id")  @Expose var Id              : String?           = null,
    @SerializedName("name")  @Expose var name           : String?          = null,
    @SerializedName("id")  @Expose var carrierId           : String?          = null,
    @SerializedName("carriers")  @Expose var carriers        : Carriers?         = null,
)