package com.terminal.terminal_androidsdk.core.model.claims;

import android.os.Parcel;
import android.os.Parcelable;

public class UserClaim implements Parcelable {
    public  String description;
    public  String reason;
    public  String signature;
    public  String status;
    public  String claim_id;
    public  String[][] witnesses;

    public  UserClaim(){}

    protected UserClaim(Parcel in) {
        description = in.readString();
        reason = in.readString();
        signature = in.readString();
        status = in.readString();
        claim_id = in.readString();
    }

    public static final Creator<UserClaim> CREATOR = new Creator<UserClaim>() {
        @Override
        public UserClaim createFromParcel(Parcel in) {
            return new UserClaim(in);
        }

        @Override
        public UserClaim[] newArray(int size) {
            return new UserClaim[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(description);
        parcel.writeString(reason);
        parcel.writeString(signature);
        parcel.writeString(status);
        parcel.writeString(claim_id);
    }
}
