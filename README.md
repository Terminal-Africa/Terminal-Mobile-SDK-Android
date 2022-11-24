# Terminal-Mobile-SDK-Android

# TShipSDK :ship: :nigeria:

## Table of Contents
1. [Overview](#overview)
2. [Why TShip?](#why-tship)
3. [Features](#features)
4. [Getting Started](#getting-started)
5. [Addresses](#addresses)
6. [Miscellanous](#miscellanous)
6. [Packaging](#packaging)
<!-- 8. [Models](#models) -->


SDK to make TShip API integration for Android developers easier.

## Overview
The TShip SDK was built on top of the TShip API to make integrating the TShip API in your App easier. The TShip API is a JSON API that provides a single interface for integrating Nigerian shipping carriers such as DHL, Gokada, Sendbox with your applications. The API allows anyone to programatically get shipping rates and arrange pickup and delivery for a parcel. The TShip SDK enables you to easily do all of this in your iOS App. To use the TShip SDK, you need to [create an account on the Terminal website](https://app.terminal.africa/sign-up) and retrieve a Secret Key in your settings. 

#### Technology
TShip aggrevates multiple Shipment carriers operating in Nigeria, e.g. Gokada, Kwik, Sendbox, DHL Express and UPS. We've abstracted integration of the mentioned shipping carriers into a single interface, to provide an easy channel for anyone to build shipping into their products.

In the future, we hope to expand our partnerships to include other shipping carriers outside Africa.

## Why TShip?
We've spent a lot of time building several tools for businesses in the eCommerce space in Nigeria and always found it difficult to build shipping into our apps. Setting up an account with a logistics company in Nigeria still requires individuals to have registered businesses and also provide a lot of documentation. Many businesses in the region, also tend to use a combination of carriers for local and international deliveries, so the set up process can get exhausting. 

For developers with access, you also have to navigate through legacy API systems with often poorly written documentation to build shipping into your apps. We went through that and decided to make it a lot easier for other developers, this is why we created TShip.

Through TShip, developers have a gateway to leading logistics partners on the continent via a single interface, removing the need for unnesseccary documentation and allowing them to focus on what they do best, building great products for the ecosystem.

## Features
This section describes the core features available through the Shipmonk API.

- **Get Live Shipping Rates**:
Get live shipping rates for any of Shipmonk's carrier partners including DHL Express, Gokada, Kwik, Sendbox and UPS. Shipmonk will also provide information about pickup dates and delivery times for each rate request.

- **Arrange Pickup & Delivery**:
Arrange pickup and delivery for your parcels with a single API call. The API call also allows you to specify the type of vehicle needed for the shipment as well as indicate how much assistance you might need to load a large parcel. In the future, Shipmonk will also allow you to schedule shipment requests with our respective carrier partners.

- **Track Shipments**:
Shipmonk provides an endpoint for tracking any shipment arranged via the API. We also include links to specific carrier tracking pages with each request.

- **Manage Packaging**:
You can create and maintain information about the different types of packaging you use for preparing your parcels. In the future, shipmonk will allow you to access packaging informatin from our carrier partners.


## Getting Started

To create an instance of `TShipSDK` you call the `TShipSDK.init(secretKey: String,isLive:Boolean)` method which takes your Secret Key which can be found in the Api Keys section of the settings tab on the [Terminal dashboard](https://app.terminal.africa/) -> Api Keys. The `init` method returns the new instance created. It also takes in a boolean value to determine is the SDK should be run on staging or Live URL.

This method will create a global instance of the `TShipSDK` that can be accessed through the `TShipSDK` property. The `TShipSDK.instance` is nullable and will be null until it is created. 

Since the instance is global it would be best to call `init` in your MainApplication.kotlin/java so you can retrieve the instance with `TShipSDK` anywhere in your app.

For any enquires, send a mail to ayodeji.olalekan@terminal.africa


## Addresses

Here you'll find information on how to create, update, fetch and validate addresses.

### Create Address
```
 TShipSDK.createAddress(CreateAddress.Builder("","","").build(),object :ITerminalConfiguration<Address>{
            override fun onResponse(result: Address) {
                
            }

            override fun onError(status: Boolean, message: String) {
                
            }
        })
```
##### Description

This function creates an Address on the TShip API.

##### Parameters

`createAddress: [createAddress: CreateAddress]`

Request body with details used to create Address. You'll build the request with the [CreateAddress.Builder](#createAddress).

`callback: ITerminalConfiguration<Address>`

The callback to call, passing along the response status and the newly created [Address](#address) if no error occurred.


### Get Address

```
       TShipSDK.getAddresses(object :ITerminalConfiguration<GetAddressModel>{
           override fun onResponse(result: GetAddressModel) {
           }
           override fun onError(status: Boolean, message: String) {
           }
       })
```
##### Description

This function fetches Addresses previously created on the TShip API.

##### Parameters

`page: [Int]`
`limit: [Int]`

### Update Address

```
   TShipSDK.updateAddress("", UpdateAddress.Builder("","","","").build(),object :ITerminalConfiguration<Address>{
            override fun onResponse(result: Address) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description
This function updates an Address previously created on the TShip API.


## Miscellanous

Here you'll find information about miscellanous remote operations you can make that support other operations.

### Get Valid Cities

```
    TShipSDK.getCitiesInState("countryCode","stateCode",object :ITerminalConfiguration<List<TerminalCities>>{
            override fun onResponse(result: List<TerminalCities>) {
            }

            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches all the cities within a state valid on the TShip API.

### Get Valid Countries

```
 TShipSDK.getCountries(object :ITerminalConfiguration<List<TerminalCountries>>{
            override fun onResponse(result: List<TerminalCountries>) {
            }

            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function all the countries valid on the TShip API.


### Get Valid States

```
  TShipSDK.getStateInCountry("",object :ITerminalConfiguration<List<TerminalStates>>{
            override fun onResponse(result: List<TerminalStates>) {
            }

            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function all the countries valid on the TShip API.

## Packaging

Here you'll find information on how to create, update and fetch Packaging.

### Create Packaging

```
 TShipSDK.createPackaging(Packaging(),object :ITerminalConfiguration<PackagingResponse>{
          override fun onResponse(result: PackagingResponse) {
          }
          override fun onError(status: Boolean, message: String) {
          }
      })
```

##### Description

This function creates a Packaging on the TShip API.

### Get Packaging

```
 TShipSDK.getSpecificPackaging("",object :ITerminalConfiguration<PackagingResponse>{
          override fun onResponse(result: PackagingResponse) {
          }
          override fun onError(status: Boolean, message: String) {
          }
      })
```

##### Description

This function fetches details of a Packaging previously created on the TShip API.

### Get Multiple Packaging

```
   TShipSDK.getPackaging("",object :ITerminalConfiguration<GetPackagingList>{
          override fun onResponse(result: GetPackagingList) {
          }
          override fun onError(status: Boolean, message: String) {
          }
      })
```

##### Description

This function fetches the list of Packaging previously created on the TShip API.

### Update Packaging

```
 TShipSDK.updatePackaging("",Packaging(),object :ITerminalConfiguration<PackagingResponse>{
          override fun onResponse(result: PackagingResponse) {
          }
          override fun onError(status: Boolean, message: String) {
          }
      })
```

##### Description

This function fetches the list of Packaging previously created on the TShip API.




This function updates an Address previously created on the TShip API.
