package com.terminal.terminal_androidsdk.core.model.component_shipment;

import android.os.Parcel;
import android.os.Parcelable;

public class ShipRate implements Parcelable {

        public  String carrier_logo;
        public  String carrier_name;
        public  String carrier_rate_description;
        public  String carrier_reference;
        public  String carrier_slug;
        public  String currency;


    public  ShipRate(){}

        protected ShipRate(Parcel in) {
                carrier_logo = in.readString();
                carrier_name = in.readString();
                carrier_rate_description = in.readString();
                carrier_reference = in.readString();
                carrier_slug = in.readString();
                currency = in.readString();
        }

        public static final Creator<ShipRate> CREATOR = new Creator<ShipRate>() {
                @Override
                public ShipRate createFromParcel(Parcel in) {
                        return new ShipRate(in);
                }

                @Override
                public ShipRate[] newArray(int size) {
                        return new ShipRate[size];
                }
        };

        @Override
        public int describeContents() {
                return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
                dest.writeString(carrier_logo);
                dest.writeString(carrier_name);
                dest.writeString(carrier_rate_description);
                dest.writeString(carrier_reference);
                dest.writeString(carrier_slug);
                dest.writeString(currency);
        }
}
