package com.terminal.terminal_androidsdk.core.model.claims;

public class ClaimModel {
    public  String description;
    public  String reason;
    public  String signature;
    public  String[][] witnesses;

    public ClaimModel(){}
    public ClaimModel(String description, String reason , String signature, String[][] witnesses){
        this.description = description; this.reason = reason; this.signature = signature; this.witnesses = witnesses;
    }
}
