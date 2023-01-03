package org.example;

import java.util.ArrayList;
import java.util.List;

//This will be a class that will take a text file and return each line as an ArrayList
public class TXT2ArrayList {



    public static List<String> TXT2ArrayList(String filePath) {
        List textList = new ArrayList<String>();
        System.out.println("You asked to turn the file --" + filePath +"-- Into a list");

        //This is where the magic happens, but for now let's just return sample data.
        textList.add(filePath);

        return textList;
    }

}
