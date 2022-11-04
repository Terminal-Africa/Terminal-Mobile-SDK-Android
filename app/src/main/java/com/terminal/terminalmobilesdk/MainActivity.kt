package com.terminal.terminalmobilesdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.model.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeTerminal()
    }

    private  fun initializeTerminal(){
      //  TShipSDK.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        TShipSDK.init("sk_test_Cq6w6P7TYarWNcx2ZQowW5vGriXbVyFE",false)
        getCityAndState()
    }


    private  fun getCityAndState(){
        TShipSDK.getRateForShipment(ShipmentRate.Builder("63642541f296d6b15c985c0d","AD-48503878906","AD-02120186302")
            .build(),object :ITerminalConfiguration<List<RateModel>>{
            override fun onResponse(result: List<RateModel>) {
                var resul = result
            }

            override fun onError(status: Boolean, message: String) {
                var result = message
            }
        })
    }


}