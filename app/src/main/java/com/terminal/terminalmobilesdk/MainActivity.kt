package com.terminal.terminalmobilesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.terminal.terminal_androidsdk.core.db.BaseData
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCountries
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCreate
import com.terminal.terminal_androidsdk.core.model.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeTerminal()
    }

    private  fun initializeTerminal(){
        TShipSDK.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        getAddresses()
    }

    private fun getAddresses(){
        val home = CreateAddress.Builder("Atyy","uihu","yug","opoj", line1 = "iuhuh")
            .email("")
            .build()


        var yyy= home
       /*
        TShipSDK.getAddresses(object : ITerminalAddress {
            override fun onError(status: Boolean, message: String) {
                var tt = message
            }

            override fun onResponse(result: BaseData<GetAddressModel>) {
                TODO("Not yet implemented")
            }

        }, 1)
        */


        TShipSDK.updateAddress(object :ITerminalCreate {
            override fun onError(status: Boolean, message: String) {
              //  TODO("Not yet implemented")
            }

            override fun onResponse(result: BaseData<Address>) {

                //TODO("Not yet implemented")

            }
        }, "", UpdateAddress("","","","") )

    }


}