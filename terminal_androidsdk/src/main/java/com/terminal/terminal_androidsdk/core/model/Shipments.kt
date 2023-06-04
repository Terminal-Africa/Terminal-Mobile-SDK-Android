package com.terminal.terminal_androidsdk.core.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.iinterface.ShipmentPurpose
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateHomeShipmentRes
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentResponses
import kotlinx.android.parcel.Parcelize

class  ShipmentToAPi(
    val address_from:String, val address_to:String, val parcel:String,
    var shipment_purpose :String = "personal", var address_return :String? = null,  var metadata :Any? = null
)

class ShopShipments (
    val address_from:String, val address_to:String, val parcel:String,
    var shipment_purpose :String? = ShipmentPurpose.Personal.shipment,
    val type:String,val source:String,val metadata :TShopMeta? = null,
    )
{
    data class Builder(
        var address_from:String,
        var address_to:String,
        var parcel:String,
        var shipment_purpose: String,
        var type: String,
        var source: String,
        var metadata :TShopMeta? = null,
    ){
        fun addressFrom(address_from: String) = apply { this.address_from = address_from }
        fun addressTo(address_to: String) = apply { this.address_to = address_to }
        fun parcel(parcel: String) = apply { this.parcel = parcel }
        fun shipmentPurpose(shipment_purpose: String) = apply { this.shipment_purpose = shipment_purpose }
        fun type(type: String) = apply { this.type = type }
        fun source(source: String) = apply { this.source = source }
        fun metadata(metadata: TShopMeta) = apply { this.metadata = metadata }
        fun build() = ShopShipments(address_from, address_to, parcel, shipment_purpose,type,source,metadata)
    }
}


class Shipments (
    val address_from:String, val address_to:String, val parcel:String,
    var shipment_purpose :String? = ShipmentPurpose.Personal.shipment,
    var source:String = "android",
    var parcels:ArrayList<ParcelItem>? = null,
    var address_return :String? = null,
    var metadata :Any? = null,
)
{
    data class Builder(
        var address_from:String,
        var address_to:String,
        var parcel:String,
        var shipment_purpose: String,
        var source:String,
        var parcels:ArrayList<ParcelItem>? = null,
        var address_return :String? = null,
        var metadata :Any? = null
    ){
        fun addressFrom(address_from: String) = apply { this.address_from = address_from }
        fun addressTo(address_to: String) = apply { this.address_to = address_to }
        fun parcel(parcel: String) = apply { this.parcel = parcel }
        fun shipmentPurpose(shipment_purpose: String) = apply { this.shipment_purpose = shipment_purpose }
        fun addressReturn(address_return: String) = apply { this.address_return = address_return }
        fun metadata(metadata: Any) = apply { this.metadata = metadata }
        fun parcels(parcels: ArrayList<ParcelItem>) = apply { this.parcels = parcels }
        fun source(source:  String) = apply { this.source = source }

        fun build() = Shipments(address_from, address_to, parcel, shipment_purpose,"android",parcels,address_return, metadata)
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

data class GetShipmentModelList(val shipments:List<ShipmentResponses>, val pagination: Pagination )

data class GetShipmentPopulateList(var shipments:ArrayList<CreateHomeShipmentRes>, val pagination: Pagination )

//data class ShipMetaData(
//    //@SerializedName("shipment_payload" )  @Expose var shipmentPayload : ShipmentPayload? = ShipmentPayload(),
//    )



data class ShipPackages(val referenceNumber:Int,val trackingNumber:String, val trackingUrl:String)


@Parcelize
data class ShipDetails(val serviceHandlingFeatureCodes:List<String>,val volumetricWeight:String, val billingCode:String,
      val serviceContentCode:String,val customerDetails:CustomerDetails,
                       ):Parcelable


@Parcelize
data class CustomerDetails(val shipperDetails:CustomerShipperDetails, val receiverDetails:CustomerShipperDetails):Parcelable

@Parcelize
data class CustomerShipperDetails(
    val  postalAddress:PostalAddress, val contactInformation:CustomerContactInfo
):Parcelable

@Parcelize
data class PostalAddress(val postalCode:String, val cityName:String, val countryCode:String, val addressLine1:String,
val addressLine2:String):Parcelable


@Parcelize
data class CustomerContactInfo(val companyName:String, val fullName:String):Parcelable

data class ShipExtra(val carrier_tracking_url:String, val commercial_invoice_url:String, val reference:String,
                val shippingLabel: ShippingLabelDoc, val shipping_label_url:String, val tracking_number:String,
                     val tracking_url:String
                     )

data class ShippingLabelDoc(val imageFormat:String, val content:String, val typeCode:String, val format:String, val url:String)

data class ShipEvents(val created_at:String, val description:String, val location:String, val status:String)

data class ArrangePickupAndDelivery(val rate_id:String, val shipment_id:String, val purchase_insurance:Boolean)


data class ArrangePickupShopShip(val shipment_id:String?, var parcel:ShopCreateParcel? )