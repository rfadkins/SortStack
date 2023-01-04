package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//This class that will take a text file and return each line of the file as an ArrayList
public class TXT2ArrayList {


    public static List<String> convert(String filePath) {
        BufferedReader br = null;
        List textList = new ArrayList<String>();
        String inString="No Data";

        System.out.println("You asked to turn the file --" + filePath +"-- Into a list");

        //Make sure the file exists!
            try {
                br = new BufferedReader(new FileReader(filePath));
            } catch (Exception e) {
                System.err.println("Error - " + e);
            }


        //Read the text file and add each line to the list
            try {
                    while ((inString = br.readLine()) != null){
                        textList.add(inString);
                    }
            } catch (Exception e) {
                System.err.println("Error - " + e);
            }


        System.out.println("List Created. Index Zero reads:");
        System.out.println(textList.get(0));
        return textList;
    }


}
