# Terminal-Mobile-SDK-Android

SDK to make TShip API integration for Android developers easier.

## Creating and Getting TShipSDK Instance

To create an instance of `TShipSDK` you call the `TShipSDK.init(secretKey: String,isLive:Boolean)` method which takes your Secret Key which can be found in the Api Keys section of the settings tab on the [Terminal dashboard](https://app.terminal.africa/) -> Api Keys. The `init` method returns the new instance created. It also takes in a boolean value to determine is the SDK should be run on staging or Live URL.

This method will create a global instance of the `TShipSDK` that can be accessed through the `TShipSDK` property. The `TShipSDK.instance` is nullable and will be null until it is created. 

Since the instance is global it would be best to call `init` in your MainApplication.kotlin/java so you can retrieve the instance with `TShipSDK` anywhere in your app.

For any enquires, send a mail to ayodeji.olalekan@terminal.com

