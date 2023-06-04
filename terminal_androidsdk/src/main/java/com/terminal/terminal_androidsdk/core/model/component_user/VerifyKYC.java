package com.terminal.terminal_androidsdk.core.model.component_user;

public class VerifyKYC {
    public  String photoUrl;
    public  String bvn;
    public  String storeId;

    public  VerifyKYC(){}

    public  VerifyKYC(String photoUrl, String bvn, String storeId){
        this.photoUrl = photoUrl;
        this.bvn = bvn;
        this.storeId = storeId;
    }

}
