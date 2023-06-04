package com.terminal.terminal_androidsdk.core.model.component_shipment

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.*
import kotlinx.android.parcel.Parcelize


data class Accounts (
  @SerializedName("typeCode" )  @Expose var typeCode : String? = null,
  @SerializedName("number"   )  @Expose var number   : String? = null
)

data class CarrierPickup (
  @SerializedName("plannedPickupDateAndTime" )  @Expose var plannedPickupDateAndTime : String?                        = null,
  @SerializedName("accounts"                 )  @Expose var accounts                 : ArrayList<Accounts>            = arrayListOf(),
  @SerializedName("customerDetails"          )  @Expose var customerDetails          : CustomerDetails?                 = null,
  @SerializedName("specialInstructions"      )  @Expose var specialInstructions      : ArrayList<SpecialInstructions> = arrayListOf(),
  @SerializedName("shipmentDetails"          )  @Expose var shipmentDetails          : ArrayList<ShipmentDetails>     = arrayListOf()
)

@Parcelize
data class Carriers (
  @SerializedName("domestic"      ) @Expose var domestic      : ArrayList<String> = arrayListOf(),
  @SerializedName("regional"      ) @Expose  var regional      : ArrayList<String> = arrayListOf(),
  @SerializedName("international" ) @Expose  var international : ArrayList<String> = arrayListOf()

):Parcelable


data class CarrierShipments (
  val id: String,
  val createdDate: String,
  val updatedDate: String,
  @SerializedName("trackingId"           ) @Expose

  val trackingID: String,

  val label: Any? = null,
  val invoice: Any? = null,
  @SerializedName("trackingUrl"           ) @Expose

  val trackingURL: Any? = null,
  @SerializedName("thirdPartyTrackingId"           ) @Expose
  val thirdPartyTrackingID: Any? = null,

  val itemCollectionMode: String,
  val isPaid: Boolean,
  val shipmentRoute: String,
  val shipmentStatus: String,
  val pricingTier: String,
  val insuranceType: String,
  val insuranceCharge: Long,
  val pickupCharge: Long,
  val shipmentCharge: Long,
  val commissionOnShipmentCharge: Long,
  val totalCharge: Long,
  val discount: Long,
  val couponApplied: Any? = null,
  val couponAppliedAmount: Long,
  val additionalInformation: Any? = null,
  @SerializedName("externalCustomerId"           ) @Expose

  val externalCustomerID: Any? = null,

  val currency: String,
  val items: List<Item>,
  val dimension: Dimension,
  val senderDetail: ErDetail,
  val receiverDetail: ErDetail,
  val createdBy: CreatedBy,
  val updatedBy: Any? = null,
  val estimatedDeliveryDate: String,
  val pickupDate: String,
  val totalWeight: Long,
  val assignedLogisticsPartner: Any? = null,
  val user: CreatedBy,
  val transaction: Any? = null,
  val tracks: Any? = null
) {

}

data class CreatedBy (
  val id: String,
  @SerializedName("topshipId"           ) @Expose
  val topshipID: String,

  val type: String,
  val isEmailVerified: Boolean,
  val isPhoneVerified: Boolean,
  val email: String,
  val phoneNumber: String,
  val country: Any? = null,
  val state: Any? = null,
  val city: Any? = null,

  @SerializedName("displayPictureUrl") @Expose
  val displayPictureURL: Any? = null,

  val fullName: String,
  val dateOfBirth: Any? = null,
  val password: String,
  val source: Any? = null,
  val sessionToken: Any? = null,
  val percentageCommissionOnUser: Any? = null,
  val accountType: String,
  val referrer: Any? = null,
  val createdBy: Any? = null,
  val createdDate: String,
  val updatedDate: String,
  val referredUsers: Any? = null,
  val createdUsers: Any? = null,
  val addresses: Any? = null,
  val shopnships: Any? = null,
  val wallet: Wallet,
  val cards: Any? = null,
  val transactions: Any? = null,
  val feedback: Any? = null,
  val bankDetials: Any? = null,
  val withdrawalRequests: Any? = null
)

data class Wallet (
  val id: String,
  val createdDate: String,
  val updatedDate: String,
  val totalReceived: Long,
  val totalSent: Long,
  val totalBonusReceived: Long,
  val totalBonusSpent: Long,
  val currency: String
)

data class Dimension (
  val length: Long,
  val width: Long,
  val height: Long
)

data class Item (
  val category: String,
  val description: String,
  val weight: Long,
  val quantity: Long,
  val value: Long,
  val dimension: Any? = null
)

data class ErDetail (
  val name: String,
  val email: String,
  val phoneNumber: String,
  val addressLine1: String,
  val addressLine2: String,
  val addressLine3: String,
  val country: String,
  val state: String,
  val city: String,
  val countryCode: String,
  val postalCode: String
)

data class ContactInformation (

  @SerializedName("email"       )   @Expose var email       : String? = null,
  @SerializedName("phone"       )  @Expose var phone       : String? = null,
  @SerializedName("companyName" )  @Expose var companyName : String? = null,
  @SerializedName("fullName"    )  @Expose var fullName    : String? = null

)
data class Content (

  @SerializedName("description"           ) @Expose var description           : String?             = null,
  @SerializedName("packages"              ) @Expose  var packages              : ArrayList<Packages> = arrayListOf(),
  @SerializedName("declaredValueCurrency" )  @Expose var declaredValueCurrency : String?             = null,
  @SerializedName("declaredValue"         )  @Expose var declaredValue         : Double?                = null,
  @SerializedName("incoterm"              ) @Expose  var incoterm              : String?             = null,
  @SerializedName("isCustomsDeclarable"   ) @Expose  var isCustomsDeclarable   : Boolean?            = null,
  @SerializedName("unitOfMeasurement"     ) @Expose  var unitOfMeasurement     : String?             = null,
  @SerializedName("exportDeclaration"     ) @Expose  var exportDeclaration     : ExportDeclaration?   = null,

)
data class CustomerDetails (

  @SerializedName("shipperDetails"  )  @Expose var shipperDetails  : ShipperDetails?  =null,
  @SerializedName("receiverDetails" )   @Expose var receiverDetails : ReceiverDetails? =null

)
data class CustomerReferences (

  @SerializedName("typeCode" )  @Expose var typeCode : String? = null,
  @SerializedName("value"    )  @Expose var value    : String? = null

)

@Parcelize
data class DeliveryAddress (

  @SerializedName("city") @Expose var city    : String? = null,
  @SerializedName("state")  @Expose var state   : String? = null,
  @SerializedName("country")  @Expose var country : String? = null,
  @SerializedName("zip")  @Expose var zip     : String? = null,
//@SerializedName("email")  @Expose var email         : String?      = null,
@SerializedName("first_name")  @Expose var firstName     : String?      = null,
//@SerializedName("is_residential")  @Expose var isResidential : Boolean?     = null,
@SerializedName("last_name")  @Expose var lastName      : String?      = null,
//@SerializedName("line1")  @Expose var line1         : String?      = null,
//@SerializedName("line2")  @Expose var line2         : String?      = null,
@SerializedName("phone")  @Expose var phone         : String?      = null,


):Parcelable
data class Dimensions (

  @SerializedName("length" )  @Expose var length : Double? = null,
  @SerializedName("height" )  @Expose var height : Double? = null,
  @SerializedName("width"  )   @Expose var width  : Double? = null

)

@Parcelize
data class Events (

  @SerializedName("created_at"  )  @Expose var createdAt   : String? = null,
  @SerializedName("description" )  @Expose var description : String? = null,
  @SerializedName("location"    )  @Expose var location    : String? = null,
  @SerializedName("status"      )  @Expose var status      : String? = null

):Parcelable

data class ExportDeclaration (

  @SerializedName("lineItems" ) @Expose var lineItems : ArrayList<LineItems> = arrayListOf(),
  @SerializedName("invoice"   )  @Expose var invoice   : Invoice?              = null,

)
data class Extras (

  @SerializedName("carrier_tracking_url"   )  @Expose var carrierTrackingUrl   : String?        = null,
  @SerializedName("commercial_invoice_url" )  @Expose var commercialInvoiceUrl : String?        = null,
  @SerializedName("reference"              )  @Expose var reference            : String?        = null,
  //@SerializedName("shipping_label"         )  @Expose var shippingLabel        : Documents?   = null,
  @SerializedName("shipping_label_url"     )  @Expose var shippingLabelUrl     : String?        = null,
  @SerializedName("tracking_number"        )  @Expose var trackingNumber       : String?        = null,
  @SerializedName("tracking_url"           )  @Expose var trackingUrl          : String?        = null

)


data class Invoice (

  @SerializedName("number"             )  @Expose var number             : String?                       = null,
  @SerializedName("date"               )  @Expose var date               : String?                       = null,
  @SerializedName("function"           )  @Expose var function           : String?                       = null,
  @SerializedName("totalNetWeight"     )  @Expose var totalNetWeight     : Double?                          = null,
  @SerializedName("totalGrossWeight"   )  @Expose var totalGrossWeight   : Double?                          = null,
  @SerializedName("customerReferences" )  @Expose var customerReferences : ArrayList<CustomerReferences> = arrayListOf()

)

@Parcelize
data class Items (
 /// @SerializedName("type" ) @Expose var type : String? = null,
  @SerializedName("hs_code" ) @Expose var hsCode : String? = null,
  @SerializedName("description" ) @Expose var description : String? = null,
  @SerializedName("name"        )  @Expose var name        : String? = null,
  @SerializedName("currency"    )  @Expose var currency    : String? = null,
  @SerializedName("value"       )  @Expose var value       : Double?    = null,
  @SerializedName("quantity"    )  @Expose var quantity    : Double?    = null,
  @SerializedName("weight"      )  @Expose var weight      : Double?    = null

):Parcelable
data class LineItems (

  @SerializedName("number"              )  @Expose var number              : Double?      = null,
  @SerializedName("description"         )  @Expose var description         : String?   = null,
  @SerializedName("price"               )  @Expose var price               : Double?      = null,
  @SerializedName("quantity"            )  @Expose var quantity            : Quantity? = null,
  @SerializedName("manufacturerCountry" )  @Expose var manufacturerCountry : String?   = null,
  @SerializedName("weight"              )  @Expose var weight              : Weight?   = null,

  )
data class Metadata (
  //@SerializedName("shipment_payload" )  @Expose var shipmentPayload : ShipmentPayload? = null,
  @SerializedName("carrier_shipment" )  @Expose var carrierShipment : ArrayList<CarrierShipments>? = null,
  @SerializedName("carrier_pickup"   )  @Expose var carrierPickup   : CarrierPickup?   = null,
  @SerializedName("selected_rate")  @Expose var selectedRate    : SelectedRate?    = null

)


@Parcelize
data class ShipmentRateCarries(
  @SerializedName("carrier_logo")  @Expose var carrierLogo    : String?    = null,
  @SerializedName("carrier_name")  @Expose var carrierName    : String?    = null,
  @SerializedName("carrier_rate_description")  @Expose var carrierRateDescription    : String?    = null,
  @SerializedName("carrier_reference")  @Expose var carrierReference    : String?    = null,
@SerializedName("carrier_slug")  @Expose var carrierSlug    : String?    = null,
  @SerializedName("insurance_fee")  @Expose var insuranceFee           : Double?              = null,
):Parcelable
data class Packages (
  @SerializedName("weight")  @Expose var weight     : Double?        = null,
  @SerializedName("dimensions")  @Expose var dimensions : Dimensions? = null
)
@Parcelize
data class Packaging (
  @SerializedName("_id"          )   @Expose var Id          : String? = null,
  @SerializedName("height"       )  @Expose var height      : Double?    = null,
  @SerializedName("length"       )  @Expose var length      : Double?    = null,
  @SerializedName("name"         )  @Expose var name        : String? = null,
  @SerializedName("size_unit"    )  @Expose var sizeUnit    : String? = null,
  @SerializedName("type"         )  @Expose var type        : String? = null,
  @SerializedName("user"         )  @Expose var user        : String? = null,
  @SerializedName("weight"       )  @Expose var weight      : Double?    = null,
  @SerializedName("weight_unit"  )  @Expose var weightUnit  : String? = null,
  @SerializedName("width"        )  @Expose var width       : Double?    = null,
  @SerializedName("packaging_id" )  @Expose var packagingId : String? = null,
  @SerializedName("created_at"   )  @Expose var createdAt   : String? = null,
  @SerializedName("updated_at"   )  @Expose var updatedAt   : String? = null,
  @SerializedName("__v"          )  @Expose var _v          : Int?    = null
):Parcelable

@Parcelize
data class PackagingDimension (

  @SerializedName("length" )  @Expose var length : Double? = null,
  @SerializedName("height" )  @Expose var height : Double? = null,
  @SerializedName("width"  )  @Expose var width  : Double? = null

):Parcelable
@Parcelize
data class Parcel (
  //@SerializedName("_id")  @Expose var Id          : String?          = null,
  //@SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  //@SerializedName("packaging")  @Expose var packagingString        : String?          = null,
 //  var packaging   : Packaging?        = null,
  //@SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
 // @SerializedName("user")  @Expose var user        : String?          = null,
  //@SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
//  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
  //@SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
 // @SerializedName("__v")  @Expose var _v          : Double?             = null,
  @SerializedName("total_value")  @Expose var totalValue : Double?             = null,
  @SerializedName("proof_of_payments") @Expose var proofOfPayments:ArrayList<String>? = arrayListOf()
//
):Parcelable

@Parcelize
data class ParcelHome (
  //@SerializedName("_id")  @Expose var Id          : String?          = null,
  @SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  @SerializedName("packaging")  @Expose var packagingString        : String?          = null,
  //  var packaging   : Packaging?        = null,
  //@SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
  // @SerializedName("user")  @Expose var user        : String?          = null,
  //@SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
//  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
  //@SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
  // @SerializedName("__v")  @Expose var _v          : Double?             = null,
  @SerializedName("total_value")  @Expose var totalValue : Double?             = null,
  @SerializedName("proof_of_payments") @Expose var proofOfPayments:ArrayList<String>? = arrayListOf()
//
):Parcelable

@Parcelize
data class ParcelShop (
  //@SerializedName("_id")  @Expose var Id          : String?          = null,
  @SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  @SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
  @SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
   @SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
  @SerializedName("total_value")  @Expose var totalValue : Double?             = null,
  @SerializedName("proof_of_payments") @Expose var proofOfPayments:ArrayList<String>? = arrayListOf()
//
):Parcelable


@Parcelize
data class ParcelSummary (
  //@SerializedName("_id")  @Expose var Id          : String?          = null,
  //@SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  //  var packaging   : Packaging?        = null,
  //@SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
  // @SerializedName("user")  @Expose var user        : String?          = null,
  //@SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
//  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
  //@SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
  // @SerializedName("__v")  @Expose var _v          : Double?             = null,
  @SerializedName("total_value")  @Expose var totalValue : Double?             = null,
  @SerializedName("proof_of_payments") @Expose var proofOfPayments:ArrayList<String>? = arrayListOf()
//
):Parcelable


@Parcelize
data class PickupAddress (

 // @SerializedName("user")  @Expose var user          : String?      = null,
  @SerializedName("city")  @Expose var city          : String?      = null,
 // @SerializedName("coordinates")  @Expose var coordinates   : Coordinates? = null,
  @SerializedName("country")  @Expose var country       : String?      = null,
  @SerializedName("email")  @Expose var email         : String?      = null,
  @SerializedName("first_name")  @Expose var firstName     : String?      = null,
 // @SerializedName("is_residential")  @Expose var isResidential : Boolean?     = null,
  @SerializedName("last_name")  @Expose var lastName      : String?      = null,
  //@SerializedName("line1")  @Expose var line1         : String?      = null,
  //@SerializedName("line2")  @Expose var line2         : String?      = null,
  @SerializedName("phone")  @Expose var phone         : String?      = null,
//  @SerializedName("place_id")  @Expose var placeId       : String?      = null,
  @SerializedName("state")  @Expose var state         : String?      = null,
  @SerializedName("zip")  @Expose var zip           : String?      = null,
 // @SerializedName("address_id")  @Expose var addressId     : String?      = null,
  //@SerializedName("created_at")  @Expose var createdAt     : String?      = null,
  //@SerializedName("updated_at")  @Expose var updatedAt     : String?      = null,
 // @SerializedName("__v")  @Expose var _v            : Double?         = null

):Parcelable


data class PostalAddress (

  @SerializedName("postalCode"   )  @Expose var postalCode   : String? = null,
  @SerializedName("cityName"     )  @Expose var cityName     : String? = null,
  @SerializedName("countryCode"  )  @Expose var countryCode  : String? = null,
  @SerializedName("addressLine1" )  @Expose var addressLine1 : String? = null,
  @SerializedName("addressLine2" )  @Expose var addressLine2 : String? = null

)

data class Quantity (

  @SerializedName("value"             )  @Expose var value             : Double?    = null,
  @SerializedName("unitOfMeasurement" )  @Expose var unitOfMeasurement : String? = null

)

data class ReceiverDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?      = null,
  @SerializedName("contactInformation" )  @Expose var contactInformation : ContactInformation? = null

)

data class SelectedRate (

  @SerializedName("_id")  @Expose var Id                     : String?           = null,
  //@SerializedName("amount")  @Expose var amount                 : Double?           = null,
  // @SerializedName("breakdown")  @Expose var breakdown              : ArrayList<String> = arrayListOf(),
  @SerializedName("carrier_logo")  @Expose var carrierLogo            : String?           = null,
  @SerializedName("carrier_name")  @Expose var carrierName            : String?           = null,
  @SerializedName("carrier_rate_description")   @Expose var carrierRateDescription : String?           = null,
  //@SerializedName("carrier_reference")  @Expose var carrierReference       : String?           = null,
  //@SerializedName("carrier_slug")  @Expose var carrierSlug            : String?           = null,
//  @SerializedName("currency")  @Expose var currency               : String?           = null,
  @SerializedName("delivery_address")  @Expose var deliveryAddress        : DeliveryAddress?  = null,
 // @SerializedName("delivery_date")  @Expose var deliveryDate           : String?           = null,
  //@SerializedName("delivery_eta")   @Expose var deliveryEta            : Double?              = null,
  @SerializedName("delivery_time")  @Expose var deliveryTime           : String?           = null,
  @SerializedName("id")  @Expose var rate_Id                     : String?           = null,
  //@SerializedName("insurance_coverage")  @Expose var insuranceCoverage      : Double?              = null,
  @SerializedName("includes_duties")  @Expose var includesDuties         : Boolean?          = null,
 // @SerializedName("insurance_fee")  @Expose var insuranceFee           : Double?              = null,
  @SerializedName("includes_insurance")  @Expose var includesInsurance      : Boolean?          = null,
  @SerializedName("metadata")  @Expose var metadata               : Metadata?         = null,
  @SerializedName("parcel")  @Expose var parcel                 : Parcel?           = null,
  @SerializedName("pickup_address")  @Expose var pickupAddress          : PickupAddress?    =null,
  //@SerializedName("pickup_eta")  @Expose var pickupEta              : Double?              = null,
  @SerializedName("pickup_time")  @Expose var pickupTime             : String?           = null,
  @SerializedName("rate_id")  @Expose var rateId                 : String?           = null,
  //@SerializedName("used")  @Expose var used                   : Boolean?          = null,
  @SerializedName("user")  @Expose var user                   : User?             = null,
 // @SerializedName("__v")  @Expose var _v                     : Double?              = null,
  @SerializedName("created_at")  @Expose var createdAt              : String?           = null,
  @SerializedName("updated_at")  @Expose var updatedAt              : String?           = null

)


data class ShipmentDetails (

  @SerializedName("productCode"           )  @Expose var productCode           : String?             = null,
  @SerializedName("isCustomsDeclarable"   )  @Expose var isCustomsDeclarable   : Boolean?            = null,
  @SerializedName("declaredValue"         )  @Expose var declaredValue         : Int?                = null,
  @SerializedName("declaredValueCurrency" )  @Expose var declaredValueCurrency : String?             = null,
  @SerializedName("packages"              )  @Expose var packages              : ArrayList<Packages> = arrayListOf(),
  @SerializedName("unitOfMeasurement"     )  @Expose var unitOfMeasurement     : String?             = null

)


@Parcelize
data class ShipmentPayload(
  val shipmentTrackingNumber:String, val cancelPickupUrl:String, val trackingUrl:String,
  val dispatchConfirmationNumber:String,
  //val packages:List<ShipPackages>, val documents: ShippingLabelDoc,
  val shipmentDetails:List<ShipDetails>,
):Parcelable

data class ShipperDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?       = null,
  @SerializedName("contactInformation" )  @Expose var contactInformation : ContactInformation?   = null,

)
@Parcelize
data class ShippingLabel (

  @SerializedName("imageFormat" )  @Expose var imageFormat : String? = null,
  @SerializedName("content"     )  @Expose var content     : String? = null,
  @SerializedName("typeCode"    )  @Expose var typeCode    : String? = null,
  @SerializedName("format"      )  @Expose var format      : String? = null,
  @SerializedName("url"         )  @Expose var url         : String? = null

):Parcelable
data class SpecialInstructions (

  @SerializedName("value" )  @Expose var value : String? = null

)

@Parcelize
data class User (

  //@SerializedName("barred_countries")  @Expose var barredCountries : ArrayList<String> = arrayListOf(),
 // @SerializedName("_id")  @Expose var Id              : String?           = null,
  @SerializedName("admin")  @Expose var admin           : Boolean?          = null,
  @SerializedName("carriers")  @Expose var carriers        : Carriers?         = null,
  @SerializedName("company_name")  @Expose var companyName     : String?           = null,
  @SerializedName("country")  @Expose var country         : String?           = null,
  @SerializedName("country_state"            )  @Expose var state           : String?           = null,
  @SerializedName("email")  @Expose var email           : String?           = null,
  @SerializedName("first_name")  @Expose var firstName       : String?           = null,
  @SerializedName("last_name")  @Expose var lastName        : String?           = null,
  // @SerializedName("metadata")  @Expose var metadata        : Metadata?         = Metadata(),
  @SerializedName("phone"            )  @Expose var phone           : String?           = null,
 // @SerializedName("public_key"       )   @Expose var publicKey       : String?           = null,
 // @SerializedName("secret_key"       )   @Expose var secretKey       : String?           = null,
  @SerializedName("wallet"           )  @Expose var wallet          : String?           = null,
  @SerializedName("user_id"          )  @Expose var userId          : String?           = null,
  //@SerializedName("shop_ship"          )  @Expose var shopShip          : String?           = null,
  @SerializedName("created_at"       )  @Expose var createdAt       : String?           = null,
  @SerializedName("updated_at"       )  @Expose var updatedAt       : String?           = null,
  @SerializedName("__v"              )  @Expose var _v              : Int?              = null,
  @SerializedName("plan"             )  @Expose var plan            : String?           = null,
  @SerializedName("account_active"   )  @Expose var accountActive   : Boolean?          = null,
  @SerializedName("wallet_enabled"   )  @Expose var walletEnabled   : Boolean?          = null

):Parcelable

open class Weight (
  @SerializedName("netValue"   )  @Expose open var netValue   : Double? = null,
  @SerializedName("grossValue" )  @Expose open var grossValue : Double? = null

)

data class ShipmentUnpopulated (
  @SerializedName("address_to"   )  @Expose var deliveryAddressId   : String ,
  @SerializedName("address_from"   )  @Expose var pickupAddressId   : String,
  @SerializedName("address_return"   )  @Expose var returnAddressId   : String,
  @SerializedName("parcel"   )  @Expose var parcelId   : String,
  @SerializedName("carrier"   )  @Expose var carrierId   : String? = null,
  @SerializedName("rate"   )  @Expose var rateId   : String? = null,
  @SerializedName("shipment_id"   )  @Expose var shipmentId   : String? = null,
  @SerializedName("pickup_date"   )  @Expose var pickupDate   : String? = null,
  @SerializedName("status"   )  @Expose var status   : String? = null,
  @SerializedName("events")  @Expose var events           : ArrayList<Events> = arrayListOf(),
  @SerializedName("extras")  @Expose var extras           : Extras?             = null,

  )//:ShipmentResponse()
