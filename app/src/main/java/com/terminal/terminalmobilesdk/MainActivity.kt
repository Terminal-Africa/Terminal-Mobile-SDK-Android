package com.terminal.terminalmobilesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        TShipSDK.init("sk_test_tuBAv3arC8x8tryQnf1EfQUDmMYlXgZ0",false)
        getCityAndState()
    }

    private  fun getCityAndState(){
      /*
        TShipSDK.getRateForShipment(ShipmentRate.Builder("PC-01337111770","AD-48503878906")
            .build(),object :ITerminalConfiguration<List<RateModel>>{
            override fun onResponse(result: List<RateModel>) {
                var resul = result
            }

            override fun onError(status: Boolean, message: String) {
                var result = message
            }
        })
       */

          TShipSDK.getPackaging("",object :ITerminalConfiguration<GetPackagingList>{
              override fun onError(status: Boolean, message: String) {
                  var result = message
              }

              override fun onResponse(result: GetPackagingList) {
                  var resul = result
              }
          })

    }


}