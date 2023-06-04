package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * Created by AYODEJI on 10/10/2020.
 *
 */
class TerminalCountries {
    val isoCode: String = ""
    val name:String  = ""

    @SerializedName("phonecode")
    @Expose
    val phoneCode:String = ""
    val flag:String  = ""

    val currency: String = ""
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
    val name:String = ""
    val countryCode:String  = ""
    val stateCode:String  = ""
    val latitude:String = ""
    val longitude:String  =""
}