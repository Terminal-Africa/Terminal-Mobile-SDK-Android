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
8. [Shipments](#shipments)
9. [Users](#users)
11. [Transactions](#transactions)
12. [Carriers](#carriers)
13. [Rates](#rates)
14. [Parcels](#parcels)


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

### Delete Address

```
       TShipSDK.deleteAddress(addressId:String,object :ITerminalConfiguration<Address>{
           override fun onResponse(result: Address) {
           }
           override fun onError(status: Boolean, message: String) {
           }
       })
```
##### Description

This function delete's an Address previously created on the TShip API.

##### Parameters

`addressId: [String]`

### Get Address by ID

```
       TShipSDK.getAddressesById(addressId:String,object :ITerminalConfiguration<GetAddressModel>{
           override fun onResponse(result: GetAddressModel) {
           }
           override fun onError(status: Boolean, message: String) {
           }
       })
```
##### Description

This function fetches a particular Address previously created on the TShip API.

##### Parameters

`addressId: [String]`

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

## Parcels

Here you'll find information on how to create, update and fetch Parcels.

### Create Parcels

```
 TShipSDK.createParcel(CreateParcel(),object :ITerminalConfiguration<ParcelResponse>{
            override fun onResponse(result: ParcelResponse) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function creates a Parcel on the TShip API.

### Get Parcel

```
  TShipSDK.getSpecificParcel("",object :ITerminalConfiguration<ParcelResponse>{
            override fun onResponse(result: ParcelResponse) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details of a Parcel previously created on the TShip API.
### Get Parcels

```
 TShipSDK.getParcels(object :ITerminalConfiguration<GetParcelModelList>{
            override fun onResponse(result: GetParcelModelList) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches Parcels previously created on the TShip API.

### Update Parcel

```
 TShipSDK.updateParcel("", UpdateParcelModel(), object :ITerminalConfiguration<ParcelResponse>{
            override fun onResponse(result: ParcelResponse) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches Parcels previously created on the TShip API.
## Rates

Here you'll find information on how to interact with the Rates endpoint throught the SDK.

### Get Rates for Shipment

```
 TShipSDK.getRateForShipment(ShipmentRate.Builder("",CurrencyType.AED).build(), object :ITerminalConfiguration<List<RateModel>>{
            override fun onResponse(result: List<RateModel>) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function gets the rates for a shipment using the TShip API.
## Shipments

Here you'll find information on how to create, update, fetch, arrange, track and cancel Shipments.

### Create Shipment

```
TShipSDK.createShipments(Shipments.Builder("","","","","").build(), object :ITerminalConfiguration<CreateShipmentRes>{
            override fun onResponse(result: CreateShipmentRes) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function creates a Shipment on the TShip API.


### Get Shipment

```
  TShipSDK.getSpecificShipment("", object :ITerminalConfiguration<CreateShipmentRes>{
            override fun onResponse(result: CreateShipmentRes) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details of a Shipment previously created on the TShip API.


### Get Multiple Shipments

```
 TShipSDK.getShipments( object :ITerminalConfiguration<GetShipmentModelList>{
            override fun onResponse(result: GetShipmentModelList) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches Shipments previously created on the TShip API with the Shipment.

### Track Shipment

```
   TShipSDK.trackShipment("", object :ITerminalConfiguration<TrackShipmentRes>{
            override fun onResponse(result: TrackShipmentRes) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches Shipments previously created on the TShip API with the Shipment populated with details for addresses, carriers and parcel.

### Arrange Shipment

```
 TShipSDK.arrangePickupAndDelivery(ArrangePickupAndDelivery(), object :ITerminalConfiguration<TrackShipmentRes>{
            override fun onResponse(result: TrackShipmentRes) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function arranges pickup and delivery of a Shipment.

### Cancel Shipment

```
 TShipSDK.cancelShipmentByID("", object :ITerminalConfiguration<TrackShipmentRes>{
            override fun onResponse(result: TrackShipmentRes) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function cancels a Shipment previously created on the TShip API.
## Users

Here you'll find information on how to get information related to the user.

### Get User's Profile

```
 TShipSDK.getUserProfile("", object :ITerminalConfiguration<UserProfile>{
            override fun onResponse(result: UserProfile) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details of a User's account.
### Get User's Wallet Details

```
  TShipSDK.getUserBalance("", object :ITerminalConfiguration<UserBalance>{
            override fun onResponse(result: UserBalance) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details about a user's wallet.

## Carriers

### Get User's Carriers

```
  TShipSDK.getShipCarriers( object :ITerminalConfiguration<GetCarriesModelList>{
            override fun onResponse(result: GetCarriesModelList) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches list of all carriers available for a user.

## Transactions

Here you'll find information on how to get Transactions.

### Get Wallet Transactions

```
TShipSDK.getTransaction("", object :ITerminalConfiguration<GetTransactionModelList>{
            override fun onResponse(result: GetTransactionModelList) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details of a User's account.

### Get Transaction

```
 TShipSDK.getSpecificTransaction("", object :ITerminalConfiguration<Transaction>{
            override fun onResponse(result: Transaction) {
            }
            override fun onError(status: Boolean, message: String) {
            }
        })
```

##### Description

This function fetches details of a User's account.



