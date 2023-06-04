package com.terminal.terminal_androidsdk.core.model.component_shipment;


import android.os.Parcel;
import android.os.Parcelable;

public class ShipmentResponses implements Parcelable {
    public  String address_to;
    public  String carrier;
    public  String address_from;
    public  String address_return;
    public  String delivery_date;
    public  String delivery_arranged;
    public  ShipMetaRate metadata;
    public  String parcel;
    public  String pickup_date;
    public  String rate;
    public  Double shipment_cost;
    public  String shipment_cost_currency;
    public  String shipment_id;
    public  String shipment_purpose;
    public  String status;
    public  String user;
    public  ShipmentResponses(){}

    protected ShipmentResponses(Parcel in) {
        address_to = in.readString();
        carrier = in.readString();
        address_from = in.readString();
        address_return = in.readString();
        delivery_date = in.readString();
        delivery_arranged = in.readString();
        parcel = in.readString();
        pickup_date = in.readString();
        rate = in.readString();
        if (in.readByte() == 0) {
            shipment_cost = null;
        } else {
            shipment_cost = in.readDouble();
        }
        shipment_cost_currency = in.readString();
        shipment_id = in.readString();
        shipment_purpose = in.readString();
        status = in.readString();
        user = in.readString();
    }

    public static final Creator<ShipmentResponses> CREATOR = new Creator<ShipmentResponses>() {
        @Override
        public ShipmentResponses createFromParcel(Parcel in) {
            return new ShipmentResponses(in);
        }

        @Override
        public ShipmentResponses[] newArray(int size) {
            return new ShipmentResponses[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(address_to);
        dest.writeString(carrier);
        dest.writeString(address_from);
        dest.writeString(address_return);
        dest.writeString(delivery_date);
        dest.writeString(delivery_arranged);
        dest.writeString(parcel);
        dest.writeString(pickup_date);
        dest.writeString(rate);
        if (shipment_cost == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(shipment_cost);
        }
        dest.writeString(shipment_cost_currency);
        dest.writeString(shipment_id);
        dest.writeString(shipment_purpose);
        dest.writeString(status);
        dest.writeString(user);
    }
}
