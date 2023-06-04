package com.terminal.terminal_androidsdk.core.model

import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
@Parcelize
class Address : Parcelable {
    val user:String = ""
    val city:String = ""
    //val coordinates:Coordinates? = null
    val country:String = ""
    val email : String = ""

    @SerializedName("first_name")
    @Expose
    val firstName:String = ""
    @SerializedName("is_residential")
    @Expose
    val isResidential:String = ""
    @SerializedName("last_name")
    @Expose
    val lastName:String = ""
    val line1:String = ""
    val line2 : String = ""
    var phone:String = ""
    @SerializedName("place_id")
    @Expose
    val placeId:String = ""
    val state : String = ""
    val name:String = ""
    val zip:String = ""
    @SerializedName("address_id")
    @Expose
    var addressId : String = ""
//    @SerializedName("created_at")
//    @Expose
//    val createdAt:String = ""
//    @SerializedName("updated_at")
//    @Expose
//    val updatedAt:String = ""

}

@Parcelize
data class Coordinates(val lat:Double, val lng:Double, val place_id : String ):Parcelable

data class GetAddressModel(val addresses:List<Address> = arrayListOf(), val pagination: Pagination, )


 class  Pagination{
    val page:Int = 0
     val perPage:Int = 0
     //val prevPage:Int = 0
    // val nextPage:Int = 0
     val currentPage:Int = 0
     val total:Int = 0
     val pageCount:Int = 0
     val pagingCounter:Int = 0
     val hasPrevPage:Boolean = false
     val hasNextPage:Boolean = false
 }

class  AddressValidationResponse{
    @SerializedName("is_valid")
    @Expose
    val isValid:Boolean = false
    val city:String = ""
    val coordinates:Coordinates? = null
    val country:String = ""
    val line1:String = ""
    val line2:String = ""
    val state:String = ""
    val zip:String = ""

}
class  AddressValidation{
    val city:String = ""
    val country:String = ""
    val line1:String = ""
    val line2:String = ""
    val state:String = ""
    val zip:String = ""
}