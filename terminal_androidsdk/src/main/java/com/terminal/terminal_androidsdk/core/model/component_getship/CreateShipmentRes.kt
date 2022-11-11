package com.terminal.terminal_androidsdk.core.model.component_getship
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_shipment.Parcel


data class CreateShipmentRes (

    @SerializedName("_id"               ) var Id               : String?           = null,
    @SerializedName("address_to"        ) var addressTo        : AddressTo?       = null,
    @SerializedName("address_from"      ) var addressFrom      : AddressFrom?      = null,
    @SerializedName("parcel"            ) var parcel           : Parcel?           = null,
    @SerializedName("pickup_date"       ) var pickupDate       : String?           = null,
    @SerializedName("shipment_currency" ) var shipmentCurrency : String?           = null,
    @SerializedName("shipment_purpose"  ) var shipmentPurpose  : String?           = null,
    @SerializedName("status"            ) var status           : String?           = null,
    @SerializedName("user"              ) var user             : User?            = null,
    @SerializedName("events"            ) var events           : ArrayList<Events> = arrayListOf(),
    @SerializedName("shipment_id"       ) var shipmentId       : String?           = null,
    @SerializedName("created_at"        ) var createdAt        : String?           = null,
    @SerializedName("updated_at"        ) var updatedAt        : String?           = null,
    @SerializedName("__v"               ) var _v               : Double?              = null,
    @SerializedName("carrier"           ) var carrier          : Carrier?          = null,
    @SerializedName("delivery_arranged" ) var deliveryArranged : String?           = null,
    @SerializedName("delivery_date"     ) var deliveryDate     : String?           = null,
    @SerializedName("extras"            ) var extras           : Extras?          = null,
    @SerializedName("metadata"          ) var metadata         : Metadata?         = null,
    @SerializedName("rate"              ) var rate             : Rate?             = null,
    @SerializedName("shipment_cost"     ) var shipmentCost     : Double?           = null

)