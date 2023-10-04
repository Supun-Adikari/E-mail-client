package com.company;

import java.io.IOException;
import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.ArrayList;

public class RecipientBirthdays {
    private static ArrayList<String> names;

    static {
        try {
            names = RecipientObjects.getTodayBirthDayRecipients();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void sendBirthdayWishes() throws ParseException {

        try{
            //System.out.println("There are birthdays of your friends today");
            //System.out.println("BirthDay wishes will be sent to your friends with birthdays today. Please wait a moment");
            //System.out.println("");
        for (int i=0;i< names.size();i+=4){
            if (names.get(i).equalsIgnoreCase("Official_friend")){

                SendEmail.sendEmailHandler(names.get(i+2),"Bithday wish","Wish you a happy birth day. Supun" );
            }
            else{
                SendEmail.sendEmailHandler(names.get(i+2),"Birthday Wish"," Hugs and love on your birthday.Supun");
            }
        }
        } catch (NullPointerException | IOException e) {
            return;
        }


    }

}



