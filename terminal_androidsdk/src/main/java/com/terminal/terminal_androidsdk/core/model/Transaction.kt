package com.terminal.terminal_androidsdk.core.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModel

class Receiver(val name:String, val reference:String, val type:String)
class Sender(val name:String, val reference:String, val account_number:String)

data class GetTransactionModelList(val transactions:List<TransactionList>, val pagination: Pagination, )


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

class TransactionList {
    val amount: Double = 0.00
    val currency:String = ""
    val description:String = ""
    val flow:String = ""
    val platform:String = ""
    val reference:String = ""
    val reversed:Boolean = false
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
