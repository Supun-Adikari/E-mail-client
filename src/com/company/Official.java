package com.company;

import java.io.Serializable;

public class Official extends Recipients implements Serializable {
    private String designation;
    private static int numberOfOfficialRecipients=0;


    public Official(String recipientType,String name, String email,String designation) {
        super(recipientType,name, email);
        this.designation=designation;
        numberOfOfficialRecipients++;
    }

    public static int getNumberOfOfficialRecipients(){

        return numberOfOfficialRecipients;
    }
    public String getDesignation(){
        return designation;
    }



}
