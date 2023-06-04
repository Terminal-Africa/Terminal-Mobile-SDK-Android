package com.terminal.terminalmobilesdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.terminal.terminal_androidsdk.core.ITerminalConfiguration
import com.terminal.terminal_androidsdk.core.TShipSDK
import com.terminal.terminal_androidsdk.core.model.*
import com.terminal.terminal_androidsdk.core.model.component_shipment.ShipmentUnpopulated


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeTerminal()
    }

    private  fun initializeTerminal(){
       TShipSDK.init("sk_test_hmeZxKHvZdbWfkFb0oxh8coYx46j7rZS",false)
        getCityAndState()
    }

    private  fun getCityAndState(){
        TShipSDK.cancelShipmentByID(CancelShipment("SH-16733603020"),object :ITerminalConfiguration<ShipmentUnpopulated>{
            override fun onResponse(result: ShipmentUnpopulated) {

            }
                 var tt : ShipmentUnpopulated= ShipmentUnpopulated("","","","",)
                        var ttee = tt.events
            override fun onError(status: Boolean, message: String) {
            }
        })


        /*
              override fun onResponse(result: TrackShipmentRes) {
                var rr = result
            }
                 var tt : ShipmentUnpopulated= ShipmentUnpopulated("","","","",)
                        var ttee = tt.events
            //:()
            override fun onError(status: Boolean, message: String) {
                var rr = message
            }
        })
         */

//       TShipSDK.getTransaction("6299e3829bcda6b832054f19",object :ITerminalConfiguration<GetTransactionModelList>{
//           override fun onResponse(result: GetTransactionModelList) {
//               var rr = result
//           }
//           override fun onError(status: Boolean, message: String) {
//               var rr = message
//           }
//       })

//        TShipSDK.getSpecificTransaction("TR-SxubpYtD4gf",object :ITerminalConfiguration<Transaction>{
//            override fun onResponse(result: Transaction) {
//                var rr = result
//            }
//            override fun onError(status: Boolean, message: String) {
//                var rr = message
//            }
//        })


//        TShipSDK.disableShipCarriers("CA-20216731467",object :ITerminalConfiguration<GetCarriesModel>{
//            override fun onResponse(result: GetCarriesModel) {
//                var rr = result
//            }
//
//            override fun onError(status: Boolean, message: String) {
//                var rr = message
//            }
//        })
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

        //CA-20216731467

    }
}