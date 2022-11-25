package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.iinterface.ShipmentPurpose
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentPayload
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentResponse

class  ShipmentToAPi(
    val address_from:String, val address_to:String, val parcel:String,
    var shipment_purpose :String = "personal", var address_return :String? = null,  var metadata :Any? = null
)

class Shipments (
    val address_from:String, val address_to:String, val parcel:String,
    var shipment_purpose :ShipmentPurpose? = ShipmentPurpose.Personal,    var address_return :String? = null,  var metadata :Any? = null
    ){
    data class Builder(
        var address_from:String,
        var address_to:String,
        var parcel:String,
        var shipment_purpose: ShipmentPurpose,
        var address_return :String? = null,
        var metadata :Any? = null,
    ){
        fun addressFrom(address_from: String) = apply { this.address_from = address_from }
        fun addressTo(address_to: String) = apply { this.address_to = address_to }
        fun parcel(parcel: String) = apply { this.parcel = parcel }
        fun shipmentPurpose(shipment_purpose: ShipmentPurpose) = apply { this.shipment_purpose = shipment_purpose }
        fun addressReturn(address_return: String) = apply { this.address_return = address_return }
        fun metadata(metadata: Any) = apply { this.metadata = metadata }
        fun build() = Shipments(address_from, address_to, parcel, shipment_purpose,address_return, metadata,
        )
    }
}

class  CreateShipmentResponse{
    /*
   * Pending
   * rate
   * events
   *  */
    @SerializedName("address_from")
    @Expose
    val addressFrom:AddressFromData? = null
    @SerializedName("address_return")
    @Expose
    val addressReturn:AddressReturnData? = null
    @SerializedName("address_to")
    @Expose
    val addressTo:AddressToData? = null
    val id:String = ""
    val metadata:Any? = null
    @SerializedName("shipment_id")
    @Expose
    val shipmentId:String = ""
    val status :String = ""
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
    val parcel :ParcelResponse? = null

}



class  AddressFromData{
    @SerializedName("address_id")
    @Expose
    val addressId:String = ""
    val city:String = ""
    val country:String = ""
    val email:String = ""
    @SerializedName("first_name")
    @Expose
    val firstName:String = ""
    @SerializedName("last_name")
    @Expose
    val lastName:String = ""
    val id:String = ""
    val coordinates:Coordinates? = null
    @SerializedName("is_residential")
    @Expose
    val isResidential:String = ""
    val line1:String = ""
    val line2:String = ""
    val metadata:Any? = null
    val name:String = ""
    val phone:String = ""
    val state:String = ""
    val zip:String = ""
}

class  AddressReturnData{
    @SerializedName("address_id")
    @Expose
    val addressId:String = ""
    val city:String = ""
    val country:String = ""
    val email:String = ""
    @SerializedName("first_name")
    @Expose
    val firstName:String = ""
    @SerializedName("last_name")
    @Expose
    val lastName:String = ""
    val id:String = ""
    val coordinates:Coordinates? = null
    @SerializedName("is_residential")
    @Expose
    val isResidential:String = ""
    val line1:String = ""
    val line2:String = ""
    val metadata:Any? = null
    val name:String = ""
    val phone:String = ""
    val state:String = ""
    val zip:String = ""
}


class  AddressToData{
    @SerializedName("address_id")
    @Expose
    val addressId:String = ""
    val city:String = ""
    val country:String = ""
    val email:String = ""
    @SerializedName("first_name")
    @Expose
    val firstName:String = ""
    @SerializedName("last_name")
    @Expose
    val lastName:String = ""
    val id:String = ""
    val coordinates:Coordinates? = null
    @SerializedName("is_residential")
    @Expose
    val isResidential:String = ""
    val line1:String = ""
    val line2:String = ""
    val metadata:Any? = null
    val name:String = ""
    val phone:String = ""
    val state:String = ""
    val zip:String = ""
}

data class CancelShipment(val shipment_id:String)

//data class GetShipmentModelList(val parcels:List<CreateShipmentResponse> = arrayListOf(), val pagination: Pagination, )
data class GetShipmentModelList(val shipments:List<ShipmentResponse>, val pagination: Pagination, )

//
class GetShipmentModelLists{
     @SerializedName("address_to")
     @Expose
     val addressTo:String = ""
     @SerializedName("address_from")
     @Expose
     val addressFrom:String = ""
     @SerializedName("address_return")
     @Expose
     val addressReturn:String = ""
     val carrier:String = ""
     @SerializedName("delivery_date")
     @Expose
     val deliveryDate:String = ""
     @SerializedName("delivery_arranged")
     @Expose
     val deliveryArranged:String = ""
     val events:List<ShipEvents> = arrayListOf()
     val extras:ShipExtra? = null
     val shipMetaData :ShipMetaData? = null


}

data class ShipMetaData(
    @SerializedName("shipment_payload" )  @Expose var shipmentPayload : ShipmentPayload? = ShipmentPayload(),

    )

data class ShipmentPayload(
    val shipmentTrackingNumber:String, val cancelPickupUrl:String, val trackingUrl:String,
    val dispatchConfirmationNumber:String, val packages:List<ShipPackages>,val documents: ShippingLabelDoc,
    val shipmentDetails:List<ShipDetails>,
)

data class ShipPackages(val referenceNumber:Int,val trackingNumber:String, val trackingUrl:String)


data class ShipDetails(val serviceHandlingFeatureCodes:List<String>,val volumetricWeight:String, val billingCode:String,
      val serviceContentCode:String,val customerDetails:CustomerDetails,
                       )


data class CustomerDetails(val shipperDetails:CustomerShipperDetails, val receiverDetails:CustomerShipperDetails)

data class CustomerShipperDetails(
    val  postalAddress:PostalAddress, val contactInformation:CustomerContactInfo
)

data class PostalAddress(val postalCode:String, val cityName:String, val countryCode:String, val addressLine1:String,
val addressLine2:String)


data class CustomerContactInfo(val companyName:String, val fullName:String)

data class ShipExtra(val carrier_tracking_url:String, val commercial_invoice_url:String, val reference:String,
                val shippingLabel: ShippingLabelDoc, val shipping_label_url:String, val tracking_number:String,
                     val tracking_url:String
                     )

data class ShippingLabelDoc(val imageFormat:String, val content:String, val typeCode:String, val format:String, val url:String)

data class ShipEvents(val created_at:String, val description:String, val location:String, val status:String)


data class ArrangePickupAndDelivery(val rate_id:String, val shipment_Id:String)