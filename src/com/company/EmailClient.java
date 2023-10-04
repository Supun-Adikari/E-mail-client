
// Index no : 200012R
// Name     : A.M.S.S.H.ADIKARI
package com.company;


import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
public class EmailClient {

    public static void main(String[] args) throws ParseException, IOException, ClassNotFoundException {

        Deserialize.deSerialize(null);
        RecipientBirthdays.sendBirthdayWishes();


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter option type: \n"
                + "1 - Adding a new recipient\n"
                + "2 - Sending an email\n"
                + "3 - Printing out all the recipients who have birthdays\n"
                + "4 - Printing out details of all the emails sent\n"
                + "5 - Printing out the number of recipient objects in the application");


        int option = scanner.nextInt();
        switch (option){

            case 1:
                String details=GetDetails.getDetailsToAddNewRecipient();
                StoreAndLoadDetails.storeDetails(details);
                System.out.println("Details are successfully entered to the system.");
                break;

            case 2:
                String emailDetails=GetDetails.getDetailsToSendEmail();
                SendEmail.sendNewEmail(emailDetails);
                break;


            case 3:
                PrintBirthDayRecipients.chooseBirthdayRecipients();
                PrintBirthDayRecipients.printBirthdayRecipient();
                break;



            case 4:
                // input format - yyyy/MM/dd (ex: 2018/09/17)
                System.out.println("input format - yyyy/MM/dd (ex: 2018/09/18)");
                Scanner sc4 = new Scanner(System.in);
                String inDate = sc4.nextLine();
                String inDate_ = inDate.trim();
                // code to print the details of all the emails sent on the input date
                Deserialize.deSerialize(inDate_);
                break;


            case 5:
                int totalNUmberOfRecipients=Official.getNumberOfOfficialRecipients()+OfficeFriend.getNumberOfOfficeFriendRecipients()+Personal.getNumberOfPersonalRecipients();

                if(totalNUmberOfRecipients==0){
                    System.out.println(0);
                }
                else
                    System.out.println(totalNUmberOfRecipients);


                break;


        }
    }
}





