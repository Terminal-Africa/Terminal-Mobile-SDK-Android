package com.terminal.terminal_androidsdk.core.model

import java.util.Objects

class CreateAddress (
    val city:String?, val state:String?, val country:String?
    ){

    data class Builder(
            var city:String,
            var state:String,
            var country:String,
            var email :String? = null,
            var firstName :String? = null,
            val isResidential:String? = null,
            var lastName :String? = null,
            var line1 :String? = null,
            var line2 :String? = null,
            var metaData :Objects? = null,
            var name:String? = null,
            var phone:String? = null,
            var zip:String? = null,



            ){
        fun city(city: String) = apply { this.city = city }
        fun state(state: String) = apply { this.state = state }
        fun country(country: String) = apply { this.country = country }
        fun email(email: String) = apply { this.email = email }
        fun firstName(firstName: String) = apply { this.firstName = firstName }

        fun build() = CreateAddress(city, state, country)
    }

}
