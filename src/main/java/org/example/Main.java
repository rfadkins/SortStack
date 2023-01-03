package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // a global scanner for your global scanning needs. (Watch me only need it once, now)
    static Scanner fileScanner = new Scanner(System.in);

    public static void main(String[] args) {


        //Get a filename and pull the contents of that file
        String fileName = fileEntry();
        List<String> itemList = new ArrayList<>();
        itemList.addAll(TXT2ArrayList.convert(fileName));

        //Test Outputs
        listMyList(itemList);

        System.out.println("Check back later.");
        System.out.println("We're kind of basic at the moment ;)");
    }

    public static String fileEntry() {
        System.out.println("==================================");
        System.out.println("Please Enter the name of the file:");
        System.out.println("==================================");
        String fileName = fileScanner.nextLine();
        return fileName;
    }

    public static void listMyList(List<String> myList) {
        System.out.println("=============================================");
        System.out.println("Here's the List I've generated, just for you.");
        System.out.println("=============================================");
        for (String listData : myList) {
            System.out.println(listData);
        }
        System.out.println("=============================================");
    }
}