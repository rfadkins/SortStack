package org.example;

import java.util.ArrayList;
import java.util.List;

//This will be a class that will take a text file and return each line as an ArrayList
public class TXT2ArrayList {


    public static List<String> convert(String filePath) {
        List textList = new ArrayList<String>();
        System.out.println("You asked to turn the file --" + filePath +"-- Into a list");
        System.out.println("But I can only provide dummy datas at the moment!");

        //This is where the magic happens, but for now let's just generate sample data.
        textList.add(filePath);
        textList.add("Subsequent Data - " +  filePath);
        textList.add("Subsequent Data 3 - " +  filePath);



        return textList;
    }


}
