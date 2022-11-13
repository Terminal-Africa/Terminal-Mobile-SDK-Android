package com.terminal.terminal_androidsdk.core.model.component_track

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.Coordinates
import com.terminal.terminal_androidsdk.core.model.component_getship.AddressFrom
import com.terminal.terminal_androidsdk.core.model.component_getship.Carrier
import com.terminal.terminal_androidsdk.core.model.component_shipment.Events

data class TrackShipmentRes(@SerializedName("carrier"           ) var carrier          : Carrier?         = null,
                            @SerializedName("address_from"      ) var addressFrom      : AddressFrom?       = null,
                            @SerializedName("address_to"        ) var addressTo        : AddressTo?         = null,
                            @SerializedName("delivery_date"     ) var deliveryDate     : String?           = null,
                            @SerializedName("pickup_date"       ) var pickupDate       : String?           = null,
                            @SerializedName("events"            ) var events           : ArrayList<Events> = arrayListOf(),
                            @SerializedName("tracking_status"   ) var trackingStatus   : TrackingStatus?    = null,
                            @SerializedName("shipment_id"       ) var shipmentId       : String?           = null,
                            @SerializedName("delivery_arranged" ) var deliveryArranged : String?           = null,
                            @SerializedName("status"            ) var status           : String?           = null)



data class TrackingStatus (

    @SerializedName("created_at"  )@Expose  var createdAt   : String? = null,
    @SerializedName("description" )@Expose var description : String? = null,
    @SerializedName("location"    )@Expose var location    : String? = null,
    @SerializedName("status"      ) @Expose var status      : String? = null

)

data class Metadata (
    @SerializedName("platform" ) @Expose var platform : String? = null

)

data class AddressTo (

    @SerializedName("user"           ) @Expose var user          : String?      = null,
    @SerializedName("city"           ) @Expose var city          : String?      = null,
    @SerializedName("coordinates"    ) @Expose var coordinates   : Coordinates?  = null,
    @SerializedName("country"        ) @Expose var country       : String?      = null,
    @SerializedName("email"          ) @Expose var email         : String?      = null,
    @SerializedName("first_name"     ) @Expose var firstName     : String?      = null,
    @SerializedName("is_residential" ) @Expose var isResidential : Boolean?     = null,
    @SerializedName("last_name"      ) @Expose var lastName      : String?      = null,
    @SerializedName("line1"          ) @Expose var line1         : String?      = null,
    @SerializedName("line2"          ) @Expose var line2         : String?      = null,
    @SerializedName("metadata"       ) @Expose var metadata      : Metadata?    = null,
    @SerializedName("phone"          ) @Expose var phone         : String?      = null,
    @SerializedName("place_id"       ) @Expose var placeId       : String?      = null,
    @SerializedName("state"          ) @Expose var state         : String?      = null,
    @SerializedName("zip"            ) @Expose var zip           : String?      = null,
    @SerializedName("address_id"     )@Expose  var addressId     : String?      = null,
    @SerializedName("created_at"     ) @Expose var createdAt     : String?      = null,
    @SerializedName("updated_at"     ) @Expose var updatedAt     : String?      = null,
    @SerializedName("__v"            )@Expose  var _v            : Int?         = null

)