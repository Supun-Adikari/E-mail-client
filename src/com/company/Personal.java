package com.company;

public class Personal extends  Recipients {
    private String nickName;
    private String birthDay;
    private static int numberOfPersonalRecipients=0;


    public Personal(String recipientType,String name,String nickName, String email,String birthDay) {
        super(recipientType,name, email);
        this.nickName=nickName;
        this.birthDay=birthDay;
        numberOfPersonalRecipients++;
    }

    public static int getNumberOfPersonalRecipients(){
        return numberOfPersonalRecipients;
    }

    public static void numberOfObjects(){
        numberOfPersonalRecipients--;

    }
    public String getNickName(){
        return nickName;
    }
    public String getBirthDay(){
        return birthDay;
    }
}
