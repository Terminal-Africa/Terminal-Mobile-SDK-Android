package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.iinterface.CurrencyType

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
class RateModel {
    val amount:Double = 0.00

    @SerializedName("carrier_id")
    @Expose
    val carrierId:String? = null

    @SerializedName("carrier_logo")
    @Expose
    val carrierLogo:String? = null

    @SerializedName("carrier_name")
    @Expose
    val carrierName:String? = null
    @SerializedName("carrier_rate_description")
    @Expose
    val carrierRateDescription:String? = null
    val currency:String? = null
    @SerializedName("delivery_time")
    @Expose
    val deliveryTime:String? = null

    @SerializedName("id")
    @Expose
    val id:String? = null

    @SerializedName("includes_insurance")
    @Expose
    val includesInsurance:Boolean = false
    @SerializedName("insurance_coverage")
    @Expose
    val insuranceCoverage:Double = 0.0

    @SerializedName("insurance_fee")
    @Expose
    val insuranceFee:Double = 0.0

    @SerializedName("pickup_time")
    @Expose
    val pickupTime:String? = null

    @SerializedName("rate_id")
    @Expose
    val rateId:String? = null

    val shipment:String? = null

    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
}


class ShipmentRate (
    val parcel_id:String,
    var currency:CurrencyType,
    var pickup_address :String? = null,
    var delivery_address :String? = null,
    var shipment_id :String? = null,

){
    data class Builder(
        var parcel_id:String,
        var currency:CurrencyType,
        var pickup_address :String? = null,
        var delivery_address :String? = null,
        var shipment_id :String? = null,

    ){
        fun parcelId(parcel_id: String) = apply { this.parcel_id = parcel_id }
        fun pickupAddress(pickup_address: String) = apply { this.pickup_address = pickup_address }
        fun shipmentId(shipment_id: String) = apply { this.shipment_id = shipment_id }
        fun currency(currency: CurrencyType) = apply { this.currency = currency }
        fun deliveryAddress(delivery_address: String) = apply { this.delivery_address = delivery_address }
        fun build() = ShipmentRate(parcel_id,currency,pickup_address,delivery_address,shipment_id)
    }
}

class ShipRates(val shipment_id:String, val currency:CurrencyType = CurrencyType.NGN,)

class MultiShipmentRate (
    val parcels:ArrayList<String>,
    var pickup_address :String,
    var delivery_address :String,
    var currency:CurrencyType = CurrencyType.NGN,
    var shipment_id :String? = null,

    ){
    data class Builder(
        var parcels:ArrayList<String>,
        var pickup_address :String,
        var delivery_address :String,
        var currency:CurrencyType = CurrencyType.NGN,
        var shipment_id :String? = null,

        ){
        fun parcels(parcels: ArrayList<String>) = apply { this.parcels = parcels }
        fun pickupAddress(pickup_address: String) = apply { this.pickup_address = pickup_address }
        fun shipmentId(shipment_id: String) = apply { this.shipment_id = shipment_id }
        fun currency(currency: CurrencyType) = apply { this.currency = currency }
        fun deliveryAddress(delivery_address: String) = apply { this.delivery_address = delivery_address }
        fun build() = MultiShipmentRate(parcels,pickup_address,delivery_address,currency,shipment_id)
    }
}
