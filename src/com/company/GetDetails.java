package com.company;

import java.util.Scanner;

public class GetDetails {
    private static Scanner scanner=new Scanner(System.in);

    public  static  String getDetailsToAddNewRecipient(){
        System.out.println("Enter the details in following order\n"
        +"For Official recipients ;  Official:<name>,<email>,<designation>\n"
        +"For Official friends    ;  Official_friend:<name>,<email>,<designation>,<dateOfBirth(yyyy/mm/dd)>\n"
        +"For personal recipients ;  Personal:<name>,<nick-name>,<email>,<dateOfBirth(yyyy/mm/dd)>\n");
        return scanner.nextLine();
    }

    public static  String getDetailsToSendEmail(){
        System.out.println("Enter the details in following order\n"
        +"email,subject,content");
        return scanner.nextLine();
    }
    public static String getDate(){
        System.out.println("Enter the date in the following format\n"+"yyyy/mm/dd");
        return scanner.nextLine();
    }


}
