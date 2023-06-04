package com.terminal.terminal_androidsdk.core.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
@Parcelize
class CreateAddress (
    var city:String, var state:String, var country:String,
    var email :String? = null,
    var first_name :String? = null,
    var isResidential:Boolean? = null,
    var last_name :String? = null,
   public var line1 :String? = null,
    var line2 :String? = null,
    var zip:String? = null,
    var phone:String? = null,
    var name:String? = null,
    ): Parcelable {

    data class Builder(
            var city:String,
            var state:String,
            var country:String,
            var email :String? = null,
            var first_name :String? = null,
            var isResidential:Boolean? = null,
            var last_name :String? = null,
            var line1 :String? = null,
            var line2 :String? = null,
            var name:String? = null,
            var phone:String? = null,
            var zip:String? = null,
            ){

        fun line1(line1: String) = apply { this.line1 = line1 }
        fun line2(line2: String) = apply { this.line2 = line2 }
        fun isResidential(isResidential: Boolean) = apply { this.isResidential = isResidential }
        fun city(city: String) = apply { this.city = city }
        fun state(state: String) = apply { this.state = state }
        fun country(country: String) = apply { this.country = country }
        fun email(email: String) = apply { this.email = email }
        fun firstName(firstName: String) = apply { this.first_name = firstName }
        fun lastName(lastName: String) = apply { this.last_name = lastName }
        fun zip(zip: String) = apply { this.zip = zip }
        fun phone(phone: String) = apply { this.phone = phone }
        fun name(name: String) = apply { this.name = name }
        fun build() = CreateAddress(city, state, country, email, first_name, isResidential, last_name, line1,line2,
        zip,phone,name)
    }
}


class UpdateAddress (
    val city:String, val state:String, val country:String,val zip: String,
    var email :String? = null,
    var first_name :String? = null,
    var is_residential:Boolean? = null,
    var last_name :String? = null,
    var line1 :String? = null,
    var line2 :String? = null,
    var phone:String? = null,
    var name:String? = null,
){

    data class Builder(
        var city:String,
        var state:String,
        var country:String,
        var zip:String,
        var email :String? = null,
        var first_name :String? = null,
        var is_residential:Boolean? = null,
        var last_name :String? = null,
        var line1 :String? = null,
        var line2 :String? = null,
        var name:String? = null,
        var phone:String? = null,

    ){
        fun line1(line1: String) = apply { this.line1 = line1 }
        fun line2(line2: String) = apply { this.line2 = line2 }
        fun isResidential(isResidential: Boolean) = apply { this.is_residential = isResidential }
        fun city(city: String) = apply { this.city = city }
        fun state(state: String) = apply { this.state = state }
        fun country(country: String) = apply { this.country = country }
        fun email(email: String) = apply { this.email = email }
        fun firstName(firstName: String) = apply { this.first_name = firstName }
        fun lastName(lastName: String) = apply { this.last_name = lastName }
        fun zip(zip: String) = apply { this.zip = zip }
        fun phone(phone: String) = apply { this.phone = phone }
        fun name(name: String) = apply { this.name = name }
        fun build() = UpdateAddress(
            city, state, country,zip, email, first_name, is_residential, last_name, line1, line2,
             phone, name
        )
    }
}

