package com.terminal.terminal_androidsdk.core.model.component_shipment

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.Coordinates
import com.terminal.terminal_androidsdk.core.model.ShipMetaData


data class ShipmentResponse (

  @SerializedName("address_to" )
  @Expose
  var addressTo        : String?           = null,
  @SerializedName("address_from")   @Expose var addressFrom      : String?           = null,
  @SerializedName("address_return")    @Expose var addressReturn    : String?           = null,
  @SerializedName("carrier")  @Expose var carrier          : String?           = null,
  @SerializedName("delivery_date")  @Expose var deliveryDate     : String?           = null,
  @SerializedName("delivery_arranged")  @Expose var deliveryArranged : String?           = null,
  @SerializedName("events")  @Expose var events           : ArrayList<Events> = arrayListOf(),
  @SerializedName("extras")  @Expose var extras           : Extras?             = null,
  @SerializedName("metadata")  @Expose var metadata         : Metadata?         = null,
  //@SerializedName("metadata"          )  @Expose var metadata         : ShipMetaData?         = ShipMetaData(),
  @SerializedName("parcel")  @Expose var parcel           : String?           = null,
  @SerializedName("pickup_date")  @Expose var pickupDate       : String?           = null,
  @SerializedName("rate")  @Expose var rate             : String?           = null,
  @SerializedName("shipment_cost")  @Expose var shipmentCost     : Double?           = null,
  @SerializedName("shipment_currency")  @Expose var shipmentCurrency : String?           = null,
  @SerializedName("shipment_id")  @Expose var shipmentId       : String?           = null,
  @SerializedName("shipment_purpose")  @Expose var shipmentPurpose  : String?           = null,
  @SerializedName("status")  @Expose var status           : String?           = null,
  @SerializedName("user")  @Expose var user             : String?           = null,
  @SerializedName("created_at")  @Expose var createdAt        : String?           = null,
  @SerializedName("updated_at")  @Expose var updatedAt        : String?           = null,
  @SerializedName("__v")  @Expose var _v               : Int?              = null

)

data class Accounts (

  @SerializedName("typeCode" )  @Expose var typeCode : String? = null,
  @SerializedName("number"   )  @Expose var number   : String? = null

)

data class AddressPayload (

  @SerializedName("pickup_address"   )  @Expose var pickupAddress   : PickupAddress?     = null,
  @SerializedName("delivery_address" )  @Expose var deliveryAddress : DeliveryAddress?   = null,

)

data class BuyerDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?       = null,
  @SerializedName("contactInformation" )  @Expose  var contactInformation : ContactInformation?   = null,

)
data class CarrierPickup (

  @SerializedName("plannedPickupDateAndTime" )  @Expose var plannedPickupDateAndTime : String?                        = null,
  @SerializedName("accounts"                 )  @Expose var accounts                 : ArrayList<Accounts>            = arrayListOf(),
  @SerializedName("customerDetails"          )  @Expose var customerDetails          : CustomerDetails?                 = null,
  @SerializedName("specialInstructions"      )  @Expose var specialInstructions      : ArrayList<SpecialInstructions> = arrayListOf(),
  @SerializedName("shipmentDetails"          )  @Expose var shipmentDetails          : ArrayList<ShipmentDetails>     = arrayListOf()

)

data class Carriers (

  @SerializedName("domestic"      ) @Expose var domestic      : ArrayList<String> = arrayListOf(),
  @SerializedName("regional"      ) @Expose  var regional      : ArrayList<String> = arrayListOf(),
  @SerializedName("international" ) @Expose  var international : ArrayList<String> = arrayListOf()

)

data class CarrierShipment (

  @SerializedName("plannedShippingDateAndTime" ) @Expose var plannedShippingDateAndTime : String?                         = null,
  @SerializedName("pickup"                     ) @Expose  var pickup                     : Pickup?                         = null,
  @SerializedName("productCode"                ) @Expose  var productCode                : String?                         = null,
  @SerializedName("localProductCode"           ) @Expose  var localProductCode           : String?                         = null,
  @SerializedName("accounts"                   ) @Expose  var accounts                   : ArrayList<Accounts>             = arrayListOf(),
  //@SerializedName("valueAddedServices"         ) @Expose  var valueAddedServices         : ArrayList<String>               = arrayListOf(),
  @SerializedName("customerReferences"         ) @Expose  var customerReferences         : ArrayList<CustomerReferences>   = arrayListOf(),
  @SerializedName("outputImageProperties"      ) @Expose  var outputImageProperties      : OutputImageProperties?          = null,
  @SerializedName("customerDetails"            ) @Expose  var customerDetails            : CustomerDetails?                = null,
  @SerializedName("content"                    ) @Expose  var content                    : Content?                        = null,
  @SerializedName("requestOndemandDeliveryURL" ) @Expose  var requestOndemandDeliveryURL : Boolean?                        = null,
  @SerializedName("shipmentNotification"       ) @Expose  var shipmentNotification       : ArrayList<ShipmentNotification> = arrayListOf(),
  @SerializedName("getOptionalInformation"     ) @Expose  var getOptionalInformation     : Boolean?                        = null,
  @SerializedName("onDemandDelivery"           ) @Expose  var onDemandDelivery           : OnDemandDelivery?               = null,

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

data class DefaultParcel (

  @SerializedName("packaging_dimension" ) @Expose var packagingDimension : PackagingDimension?  = null,
  @SerializedName("parcel_total_weight" )  @Expose var parcelTotalWeight  : Double?                = null

)

data class DeliveryAddress (

  @SerializedName("city") @Expose var city    : String? = null,
  @SerializedName("state")  @Expose var state   : String? = null,
  @SerializedName("country")  @Expose var country : String? = null,
  @SerializedName("zip")  @Expose var zip     : String? = null

)
data class Dimensions (

  @SerializedName("length" )  @Expose var length : Double? = null,
  @SerializedName("height" )  @Expose var height : Double? = null,
  @SerializedName("width"  )   @Expose var width  : Double? = null

)


data class Documents (

  @SerializedName("imageFormat" ) @Expose var imageFormat : String? = null,
  @SerializedName("content"     )  @Expose var content     : String? = null,
  @SerializedName("typeCode"    ) @Expose  var typeCode    : String? = null,
  @SerializedName("format"      ) @Expose  var format      : String? = null,
  @SerializedName("url"         ) @Expose var url         : String? = null

)


data class Events (

  @SerializedName("created_at"  )  @Expose var createdAt   : String? = null,
  @SerializedName("description" )  @Expose var description : String? = null,
  @SerializedName("location"    )  @Expose var location    : String? = null,
  @SerializedName("status"      )  @Expose var status      : String? = null

)

data class ExportDeclaration (

  @SerializedName("lineItems" ) @Expose var lineItems : ArrayList<LineItems> = arrayListOf(),
  @SerializedName("invoice"   )  @Expose var invoice   : Invoice?              = null,

)
data class Extras (

  @SerializedName("carrier_tracking_url"   )  @Expose var carrierTrackingUrl   : String?        = null,
  @SerializedName("commercial_invoice_url" )  @Expose var commercialInvoiceUrl : String?        = null,
  @SerializedName("reference"              )  @Expose var reference            : String?        = null,
  @SerializedName("shipping_label"         )  @Expose var shippingLabel        : Documents?   = null,
  @SerializedName("shipping_label_url"     )  @Expose var shippingLabelUrl     : String?        = null,
  @SerializedName("tracking_number"        )  @Expose var trackingNumber       : String?        = null,
  @SerializedName("tracking_url"           )  @Expose var trackingUrl          : String?        = null

)

data class ImageOptions (

  @SerializedName("templateName" )  @Expose var templateName : String?  = null,
  @SerializedName("typeCode"     )  @Expose var typeCode     : String?  = null,
  @SerializedName("isRequested"  ) @Expose  var isRequested  : Boolean? = null

)

data class Invoice (

  @SerializedName("number"             )  @Expose var number             : String?                       = null,
  @SerializedName("date"               )  @Expose var date               : String?                       = null,
  @SerializedName("function"           )  @Expose var function           : String?                       = null,
  @SerializedName("totalNetWeight"     )  @Expose var totalNetWeight     : Double?                          = null,
  @SerializedName("totalGrossWeight"   )  @Expose var totalGrossWeight   : Double?                          = null,
  @SerializedName("customerReferences" )  @Expose var customerReferences : ArrayList<CustomerReferences> = arrayListOf()

)

data class Items (

  @SerializedName("description" ) @Expose var description : String? = null,
  @SerializedName("name"        )  @Expose var name        : String? = null,
  @SerializedName("currency"    )  @Expose var currency    : String? = null,
  @SerializedName("value"       )  @Expose var value       : Double?    = null,
  @SerializedName("quantity"    )  @Expose var quantity    : Double?    = null,
  @SerializedName("weight"      )  @Expose var weight      : Double?    = null

)
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
  @SerializedName("carrier_shipment" )  @Expose var carrierShipment : CarrierShipment? = null,
  @SerializedName("carrier_pickup"   )  @Expose var carrierPickup   : CarrierPickup?   = null,
  @SerializedName("selected_rate")  @Expose var selectedRate    : SelectedRate?    = null

)
data class OnDemandDelivery (

  @SerializedName("deliveryOption"      )  @Expose var deliveryOption      : String? = null,
  @SerializedName("location"            ) @Expose  var location            : String? = null,
  @SerializedName("specialInstructions" )  @Expose var specialInstructions : String? = null,
  @SerializedName("authorizerName"      )  @Expose var authorizerName      : String? = null

)

data class OutputImageProperties (

  @SerializedName("allDocumentsInOneImage" ) @Expose var allDocumentsInOneImage : Boolean?                = null,
  @SerializedName("encodingFormat"         ) @Expose  var encodingFormat         : String?                 = null,
  @SerializedName("imageOptions"           ) @Expose  var imageOptions           : ArrayList<ImageOptions> = arrayListOf()

)
data class Packages (

  @SerializedName("weight")  @Expose var weight     : Double?        = null,
  @SerializedName("dimensions")  @Expose var dimensions : Dimensions? = null

)

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

)
data class PackagingDimension (

  @SerializedName("length" )  @Expose var length : Double? = null,
  @SerializedName("height" )  @Expose var height : Double? = null,
  @SerializedName("width"  )  @Expose var width  : Double? = null

)
data class Parcel (

  @SerializedName("_id")  @Expose var Id          : String?          = null,
  @SerializedName("description")  @Expose var description : String?          = null,
  @SerializedName("items")  @Expose var items       : ArrayList<Items> = arrayListOf(),
  @SerializedName("packaging")  @Expose var packaging   : Packaging?        = null,
  @SerializedName("total_weight")  @Expose var totalWeight : Double?             = null,
  @SerializedName("user")  @Expose var user        : String?          = null,
  @SerializedName("weight_unit")  @Expose var weightUnit  : String?          = null,
  @SerializedName("parcel_id")  @Expose var parcelId    : String?          = null,
  @SerializedName("created_at")  @Expose var createdAt   : String?          = null,
  @SerializedName("updated_at")  @Expose var updatedAt   : String?          = null,
  @SerializedName("__v")  @Expose var _v          : Double?             = null

)

data class Pickup (

  @SerializedName("isRequested"         )  @Expose var isRequested         : Boolean?                       = null,
  @SerializedName("specialInstructions" )  @Expose var specialInstructions : ArrayList<SpecialInstructions> = arrayListOf(),
  @SerializedName("pickupDetails"       )  @Expose var pickupDetails       : PickupDetails?                  = null,

)
data class PickupAddress (

  @SerializedName("user")  @Expose var user          : String?      = null,
  @SerializedName("city")  @Expose var city          : String?      = null,
  @SerializedName("coordinates")  @Expose var coordinates   : Coordinates? = null,
  @SerializedName("country")  @Expose var country       : String?      = null,
  @SerializedName("email")  @Expose var email         : String?      = null,
  @SerializedName("first_name")  @Expose var firstName     : String?      = null,
  @SerializedName("is_residential")  @Expose var isResidential : Boolean?     = null,
  @SerializedName("last_name")  @Expose var lastName      : String?      = null,
  @SerializedName("line1")  @Expose var line1         : String?      = null,
  @SerializedName("line2")  @Expose var line2         : String?      = null,
  @SerializedName("phone")  @Expose var phone         : String?      = null,
  @SerializedName("place_id")  @Expose var placeId       : String?      = null,
  @SerializedName("state")  @Expose var state         : String?      = null,
  @SerializedName("zip")  @Expose var zip           : String?      = null,
  @SerializedName("address_id")  @Expose var addressId     : String?      = null,
  @SerializedName("created_at")  @Expose var createdAt     : String?      = null,
  @SerializedName("updated_at")  @Expose var updatedAt     : String?      = null,
  @SerializedName("__v")  @Expose var _v            : Double?         = null

)

data class PickupDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?       = null,
  @SerializedName("contactInformation" )  @Expose var contactInformation : ContactInformation?  = null,

)

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
  @SerializedName("amount")  @Expose var amount                 : Double?           = null,
  // @SerializedName("breakdown")  @Expose var breakdown              : ArrayList<String> = arrayListOf(),
  @SerializedName("carrier_logo")  @Expose var carrierLogo            : String?           = null,
  @SerializedName("carrier_name")  @Expose var carrierName            : String?           = null,
  @SerializedName("carrier_rate_description")   @Expose var carrierRateDescription : String?           = null,
  @SerializedName("carrier_reference")  @Expose var carrierReference       : String?           = null,
  @SerializedName("carrier_slug")  @Expose var carrierSlug            : String?           = null,
  @SerializedName("currency")  @Expose var currency               : String?           = null,
  @SerializedName("delivery_address")  @Expose var deliveryAddress        : DeliveryAddress?  = null,
  @SerializedName("delivery_date")  @Expose var deliveryDate           : String?           = null,
  @SerializedName("delivery_eta")   @Expose var deliveryEta            : Double?              = null,
  @SerializedName("delivery_time")  @Expose var deliveryTime           : String?           = null,
  @SerializedName("id")  @Expose var rate_Id                     : String?           = null,
  @SerializedName("insurance_coverage")  @Expose var insuranceCoverage      : Double?              = null,
  @SerializedName("includes_duties")  @Expose var includesDuties         : Boolean?          = null,
  @SerializedName("insurance_fee")  @Expose var insuranceFee           : Double?              = null,
  @SerializedName("includes_insurance")  @Expose var includesInsurance      : Boolean?          = null,
  @SerializedName("metadata")  @Expose var metadata               : Metadata?         = null,
  @SerializedName("parcel")  @Expose var parcel                 : Parcel?           = null,
  @SerializedName("pickup_address")  @Expose var pickupAddress          : PickupAddress?    =null,
  @SerializedName("pickup_eta")  @Expose var pickupEta              : Double?              = null,
  @SerializedName("pickup_time")  @Expose var pickupTime             : String?           = null,
  @SerializedName("rate_id")  @Expose var rateId                 : String?           = null,
  @SerializedName("used")  @Expose var used                   : Boolean?          = null,
  @SerializedName("user")  @Expose var user                   : User?             = null,
  @SerializedName("__v")  @Expose var _v                     : Double?              = null,
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

data class ShipmentNotification (

  @SerializedName("typeCode"   )  @Expose var typeCode   : String? = null,
  @SerializedName("receiverId" )  @Expose var receiverId : String? = null

)
data class ShipmentPayload (

  @SerializedName("shipmentTrackingNumber"     )  @Expose var shipmentTrackingNumber     : String?                    = null,
  @SerializedName("cancelPickupUrl"            )  @Expose var cancelPickupUrl            : String?                    = null,
  @SerializedName("trackingUrl"                )  @Expose var trackingUrl                : String?                    = null,
  @SerializedName("dispatchConfirmationNumber" )  @Expose var dispatchConfirmationNumber : String?                    = null,
  @SerializedName("packages"                   )  @Expose var packages                   : ArrayList<Packages>        = arrayListOf(),
  @SerializedName("documents"                  )  @Expose var documents                  : ArrayList<Documents>       = arrayListOf(),
  @SerializedName("shipmentDetails"            )  @Expose var shipmentDetails            : ArrayList<ShipmentDetails> = arrayListOf(),
  @SerializedName("warnings"                   )  @Expose var warnings                   : ArrayList<String>          = arrayListOf()

)

data class ShipperDetails (

  @SerializedName("postalAddress"      )  @Expose var postalAddress      : PostalAddress?       = null,
  @SerializedName("contactInformation" )  @Expose var contactInformation : ContactInformation?   = null,

)
data class ShippingLabel (

  @SerializedName("imageFormat" )  @Expose var imageFormat : String? = null,
  @SerializedName("content"     )  @Expose var content     : String? = null,
  @SerializedName("typeCode"    )  @Expose var typeCode    : String? = null,
  @SerializedName("format"      )  @Expose var format      : String? = null,
  @SerializedName("url"         )  @Expose var url         : String? = null

)
data class SpecialInstructions (

  @SerializedName("value" )  @Expose var value : String? = null

)

data class User (

  //@SerializedName("barred_countries")  @Expose var barredCountries : ArrayList<String> = arrayListOf(),
  @SerializedName("_id")  @Expose var Id              : String?           = null,
  @SerializedName("admin")  @Expose var admin           : Boolean?          = null,
  @SerializedName("carriers")  @Expose var carriers        : Carriers?         = null,
  @SerializedName("company_name")  @Expose var companyName     : String?           = null,
  @SerializedName("country")  @Expose var country         : String?           = null,
  @SerializedName("email")  @Expose var email           : String?           = null,
  @SerializedName("first_name")  @Expose var firstName       : String?           = null,
  @SerializedName("last_name")  @Expose var lastName        : String?           = null,
  // @SerializedName("metadata")  @Expose var metadata        : Metadata?         = Metadata(),
  @SerializedName("phone"            )  @Expose var phone           : String?           = null,
  @SerializedName("public_key"       )   @Expose var publicKey       : String?           = null,
  @SerializedName("secret_key"       )   @Expose var secretKey       : String?           = null,
  @SerializedName("wallet"           )  @Expose var wallet          : String?           = null,
  @SerializedName("user_id"          )  @Expose var userId          : String?           = null,
  @SerializedName("created_at"       )  @Expose var createdAt       : String?           = null,
  @SerializedName("updated_at"       )  @Expose var updatedAt       : String?           = null,
  @SerializedName("__v"              )  @Expose var _v              : Int?              = null,
  @SerializedName("plan"             )  @Expose var plan            : String?           = null,
  @SerializedName("account_active"   )  @Expose var accountActive   : Boolean?          = null,
  @SerializedName("wallet_enabled"   )  @Expose var walletEnabled   : Boolean?          = null

)

data class Weight (

  @SerializedName("netValue"   )  @Expose var netValue   : Double? = null,
  @SerializedName("grossValue" )  @Expose var grossValue : Double? = null

)