package com.terminal.terminal_androidsdk.core.model.component_shipment;

import android.os.Parcelable;

public class ShipMetaRate implements Parcelable {
    public  SelectedRate  selected_rate;
    public ShipmentPayload shipment_payload;
    public  ShipMetaRate(){}

    protected ShipMetaRate(android.os.Parcel in) {
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<ShipMetaRate> CREATOR = new Creator<ShipMetaRate>() {
        @Override
        public ShipMetaRate createFromParcel(android.os.Parcel in) {
            return new ShipMetaRate(in);
        }

        @Override
        public ShipMetaRate[] newArray(int size) {
            return new ShipMetaRate[size];
        }
    };
}
