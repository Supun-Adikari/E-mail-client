package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreAndLoadDetails {

    public static void storeDetails(String Details){
        try {
            FileWriter writer = new FileWriter("clientList.txt",true);
            writer.write(Details+"\n");
            writer.close();
        }catch(IOException ex){
            System.out.println("wrong input");
        }
    }

    public static ArrayList<String> loadDetails() {
        ArrayList<String> loadedRecipientDetails=new ArrayList<String>();

        try {
            File reader = new File("clientList.txt");
            Scanner detailReader = new Scanner(reader);
            while (detailReader.hasNextLine()) {
                String data = detailReader.nextLine();
                //System.out.println(data);
                loadedRecipientDetails.add(data);
            }
            detailReader.close();
            return loadedRecipientDetails;
        } catch (FileNotFoundException e) {
            System.out.println("An Error occur.");
            e.printStackTrace();
        }

        return null;
    }
}
