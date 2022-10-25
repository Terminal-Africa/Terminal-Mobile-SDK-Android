package com.terminal.terminalmobilesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.terminal.terminal_androidsdk.core.db.BaseData
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalCountries
import com.terminal.terminal_androidsdk.core.model.TerminalCountries

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


        TShipSDK.getCountries(object :ITerminalCountries {
            override fun onError(status: Boolean, message: String) {
                var tt = message
            }

            override fun onResponse(callback: BaseData<List<TerminalCountries>>) {
                var tt = callback
            }
        })

    }


}