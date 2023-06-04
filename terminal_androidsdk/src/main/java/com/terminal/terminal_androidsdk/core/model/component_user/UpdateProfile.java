package com.terminal.terminal_androidsdk.core.model.component_user;

public class UpdateProfile {
    public  String firstName;
    public  String lastName;
    public  String phone;
    public  String companyName;
    public  UpdateProfile(){}

    public  UpdateProfile(String firstName,String lastName, String companyName){
        this.firstName = firstName; this.companyName = companyName; this.lastName = lastName;
    }

}
