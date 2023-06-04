package com.terminal.terminal_androidsdk.core.model.component_getship
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.Coordinates
import com.terminal.terminal_androidsdk.core.model.TShopMeta
import com.terminal.terminal_androidsdk.core.model.component_shipment.*
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class CreateShipmentRes (
    //@SerializedName("_id"               )@Expose var Id               : String?           = null,
    @SerializedName("address_to"        )@Expose  var addressTo        : AddressTo?       = null,
    @SerializedName("address_from"      )@Expose  var addressFrom      : AddressFrom?      = null,
    @SerializedName("parcel"            )@Expose  var parcel           : Parcel?           = null,
    @SerializedName("cancellation_request"            )@Expose  var cancellationRequest           : Boolean?           = null,
    //cancellation_request
   // @SerializedName("pickup_date"       )@Expose  var pickupDate       : String?           = null,
    @SerializedName("shipment_cost_currency" )@Expose  var shipmentCurrency : String?           = null,
    //@SerializedName("shipment_purpose"  )@Expose  var shipmentPurpose  : String?           = null,
    @SerializedName("status"            )@Expose  var status           : String?           = null,
   // @SerializedName("user"              )@Expose  var user             : User?            = null,
   // @SerializedName("events"            )@Expose  var events           : ArrayList<Events> = arrayListOf(),
    @SerializedName("shipment_id"       )@Expose  var shipmentId       : String?           = null,
   // @SerializedName("created_at"        )@Expose  var createdAt        : String?           = null,
    //@SerializedName("updated_at"        )@Expose  var updatedAt        : String?           = null,
   // @SerializedName("__v"               )@Expose  var _v               : Double?              = null,
    @SerializedName("carrier"           )@Expose  var carrier          : Carrier?          = null,
    //@SerializedName("delivery_arranged" )@Expose  var deliveryArranged : String?           = null,
   // @SerializedName("delivery_date"     )@Expose  var deliveryDate     : String?           = null,
    @SerializedName("extras"            )@Expose  var extras           : Extras?          = null,
    //@SerializedName("metadata"          )@Expose  var metadata         : Metadata?         = null,
    @SerializedName("rate"              )@Expose  var rate             : Rate?             = null,
   // @SerializedName("shipment_cost"     )@Expose  var shipmentCost     : Double?           = null

):Parcelable

@Parcelize
data class CreateHomeShipmentRes (
    //@SerializedName("_id"               )@Expose var Id               : String?           = null,
    @SerializedName("address_to"        )@Expose  var addressTo        : AddressTo?       = null,
    @SerializedName("address_from"      )@Expose  var addressFrom      : AddressFrom?      = null,
    @SerializedName("parcel"            )@Expose  var parcel           : ParcelHome?           = null,
    @SerializedName("cancellation_request"            )@Expose  var cancellationRequest           : Boolean?           = null,
    //cancellation_request
    // @SerializedName("pickup_date"       )@Expose  var pickupDate       : String?           = null,
    @SerializedName("shipment_cost_currency" )@Expose  var shipmentCurrency : String?           = null,
    //@SerializedName("shipment_purpose"  )@Expose  var shipmentPurpose  : String?           = null,
    @SerializedName("status"            )@Expose  var status           : String?           = null,
    @SerializedName("type"            )@Expose  var type           : String?           = null,
    @SerializedName("source"            )@Expose  var source           : String?           = null,
    @SerializedName("transaction_reference"            )@Expose  var transactionReference : String?           = null,
    // @SerializedName("user"              )@Expose  var user             : User?            = null,
    // @SerializedName("events"            )@Expose  var events           : ArrayList<Events> = arrayListOf(),
    @SerializedName("shipment_id"       )@Expose  var shipmentId       : String?           = null,
     @SerializedName("created_at"        )@Expose  var createdAt        : String?           = null,
     @SerializedName("updated_at"        )@Expose  var updatedAt        : String?           = null,
    // @SerializedName("__v"               )@Expose  var _v               : Double?              = null,
    @SerializedName("carrier"           )@Expose  var carrier          : Carrier?          = null,
    //@SerializedName("delivery_arranged" )@Expose  var deliveryArranged : String?           = null,
    // @SerializedName("delivery_date"     )@Expose  var deliveryDate     : String?           = null,
    @SerializedName("extras"            )@Expose  var extras           : Extras?          = null,
    //@SerializedName("metadata"          )@Expose  var metadata         : Metadata?         = null,
    @SerializedName("rate"              )@Expose  var rate             : Rate?             = null,
    // @SerializedName("shipment_cost"     )@Expose  var shipmentCost     : Double?           = null

):Parcelable

@Parcelize
data class CreateShopShipmentRes (
    //@SerializedName("_id"               )@Expose var Id               : String?           = null,
    @SerializedName("address_to"        )@Expose  var addressTo        : AddressTo?       = null,
    @SerializedName("address_from"      )@Expose  var addressFrom      : AddressFrom?      = null,
    @SerializedName("parcel"            )@Expose  var parcel           : ParcelShop?           = null,
    @SerializedName("cancellation_request"            )@Expose  var cancellationRequest           : Boolean?           = null,
    //cancellation_request
    // @SerializedName("pickup_date"       )@Expose  var pickupDate       : String?           = null,
    @SerializedName("shipment_cost_currency" )@Expose  var shipmentCurrency : String?           = null,
    //@SerializedName("shipment_purpose"  )@Expose  var shipmentPurpose  : String?           = null,
    @SerializedName("status"            )@Expose  var status           : String?           = null,
    @SerializedName("type"            )@Expose  var type           : String?           = null,
    @SerializedName("source"            )@Expose  var source           : String?           = null,
    @SerializedName("transaction_reference"            )@Expose  var transactionReference : String?           = null,
    @SerializedName("user"              )@Expose  var user             : User?            = null,
    // @SerializedName("events"            )@Expose  var events           : ArrayList<Events> = arrayListOf(),
    @SerializedName("shipment_id"       )@Expose  var shipmentId       : String?           = null,
    @SerializedName("created_at"        )@Expose  var createdAt        : String?           = null,
    @SerializedName("updated_at"        )@Expose  var updatedAt        : String?           = null,
    // @SerializedName("__v"               )@Expose  var _v               : Double?              = null,
    @SerializedName("carrier"           )@Expose  var carrier          : Carrier?          = null,
    //@SerializedName("delivery_arranged" )@Expose  var deliveryArranged : String?           = null,
    // @SerializedName("delivery_date"     )@Expose  var deliveryDate     : String?           = null,
    @SerializedName("extras"            )@Expose  var extras           : ExtrasShop?          = null,
    @SerializedName("metadata"            )@Expose  var metadata           : TShopMeta?          = null,
    //@SerializedName("metadata"          )@Expose  var metadata         : Metadata?         = null,
    @SerializedName("rate"              )@Expose  var rate             : Rate?             = null,
    // @SerializedName("shipment_cost"     )@Expose  var shipmentCost     : Double?           = null

):Parcelable


@Parcelize
data class CreateSummaryShipmentRes (
    //@SerializedName("_id"               )@Expose var Id               : String?           = null,
    @SerializedName("address_to"        )@Expose  var addressTo        : AddressTo?       = null,
    @SerializedName("address_from"      )@Expose  var addressFrom      : AddressFrom?      = null,
    @SerializedName("parcel"            )@Expose  var parcel           : ParcelSummary?           = null,
    @SerializedName("cancellation_request"            )@Expose  var cancellationRequest           : Boolean?           = null,
    //cancellation_request
    // @SerializedName("pickup_date"       )@Expose  var pickupDate       : String?           = null,
    @SerializedName("shipment_cost_currency" )@Expose  var shipmentCurrency : String?           = null,
    //@SerializedName("shipment_purpose"  )@Expose  var shipmentPurpose  : String?           = null,
    @SerializedName("status"            )@Expose  var status           : String?           = null,
    // @SerializedName("user"              )@Expose  var user             : User?            = null,
    // @SerializedName("events"            )@Expose  var events           : ArrayList<Events> = arrayListOf(),
    @SerializedName("shipment_id"       )@Expose  var shipmentId       : String?           = null,
    // @SerializedName("created_at"        )@Expose  var createdAt        : String?           = null,
    //@SerializedName("updated_at"        )@Expose  var updatedAt        : String?           = null,
    // @SerializedName("__v"               )@Expose  var _v               : Double?              = null,
    @SerializedName("carrier"           )@Expose  var carrier          : Carrier?          = null,
    //@SerializedName("delivery_arranged" )@Expose  var deliveryArranged : String?           = null,
    // @SerializedName("delivery_date"     )@Expose  var deliveryDate     : String?           = null,
    @SerializedName("extras"            )@Expose  var extras           : Extras?          = null,
    //@SerializedName("metadata"          )@Expose  var metadata         : Metadata?         = null,
    @SerializedName("rate"              )@Expose  var rate             : Rate?             = null,
    // @SerializedName("shipment_cost"     )@Expose  var shipmentCost     : Double?           = null

):Parcelable

@Parcelize
data class AddressFrom (

   // @SerializedName("user"           )@Expose  var user          : String?      = null,
    @SerializedName("city"           )@Expose  var city          : String?      = null,
   // @SerializedName("coordinates"    )@Expose  var coordinates   : Coordinates? = null,
    @SerializedName("country"        )@Expose  var country       : String?      = null,
    @SerializedName("email"          )@Expose  var email         : String?      = null,
    @SerializedName("first_name"     )@Expose  var firstName     : String?      = null,
   // @SerializedName("is_residential" )@Expose  var isResidential : Boolean?     = null,
    @SerializedName("last_name"      )@Expose  var lastName      : String?      = null,
    @SerializedName("line1"          )@Expose  var line1         : String?      = null,
   // @SerializedName("line2"          )@Expose  var line2         : String?      = null,
    @SerializedName("phone"          )@Expose  var phone         : String?      = null,
  //  @SerializedName("place_id"       )@Expose  var placeId       : String?      = null,
    @SerializedName("state"          )@Expose  var state         : String?      = null,
    @SerializedName("zip"            )@Expose  var zip           : String?      = null,
    @SerializedName("address_id"     )@Expose  var addressId     : String?      = null,
   /// @SerializedName("created_at"     )@Expose  var createdAt     : String?      = null,
    //@SerializedName("updated_at"     )@Expose  var updatedAt     : String?      = null,
    //@SerializedName("__v"            )@Expose  var _v            : Double

):Parcelable

@Parcelize
data class AddressPayload (
    @SerializedName("pickup_address")@Expose  var pickupAddress   : PickupAddress?   = null,
    @SerializedName("delivery_address")@Expose  var deliveryAddress : DeliveryAddress?  = null

):Parcelable
data class AddressReturn (

    @SerializedName("user"           )@Expose  var user          : String?      = null,
    @SerializedName("city"           )@Expose  var city          : String?      = null,
    @SerializedName("coordinates"    )@Expose  var coordinates   : Coordinates?  = null,
    @SerializedName("country"        )@Expose  var country       : String?      = null,
    @SerializedName("email"          )@Expose  var email         : String?      = null,
    @SerializedName("first_name"     )@Expose var firstName     : String?      = null,
    @SerializedName("is_residential" ) @Expose var isResidential : Boolean?     = null,
    @SerializedName("last_name"      )@Expose var lastName      : String?      = null,
    @SerializedName("line1"          )@Expose var line1         : String?      = null,
    @SerializedName("line2"          )@Expose var line2         : String?      = null,
    @SerializedName("phone"          )@Expose var phone         : String?      = null,
    @SerializedName("place_id"       )@Expose var placeId       : String?      = null,
    @SerializedName("state"          )@Expose var state         : String?      = null,
    @SerializedName("zip"            )@Expose var zip           : String?      = null,
    @SerializedName("address_id"     )@Expose var addressId     : String?      = null,
    @SerializedName("created_at"     )@Expose var createdAt     : String?      = null,
    @SerializedName("updated_at"     )@Expose var updatedAt     : String?      = null,
    @SerializedName("__v"            )@Expose var _v            : Double?         = null

)
@Parcelize
data class AddressTo (

   // @SerializedName("user"           )@Expose var user          : String?      = null,
    @SerializedName("city"           )@Expose var city          : String?      = null,
   // @SerializedName("coordinates"    )@Expose var coordinates   : Coordinates?  = null,
    @SerializedName("country"        )@Expose var country       : String?      = null,
    @SerializedName("email"          )@Expose var email         : String?      = null,
    @SerializedName("first_name") @Expose var firstName     : String?      = null,
    //@SerializedName("is_residential" )@Expose var isResidential : Boolean?     = null,
    @SerializedName("last_name") @Expose var lastName      : String?      = null,
    @SerializedName("line1"          )@Expose var line1         : String?      = null,
    //@SerializedName("line2"          )@Expose var line2         : String?      = null,
   // @SerializedName("metadata"       )@Expose var metadata      : Metadata?    = null,
    @SerializedName("phone"          )@Expose var phone         : String?      = null,
   // @SerializedName("place_id"       )@Expose var placeId       : String?      = null,
    @SerializedName("state"          )@Expose var state         : String?      = null,
    @SerializedName("zip"            )@Expose var zip           : String?      = null,
    @SerializedName("address_id"     )@Expose var addressId     : String?      = null,
   // @SerializedName("created_at"     )@Expose var createdAt     : String?      = null,
  //  @SerializedName("updated_at"     )@Expose var updatedAt     : String?      = null,
  //  @SerializedName("__v"            )@Expose var _v            : Double?         = null

):Parcelable
@Parcelize
data class BillingWeight (

    @SerializedName("UnitOfMeasurement" )@Expose var UnitOfMeasurement : UnitOfMeasurement? = null,
    @SerializedName("Weight"            )@Expose var Weight            : String?            = null

):Parcelable

@Parcelize
data class Carrier (

    //@SerializedName("active"              )@Expose var active             : Boolean?          = null,
   // @SerializedName("available_countries" )@Expose var availableCountries : ArrayList<String> = arrayListOf(),
    @SerializedName("contact"             )@Expose var contact            : Contact?         = null,
   // @SerializedName("domestic"            )@Expose var domestic           : Boolean?          = null,
    //@SerializedName("international"       )@Expose var international      : Boolean?          = null,
    @SerializedName("logo"                )@Expose var logo               : String?           = null,
    @SerializedName("name"                )@Expose var name               : String?           = null,
   // @SerializedName("regional"            )@Expose var regional           : Boolean?          = null,
    //@SerializedName("requires_invoice"    )@Expose var requiresInvoice    : Boolean?          = null,
    //@SerializedName("requires_waybill"    )@Expose var requiresWaybill    : Boolean?          = null,
    //@SerializedName("slug"                )@Expose var slug               : String?           = null,
  //  @SerializedName("carrier_id"          )@Expose var carrierId          : String?           = null,
   /// @SerializedName("__v"                 )@Expose var _v                 : Double?              = null,
//    @SerializedName("created_at"          )@Expose var createdAt          : String?           = null,
  //  @SerializedName("updated_at"          )@Expose var updatedAt          : String?           = null,
  //  @SerializedName("metadata"            )@Expose var metadata           : String?           = null,
    //@SerializedName("id"                  )@Expose var id                 : String?           = null

):Parcelable

@Parcelize
data class Contact (

    @SerializedName("email" )@Expose var email : String? = null,
    @SerializedName("phone" )@Expose var phone : String? = null

):Parcelable

@Parcelize
data class DefaultParcel (
    @SerializedName("packaging_dimension" )@Expose var packagingDimension : PackagingDimension? = null,
    @SerializedName("parcel_total_weight" )@Expose var parcelTotalWeight  : Double?                = null

):Parcelable

data class Disclaimer (

    @SerializedName("Code"        )@Expose var Code        : String? = null,
    @SerializedName("Description" )@Expose var Description : String? = null

)

@Parcelize
data class Extras (
    @SerializedName("carrier_tracking_url" )@Expose var carrierTrackingUrl : String?        = null,
   // @SerializedName("shipping_label"       )@Expose var shippingLabel      : ShippingLabel? = null,
    @SerializedName("shipping_label_url"   )@Expose var shippingLabelUrl   : String?        = null,
    //@SerializedName("tracking_number"      )@Expose var trackingNumber     : String?        = null,
    @SerializedName("tracking_url"         )@Expose var trackingUrl        : String?        = null,
   // @SerializedName("reference"            )@Expose var reference          : String?        = null,
    @SerializedName("commercial_invoice_url"      )@Expose var commercialInvoiceUrl     : String?        = null,
):Parcelable

@Parcelize
data class ExtrasShop (
    @SerializedName("carrier_tracking_url" )@Expose var carrierTrackingUrl : String?        = null,
    //@SerializedName("shipping_label"       )@Expose var shippingLabel      : ShippingLabel? = null,
    @SerializedName("shipping_label_url"   )@Expose var shippingLabelUrl   : String?        = null,
    @SerializedName("tracking_number"      )@Expose var trackingNumber     : String?        = null,
    @SerializedName("tracking_url"         )@Expose var trackingUrl        : String?        = null,
    @SerializedName("reference"            )@Expose var reference          : String?        = null,
    @SerializedName("commercial_invoice_url"      )@Expose var commercialInvoiceUrl     : String?        = null,
):Parcelable
data class ImageFormat (

    @SerializedName("Code"        )@Expose var Code        : String? = null,
    @SerializedName("Description" )@Expose var Description : String? = null

)
data class Items (

    @SerializedName("description" )@Expose var description : String? = null,
    @SerializedName("name"        )@Expose var name        : String? = null,
    @SerializedName("currency"    )@Expose var currency    : String? = null,
    @SerializedName("value"       )@Expose var value       : Double?    = null,
    @SerializedName("quantity"    )@Expose var quantity    : Double?    = null,
    @SerializedName("weight"      )@Expose var weight      : Double?    = null

)
@Parcelize
data class LandedCostData (

    @SerializedName("grandTotal" )@Expose var grandTotal : Double?  = null,
    @SerializedName("currency"   )@Expose var currency   : String?  = null,
    @SerializedName("status"     )@Expose var status     : Boolean? = null


):Parcelable
@Parcelize
data class Metadata (

   // @SerializedName("rate_payload"     )@Expose var ratePayload    : RatePayload?   = null,
 //   @SerializedName("landed_cost_data" )@Expose var landedCostData : LandedCostData? = null,
   // @SerializedName("default_parcel"   )@Expose var defaultParcel  : DefaultParcel?  = null,
    @SerializedName("address_payload"  )@Expose var addressPayload : AddressPayload? = null,
   @SerializedName("selected_rate")  @Expose var selectedRate    : ShipmentRateCarries?    = null


    //
    ):Parcelable


data class PackageResults (

    @SerializedName("TrackingNumber"        )@Expose var TrackingNumber        : String?                = null,
    @SerializedName("ServiceOptionsCharges" )@Expose var ServiceOptionsCharges : ServiceOptionsCharges? = null,
    @SerializedName("ShippingLabel"         )@Expose var ShippingLabel         : ShippingLabel?        = null,

    )

data class Packaging (

    @SerializedName("_id"          )@Expose var Id          : String? = null,
    @SerializedName("user"         )@Expose var user        : String? = null,
    @SerializedName("height"       )@Expose var height      : Double?    = null,
    @SerializedName("length"       )@Expose var length      : Double?    = null,
    @SerializedName("name"         )@Expose var name        : String? = null,
    @SerializedName("size_unit"    )@Expose var sizeUnit    : String? = null,
    @SerializedName("type"         )@Expose var type        : String? = null,
    @SerializedName("weight"       )@Expose var weight      : Double? = null,
    @SerializedName("weight_unit"  )@Expose var weightUnit  : String? = null,
    @SerializedName("width"        )@Expose var width       : Double? = null,
    @SerializedName("packaging_id" )@Expose var packagingId : String? = null,
    @SerializedName("created_at"   )@Expose var createdAt   : String? = null,
    @SerializedName("updated_at"   )@Expose var updatedAt   : String? = null,
    @SerializedName("__v"          )@Expose var _v          : Double?    = null,
    @SerializedName("id"           )@Expose var packId          : String? = null

)

@Parcelize
data class Rate (
 // @SerializedName("_id"                      )@Expose var Id                     : String?           = null,
    @SerializedName("amount"                   )@Expose var amount                 : Double           = 0.0,
    @SerializedName("carrier_logo"             ) @Expose var carrierLogo            : String?           = null,
    @SerializedName("carrier_name"             )@Expose var carrierName            : String?           = null,
    @SerializedName("carrier_rate_description" )@Expose var carrierRateDescription : String?           = null,
    //@SerializedName("carrier_reference"        )@Expose var carrierReference       : String?           = null,
   /// @SerializedName("carrier_slug"             )@Expose var carrierSlug            : String?           = null,
    @SerializedName("currency"                 )@Expose var currency               : String?           = null,
    @SerializedName("delivery_address"         )@Expose var deliveryAddress        : String?           = null,
   // @SerializedName("delivery_date"            )@Expose var deliveryDate           : String?           = null,
     @SerializedName("delivery_eta"             )@Expose var deliveryEta            : Double             = 0.0,
    @SerializedName("delivery_time"            )@Expose var deliveryTime           : String?           = null,
  //  @SerializedName("rate_id"                       )@Expose var rateid                 : String?           = null,
   // @SerializedName("insurance_coverage"       )@Expose var insuranceCoverage      : Double?              = null,
    //@SerializedName("includes_duties"          )@Expose var includesDuties         : Boolean?          = null,
    @SerializedName("insurance_fee"            )@Expose var insuranceFee           : Double?              = null,
 //   @SerializedName("includes_insurance"       )@Expose var includesInsurance      : Boolean?          = null,
   // @SerializedName("metadata") @Expose var metadata               : Metadata?        = null,
    //@SerializedName("parcel"                   )@Expose var parcel                 : String?           = null,
    @SerializedName("pickup_address"           ) @Expose var pickupAddress          : String?           = null,
   // @SerializedName("pickup_eta"               )@Expose var pickupEta              : Double?              = null,
    @SerializedName("pickup_time"              ) @Expose var pickupTime             : String?           = null,
    //@SerializedName("pickup_date"              ) @Expose var pickupDate           : String?           = null,
    @SerializedName("rate_id"                  )@Expose var rateId                 : String?           = null,
  //  @SerializedName("used"                     )@Expose var used                   : Boolean?          = null,
    //@SerializedName("user"                     )@Expose var user                   : String?           = null,
    //@SerializedName("breakdown"                )@Expose var breakdown              : ArrayList<String> = arrayListOf(),
   // @SerializedName("__v"                      )@Expose var _v                     : Double?              = null,
   // @SerializedName("created_at"               )@Expose var createdAt              : String?           = null,
    //@SerializedName("updated_at"               )@Expose var updatedAt              : String?           = null

):Parcelable

@Parcelize
data class RatedPackage (

    @SerializedName("Weight" ) @Expose var Weight : String? = null

):Parcelable

@Parcelize
data class RatedShipmentAlert (

    @SerializedName("Code"        ) @Expose var Code        : String? = null,
    @SerializedName("Description" ) @Expose var Description : String? = null

):Parcelable

@Parcelize
data class RatePayload (

    //@SerializedName("Service"               ) var Service               : Service?               = Service(),
    @SerializedName("RatedShipmentAlert"    )@Expose  var RatedShipmentAlert    : RatedShipmentAlert?   = null,
    @SerializedName("BillingWeight"         )@Expose  var BillingWeight         : BillingWeight?        = null,
    @SerializedName("TransportationCharges" )@Expose  var TransportationCharges : TransportationCharges? = null,
    @SerializedName("ServiceOptionsCharges" ) @Expose var ServiceOptionsCharges : ServiceOptionsCharges? = null,
    @SerializedName("TotalCharges"          ) @Expose var TotalCharges          : TotalCharges?         = null,
    @SerializedName("RatedPackage"          ) @Expose var RatedPackage          : RatedPackage?        = null,

    ):Parcelable




@Parcelize
data class ServiceOptionsCharges (

    @SerializedName("CurrencyCode"  )@Expose  var CurrencyCode  : String? = null,
    @SerializedName("MonetaryValue" )@Expose  var MonetaryValue : String? = null

):Parcelable


data class ShipmentCharges (
    @SerializedName("TransportationCharges" ) var TransportationCharges : TransportationCharges? = null,
    @SerializedName("ServiceOptionsCharges" ) var ServiceOptionsCharges : ServiceOptionsCharges? = null,
    @SerializedName("TotalCharges"          ) var TotalCharges          : TotalCharges?      = null,

    )

data class ShipmentPayload (

    @SerializedName("Disclaimer"                      ) var Disclaimer                      : Disclaimer?     = null,
    @SerializedName("RatingMethod"                    ) var RatingMethod                    : String?          = null,
    @SerializedName("BillableWeightCalculationMethod" ) var BillableWeightCalculationMethod : String?          = null,
    @SerializedName("BillingWeight"                   ) var BillingWeight                   : BillingWeight?   = null,
    @SerializedName("ShipmentIdentificationNumber"    ) var ShipmentIdentificationNumber    : String?          = null,
    @SerializedName("PackageResults"                  ) var PackageResults                  : PackageResults? = null,

    )

@Parcelize
data class TotalCharges (

    @SerializedName("CurrencyCode"  )@Expose  var CurrencyCode  : String? = null,
    @SerializedName("MonetaryValue" )@Expose  var MonetaryValue : String? = null

):Parcelable

@Parcelize
data class TransportationCharges (

    @SerializedName("CurrencyCode"  )@Expose  var CurrencyCode  : String? = null,
    @SerializedName("MonetaryValue" )@Expose  var MonetaryValue : String? = null

):Parcelable

@Parcelize
data class UnitOfMeasurement (

    @SerializedName("Code"        )@Expose  var Code        : String? = null,
    @SerializedName("Description" )@Expose  var Description : String? = null

):Parcelable
