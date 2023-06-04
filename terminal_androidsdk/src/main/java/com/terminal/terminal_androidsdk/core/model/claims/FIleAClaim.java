package com.terminal.terminal_androidsdk.core.model.claims;

public class FIleAClaim {
    public  ClaimModel claim;
    public String insurance;
    public  FIleAClaim(){}
    public  FIleAClaim(ClaimModel claimModel, String insuranceID){
        this.claim = claimModel; this.insurance = insuranceID;
    }
}
