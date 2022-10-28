package com.terminal.terminalmobilesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.terminal.terminal_androidsdk.core.network.BaseData
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.ITerminalAddress
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration
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


        TShipSDK.getGenerics(object :ITerminalConfiguration<GetAddressModel>{
            override fun onResponse(result: GetAddressModel) {
                TODO("Not yet implemented")
            }

            override fun onError(status: Boolean, message: String) {
                TODO("Not yet implemented")
            }
        })


        TShipSDK.getAddresses(1,23, object : ITerminalAddress {
            override fun onResponse(result: BaseData<GetAddressModel>) {
                TODO("Not yet implemented")
            }

            override fun onError(status: Boolean, message: String) {
                TODO("Not yet implemented")
            }
        })


    }


}