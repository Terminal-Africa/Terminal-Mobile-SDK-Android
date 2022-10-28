package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UserProfile {
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
}

class UserProfileInfo{
    val id:String? =  null
    val name:String? =  null
}

class  UserProfileDetails{
    val domestic :List<UserProfileInfo> = arrayListOf()
    val regional :List<UserProfileInfo> = arrayListOf()
    val international :List<UserProfileInfo> = arrayListOf()
}