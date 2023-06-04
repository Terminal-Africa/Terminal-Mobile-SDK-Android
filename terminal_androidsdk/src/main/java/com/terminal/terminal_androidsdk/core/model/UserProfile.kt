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
data class UserProfile(val country:String): Parcelable {
    @SerializedName("company_name")
    @Expose
    val companyName:String? =  null
    val email:String? =  null
    @SerializedName("first_name")
    @Expose
    val firstName:String? =  null
    @SerializedName("last_name")
    @Expose
    val lastName:String? =  null
    @SerializedName("_id")
    @Expose
    val id:String? =  null
    val name:String? =  null
    val phone:String? =  null
    @SerializedName("user_id")
    @Expose
    val userId:String? =  null
    val wallet:String? =  null
    val status:Boolean? =  null
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""
    val carriers:UserProfileDetails? = null
    val plan:String = ""

    @SerializedName("business_category")
    @Expose
    val businessCategory:String = ""
    @SerializedName("country_state")
    @Expose
    val countryState:String = ""
    @SerializedName("account_active")
    @Expose
    val accountActive:Boolean = false
    @SerializedName("wallet_enabled")
    @Expose
    val walletEnabled:Boolean = false
    val referralCode:String = ""

//    val country:String = ""


}

class UserProfileInfo(  val id:String? =  null,  val name:String? =  null)

class  UserProfileDetails{
    val domestic :List<String> = arrayListOf()
    val regional :List<String> = arrayListOf()
    val international :List<String> = arrayListOf()
}