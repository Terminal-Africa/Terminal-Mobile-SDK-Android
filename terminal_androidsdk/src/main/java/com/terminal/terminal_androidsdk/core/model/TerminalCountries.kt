package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
class TerminalCountries {
    var isoCode: String = ""
    var name:String  = ""

    @SerializedName("phonecode")
    @Expose
    val phoneCode:String = ""
    val flag:String  = ""

    var currency: String = ""
    val latitude: String = ""
    val longitude: String = ""
    val timezones : List<Timezones> = arrayListOf()
}

class  Timezones {
    val zoneName:String = ""
    val gmtOffset:String = ""
    val gmtOffsetName:String  = ""
    val abbreviation:String  = ""
    val tzName:String = ""

}


class TerminalStates {
    val name:String = ""
    val isoCode:String  = ""
    val countryCode:String  = ""
    val latitude:String = ""
    val longitude:String  =""
}

class TerminalCities {
    var name:String = ""
    var countryCode:String  = ""
    var stateCode:String  = ""
    var latitude:String = ""
    var longitude:String  =""
}