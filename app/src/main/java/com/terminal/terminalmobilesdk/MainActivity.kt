package com.terminal.terminalmobilesdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.iinterface.CurrencyType
import com.terminal.terminal_androidsdk.core.model.*
import com.terminal.terminal_androidsdk.core.model.component_carries.GetCarriesModelList
import com.terminal.terminal_androidsdk.core.model.component_carries.GetEnableCarriers
import com.terminal.terminal_androidsdk.core.model.component_getship.CreateShipmentRes
import com.terminal.terminal_androidsdk.core.model.component_track.TrackShipmentRes


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
       TShipSDK.getTransaction("6299e3829bcda6b832054f19",object :ITerminalConfiguration<GetTransactionModelList>{
           override fun onResponse(result: GetTransactionModelList) {
               var rr = result
           }
           override fun onError(status: Boolean, message: String) {
               var rr = message
           }
       })

        TShipSDK.getShipCarriers(object :ITerminalConfiguration<GetCarriesModelList>{
            override fun onResponse(result: GetCarriesModelList) {
                var rr = result
            }

            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })

        TShipSDK.getEnabledShipCarriers(object :ITerminalConfiguration<GetEnableCarriers>{
            override fun onResponse(result: GetEnableCarriers) {
                var rr = result
            }

            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })

        /*
         TShipSDK.trackShipment("SH-13621395647",object :ITerminalConfiguration<TrackShipmentRes>{
            override fun onResponse(result: TrackShipmentRes) {
                var rr = result
            }

            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })
         */

    }
}