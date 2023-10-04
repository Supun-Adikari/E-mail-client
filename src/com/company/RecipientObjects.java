package com.company;

import java.text.ParseException;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecipientObjects {





    private static ArrayList<String> bithDaysOnTodayRecipients = new ArrayList<>();
   // private static  ArrayList<String> birthDaysOnGivenDateRecipient;


    public static void createRecipientObjects() throws ParseException {
        ArrayList<String> data=StoreAndLoadDetails.loadDetails();
        for (int i = 0; i < data.size(); i++) {

            String[] subData = data.get(i).split(":");
            //System.out.println(subData[0]);
            //System.out.println(subData[1]);

            if (subData[0].toLowerCase().equalsIgnoreCase("official")) {
                String[] subDetails = subData[1].split(",");
                //System.out.println(subDetails[0]);
                //System.out.println(subDetails[1]);
                //System.out.println(subDetails[2]);
                Official officialClient = new Official(subData[0], subDetails[0], subDetails[1], subDetails[2]);


            }
            if (subData[0].toLowerCase().equalsIgnoreCase("personal")) {
                String[] subDetails = subData[1].split(",");
                Personal officialClient = new Personal(subData[0], subDetails[0], subDetails[1], subDetails[2], subDetails[3]);
                //System.out.println(subDetails[3]);
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");

                Date date=new Date();
                String sDate = formatter.format(date);
                String sBday = subDetails[3].split("/", 2)[1].trim();
                //String date1=subDetails[3];

                if (sDate.equals(sBday)){
                    bithDaysOnTodayRecipients.add(subData[0]);
                    bithDaysOnTodayRecipients.add(subDetails[0]);
                    bithDaysOnTodayRecipients.add(subDetails[2]);
                    bithDaysOnTodayRecipients.add(subDetails[3]);

                }





            }
            if (subData[0].toLowerCase().equalsIgnoreCase("official_friend")) {
                String[] subDetails = subData[1].split(",");
                OfficeFriend officialClient = new OfficeFriend(subData[0], subDetails[0], subDetails[1], subDetails[2], subDetails[3]);

                //Date date1=new SimpleDateFormat("yyyy/MM/DD").parse(subDetails[3]);
                SimpleDateFormat formatter = new SimpleDateFormat("MM/dd");

                Date date=new Date();
                String sDate = formatter.format(date);
                String sBday = subDetails[3].split("/", 2)[1].trim();
                //String date1=subDetails[3];

                if (sDate.equals(sBday)){
                    bithDaysOnTodayRecipients.add(subData[0]);
                    bithDaysOnTodayRecipients.add(subDetails[0]);
                    bithDaysOnTodayRecipients.add(subDetails[1]);
                    bithDaysOnTodayRecipients.add(subDetails[3]);
                }



            }

        }
    }
    public  static ArrayList getTodayBirthDayRecipients() throws ParseException {
        RecipientObjects.createRecipientObjects();
        return bithDaysOnTodayRecipients;
    }
}
