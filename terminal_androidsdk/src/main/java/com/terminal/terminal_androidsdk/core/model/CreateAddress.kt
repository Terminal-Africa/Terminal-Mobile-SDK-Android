package com.terminal.terminal_androidsdk.core.model
/**
 * Created by AYODEJI on 10/10/2020.
 *
 */

class CreateAddress (
    val city:String, val state:String, val country:String,
    var email :String? = null,
    var firstName :String? = null,
    var isResidential:Boolean? = null,
    var lastName :String? = null,
    var line1 :String? = null,
    var line2 :String? = null,
    var zip:String? = null,
    var phone:String? = null,
    var name:String? = null,
    ){

    data class Builder(
            var city:String,
            var state:String,
            var country:String,
            var email :String? = null,
            var firstName :String? = null,
            var isResidential:Boolean? = null,
            var lastName :String? = null,
            var line1 :String? = null,
            var line2 :String? = null,
            var name:String? = null,
            var phone:String? = null,
            var zip:String? = null,
            ){
        fun line1(line1: String) = apply { this.line1 = line1 }
        fun line2(line2: String) = apply { this.line2 = line1 }
        fun isResidential(isResidential: Boolean) = apply { this.isResidential = isResidential }
        fun city(city: String) = apply { this.city = city }
        fun state(state: String) = apply { this.state = state }
        fun country(country: String) = apply { this.country = country }
        fun email(email: String) = apply { this.email = email }
        fun firstName(firstName: String) = apply { this.firstName = firstName }
        fun lastName(lastName: String) = apply { this.lastName = lastName }
        fun zip(zip: String) = apply { this.zip = zip }
        fun phone(phone: String) = apply { this.phone = phone }
        fun name(name: String) = apply { this.name = name }
        fun build() = Builder(city, state, country, email, firstName, isResidential, lastName, line1,line2,
        zip,phone,name)
    }
}


class UpdateAddress (
    val city:String, val state:String, val country:String,val zip: String,
    var email :String? = null,
    var firstName :String? = null,
    var isResidential:Boolean? = null,
    var lastName :String? = null,
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
        var firstName :String? = null,
        var isResidential:Boolean? = null,
        var lastName :String? = null,
        var line1 :String? = null,
        var line2 :String? = null,
        var name:String? = null,
        var phone:String? = null,

    ){
        fun line1(line1: String) = apply { this.line1 = line1 }
        fun line2(line2: String) = apply { this.line2 = line1 }
        fun isResidential(isResidential: Boolean) = apply { this.isResidential = isResidential }
        fun city(city: String) = apply { this.city = city }
        fun state(state: String) = apply { this.state = state }
        fun country(country: String) = apply { this.country = country }
        fun email(email: String) = apply { this.email = email }
        fun firstName(firstName: String) = apply { this.firstName = firstName }
        fun lastName(lastName: String) = apply { this.lastName = lastName }
        fun zip(zip: String) = apply { this.zip = zip }
        fun phone(phone: String) = apply { this.phone = phone }
        fun name(name: String) = apply { this.name = name }
        fun build() = UpdateAddress.Builder(
            city, state, country,zip, email, firstName, isResidential, lastName, line1, line2,
             phone, name
        )
    }
}

