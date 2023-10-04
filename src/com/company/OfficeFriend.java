package com.company;

public class OfficeFriend extends Official {
    private String birthDay;
    private static int numberOfOfficeFriendRecipients=0;

    public OfficeFriend(String recipientType,String name, String email, String designation,String birthDay) {
        super(recipientType,name, email, designation);
        this.birthDay=birthDay;
        numberOfOfficeFriendRecipients++;
    }
    public  static  int getNumberOfOfficeFriendRecipients(){
        if (numberOfOfficeFriendRecipients==0){
            return 0;
        }
        else
            return numberOfOfficeFriendRecipients-1;
    }
    public static void numberOfObjects(){
        numberOfOfficeFriendRecipients=numberOfOfficeFriendRecipients-1;
    }

    public String getBirthDay(){
        return birthDay;
    }
}
