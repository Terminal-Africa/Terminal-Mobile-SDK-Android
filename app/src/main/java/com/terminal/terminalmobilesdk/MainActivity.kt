package com.terminal.terminalmobilesdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.iinterface.CurrencyType
import com.terminal.terminal_androidsdk.core.model.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeTerminal()
    }

    private  fun initializeTerminal(){
        //  TShipSDK.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        //  TShipSDK.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        TShipSDK.init("sk_test_hmeZxKHvZdbWfkFb0oxh8coYx46j7rZS",false)
        getCityAndState()
    }


    private  fun getCityAndState(){
        TShipSDK.getShipments(object :ITerminalConfiguration<GetShipmentModelList>{
            override fun onResponse(result: GetShipmentModelList) {
                var rr = result
            }

            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })

      /*
        var tt = arrayListOf<ParcelItem>()
        TShipSDK.updateParcel("1233243", UpdateParcelModel("","",tt,"",0),object :ITerminalConfiguration<ParcelResponse>{
            override fun onResponse(result: ParcelResponse) {
                var rr = result
            }

            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })

       */
    }



}