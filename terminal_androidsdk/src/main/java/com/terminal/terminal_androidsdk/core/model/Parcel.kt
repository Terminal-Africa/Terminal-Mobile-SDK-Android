package com.terminal.terminal_androidsdk.core.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.iinterface.ParcelItemType
import kotlinx.android.parcel.Parcelize

@Parcelize
class ParcelResponse : Parcelable {
    var description:String= ""
    var id :String= ""
    var items : List<ParcelItem> = arrayListOf()
    var packaging:String= ""
    var metadata:Any? = null
    @SerializedName("parcel_id")
    @Expose
    val parcelId:String= ""

    @SerializedName("proof_of_payments")
    @Expose
    var proofOfPayments:ArrayList<String>? = arrayListOf()

    @SerializedName("total_weight")
    @Expose
    var totalWeight:Double? = null
    var weight:Double = 0.00
    @SerializedName("weight_unit")
    @Expose
    var weightUnit:String = ""
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
}


@Parcelize
class  ParcelItem(val description:String,
                   val name:String,
                   var currency:String,
                   var value:Double = 0.0,
                   var weight:Double = 0.0,
                   val quantity:Double = 0.0,
                    val type: String? =  ParcelItemType.Parcel.parcelType,
                   val hs_code:String? = "",
                   val transRef:String? = "",


) : Parcelable


data class GetParcelModelList(val parcels:List<ParcelResponse> = arrayListOf(), val pagination: Pagination, )

class  CreateModel(val weightUnit:String, val packaging:String, val item:List<ParcelItem>,
                      var description :String = "", var metadata :Any)

class  UpdateParcelModel(val weight_unit:String, val packaging:String, val items:List<ParcelItem>,
                   var description :String = "",var proof_of_payments :ArrayList<String>? = null, var metadata :Any? = null)

class CreateParcel (
    val weight_unit:String, val packaging:String, val items:List<ParcelItem>,
    var description :String? = null, var proof_of_payments :ArrayList<String>? = null,var metadata :Any? = null

){
    data class Builder(
        var weightUnit:String,
        var packaging:String,
        var item:List<ParcelItem>,
        var description :String? = null,
        var proof_of_payments:ArrayList<String>? = null,
        var metadata :Any? = null,
    ){
        fun weightUnit(weight_unit: String) = apply { this.weightUnit = weightUnit }
        fun packaging(packaging: String) = apply { this.packaging = packaging }
        fun item(item: List<ParcelItem>) = apply { this.item = item }
        fun description(description: String) = apply { this.description = description }
        fun metadata(metadata: Any) = apply { this.metadata = metadata }
        fun proofOfPayments(proof_of_payments: ArrayList<String>) = apply { this.proof_of_payments = proof_of_payments }

        fun build() = CreateParcel(weightUnit, packaging, item, description, proof_of_payments,metadata
           )
    }
}
@Parcelize
data class TShopMeta(val tshop_metadata :ShopMetaData? = null):Parcelable


@Parcelize
 class ShopCreateParcel(
    val weight_unit:String, val items:List<ParcelItem>,
    var description :String? = null, val metadata :TShopMeta? = null,

): Parcelable{
    data class Builder(
        var weightUnit:String,
        var item:List<ParcelItem>,
        var description :String? = null,
        var metadata :TShopMeta? = null,
    ){
        fun weightUnit(weight_unit: String) = apply { this.weightUnit = weightUnit }
        fun item(item: List<ParcelItem>) = apply { this.item = item }
        fun description(description: String) = apply { this.description = description }
        fun metadata(metadata: TShopMeta) = apply { this.metadata = metadata }

        fun build() = ShopCreateParcel(weightUnit, item, description,metadata)
    }
}
@Parcelize
class ShopMetaData(val tshop_source_store_name:String,
                   val tshop_item_description:String,
                   val tshop_item_value:Double,
                   val tshop_order_tracking_number:String,
                   val tshop_order_carrier:String,
                   val tshop_order_tracking_link:String,
                   val tshop_order_proof_of_payment: String,
                   var tshop_currency:String,
                   var tshop_opt_in_insurance:Boolean
): Parcelable


