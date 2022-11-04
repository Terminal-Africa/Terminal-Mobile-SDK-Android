package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MultipleTransaction {
    @SerializedName("_id")
    @Expose
    val id:String = ""
    @SerializedName("account_reference")
    @Expose
    val accountReference:String = ""
    val accountId:String = ""
    val amount: Double = 0.00

    @SerializedName("amount_received")
    @Expose
    val amountReceived:Double = 0.00
    @SerializedName("converted_amount")
    @Expose
    val convertedAmount:Double = 0.00
    @SerializedName("currency_converted_to")
    @Expose
    val currencyConvertedTo:String = ""
    val currency:String = ""
    val description:String = ""
    val fee :Int = 0
    @SerializedName("flat_amount")
    @Expose
    val flatAmount:Int  = 0
    val flow:String = ""
    val metadata:Any? = null
    @SerializedName("payout_date")
    @Expose
    val payoutDate:String = ""
    val platform:String = ""
    @SerializedName("platform_fee")
    @Expose
    val platformFee:Int = 0
    val receiver : Receiver? = null
    val reversed: Boolean  = false
    val sender : Sender? = null
    val settled: Boolean  = false
    @SerializedName("settlement_reference")
    @Expose
    val settlementReference:String = ""
    val status:String = ""
    @SerializedName("store_reference")
    @Expose
    val storeReference:String = ""
    @SerializedName("transaction_source")
    @Expose
    val transactionSource:String = ""
    val transactionId:String = ""
    val txRef:String = ""
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""



}

    class Receiver(val name:String, val reference:String, val type:String)
class Sender(val name:String, val reference:String, val account_number:String)


class Transaction {

    val id:String = ""

    val amount: Double = 0.00
    val currency:String = ""
    val description:String = ""
    val status:String = ""
    val flow:String = ""
    val platform:String = ""
    val reference:String = ""
    val shipment:String = ""

    @SerializedName("transaction_id")
    @Expose
    val transactionId:String = ""
    val wallet:String = ""
    @SerializedName("created_at")
    @Expose
    val createdAt:String = ""
    @SerializedName("updated_at")
    @Expose
    val updatedAt:String = ""



}
