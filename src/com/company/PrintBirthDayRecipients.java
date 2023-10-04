package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class PrintBirthDayRecipients {
    private  static ArrayList<String> data=StoreAndLoadDetails.loadDetails();
    private static  ArrayList<String> birthDaysOnGivenDateRecipient = new ArrayList<>();

    public static void chooseBirthdayRecipients() throws ParseException {
        String date=GetDetails.getDate();
        for (int i = 0; i < data.size(); i++) {

            String[] subData = data.get(i).split(":");



            if (subData[0].equalsIgnoreCase("personal")) {

                String[] subDetails = subData[1].split(",");
                Personal officialClient = new Personal(subData[0], subDetails[0], subDetails[1], subDetails[2], subDetails[3]);
                Personal.numberOfObjects();

                //System.out.println(subData[0]);
                //System.out.println(subDetails[0]);

                //Date date1 = new SimpleDateFormat("yyyy/MM/DD").parse(subDetails[3]);

                if (date.equals(subDetails[3])) {
                    birthDaysOnGivenDateRecipient.add(subDetails[0]);
                }


            }
            if (subData[0].equalsIgnoreCase("official_friend")) {
                String[] subDetails = subData[1].split(",");
                OfficeFriend officialClient = new OfficeFriend(subData[0], subDetails[0], subDetails[1], subDetails[2], subDetails[3]);
                officialClient.numberOfObjects();

                //Date date1 = new SimpleDateFormat("yyyy/MM/DD").parse(subDetails[3]);
                if (date.equals(subDetails[3])) {
                    birthDaysOnGivenDateRecipient.add(subDetails[0]);
                }


            }

        }


    }
    public static void printBirthdayRecipient() {


        for(int i=0; i< birthDaysOnGivenDateRecipient.size();i++){
            System.out.println(birthDaysOnGivenDateRecipient.get(i));
        }

    }
}