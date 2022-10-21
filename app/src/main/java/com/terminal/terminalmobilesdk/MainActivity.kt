package com.terminal.terminalmobilesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.terminal.terminal_androidsdk.core.BaseData
import com.terminal.terminal_androidsdk.core.iinterface.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.TerminalConfiguration
import com.terminal.terminal_androidsdk.core.model.GetAddressModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeTerminal()
    }

    private  fun initializeTerminal(){
        TerminalConfiguration.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        getAddresses()
    }

    private fun getAddresses(){
        TerminalConfiguration.getAddresses(object : ITerminalConfiguration {

            override fun onError(status: Boolean, message: String) {
                var tt = message
            }

            override fun onResponse(result: BaseData<GetAddressModel>) {
                TODO("Not yet implemented")
            }

        })
    }


}