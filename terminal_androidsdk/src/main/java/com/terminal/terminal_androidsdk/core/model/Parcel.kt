package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ParcelResponse {
    var description:String= ""
    var id :String= ""
    var items : List<ParcelItem> = arrayListOf()
    var packaging:String= ""
    var metadata:Any? = null
    @SerializedName("parcel_id")
    @Expose
    val parcelId:String= ""
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


class  ParcelItem( val description:String? = null, val name:String,
                   val currency:String,
                   val value:Int = 0,
                   val weight:Int = 0,
                   val quantity:Int = 0)


data class GetParcelModelList(val parcels:List<ParcelResponse> = arrayListOf(), val pagination: Pagination, )

class  CreateModel(val weightUnit:String, val packaging:String, val item:List<ParcelItem>,
                      var description :String = "", var metadata :Any)

class  UpdateParcelModel(val weightUnit:String, val packaging:String, val item:List<ParcelItem>,
                   var description :String = "", var metadata :Any)

class CreateParcel (
    val weight_unit:String, val packaging:String, val items:List<ParcelItem>,
    var description :String? = null, var metadata :Any? = null,

){
    data class Builder(
        var weightUnit:String,
        var packaging:String,
        var item:List<ParcelItem>,
        var description :String? = null,
        var metadata :Any? = null,
    ){
        fun weightUnit(weight_unit: String) = apply { this.weightUnit = weightUnit }
        fun packaging(packaging: String) = apply { this.packaging = packaging }
        fun item(item: List<ParcelItem>) = apply { this.item = item }
        fun description(description: String) = apply { this.description = description }
        fun metadata(metadata: Any) = apply { this.metadata = metadata }
        fun build() = CreateParcel(weightUnit, packaging, item, description, metadata,
           )
    }
}

