package com.terminal.terminal_androidsdk.core.model.component_user;

import android.os.Parcel;
import android.os.Parcelable;

import com.terminal.terminal_androidsdk.core.model.CreateAddress;

public class SignUpUser implements Parcelable {

        public  String country;
        public CreateAddress companyAddress;
        public  String email;
        public  String first_name;
        public  String business_category;
        public  String ip;
        public  String last_name;
        public  String password;
        public  String phone;
        public  String referredBy;
        public  String referralSource;
        public  String signUpType;
        public  String state;
        public  String store_name;
        public  String template;
        public  String utm_source;
        public  String websiteType;
    public SignUpUser(){

    }

        protected SignUpUser(Parcel in) {
                country = in.readString();
                email = in.readString();
                first_name = in.readString();
                business_category = in.readString();
                ip = in.readString();
                last_name = in.readString();
                password = in.readString();
                phone = in.readString();
                referredBy = in.readString();
                referralSource = in.readString();
                signUpType = in.readString();
                state = in.readString();
                store_name = in.readString();
                template = in.readString();
                utm_source = in.readString();
                websiteType = in.readString();
        }

        public static final Creator<SignUpUser> CREATOR = new Creator<SignUpUser>() {
                @Override
                public SignUpUser createFromParcel(Parcel in) {
                        return new SignUpUser(in);
                }

                @Override
                public SignUpUser[] newArray(int size) {
                        return new SignUpUser[size];
                }
        };

        @Override
        public int describeContents() {
                return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(country);
                parcel.writeString(email);
                parcel.writeString(first_name);
                parcel.writeString(business_category);
                parcel.writeString(ip);
                parcel.writeString(last_name);
                parcel.writeString(password);
                parcel.writeString(phone);
                parcel.writeString(referredBy);
                parcel.writeString(referralSource);
                parcel.writeString(signUpType);
                parcel.writeString(state);
                parcel.writeString(store_name);
                parcel.writeString(template);
                parcel.writeString(utm_source);
                parcel.writeString(websiteType);
        }
}
