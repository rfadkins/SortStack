package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // a global scanner for your global scanning needs. (Watch me only need it once, now)
    static Scanner inputScanner = new Scanner(System.in);
    static List<String> itemList = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("--* Welcome to the Sort Stack! *--");
        GraphicalInterface.main();

        //Old PreGUI Code
        //Step 1: Get a filename and call TXT2Arraylist to pull the contents of that file
        //String fileName = fileEntry();
        //itemList.addAll(TXT2ArrayList.convert(fileName));

        //Step 2: Present the User with a menu on how to proceed
        //mainMenu();

        //Test Outputs
        //System.out.println("OK, After I did that your data looks like:");
        //listMyList(itemList);


    }

    //The menu.
    public static void mainMenu(){
        Integer menuSelect=77;

        while (menuSelect>=3 ) { //Hacky, I know. It's temporary.
            System.out.println("=========");
            System.out.println("Main Menu");
            System.out.println("=========");
            System.out.println("Please Select an option");
            System.out.println("1: Sort Data Alphabetically");
            System.out.println("2: Sort Data Reverse Alphabetically");
            System.out.println("0: Quit");
            menuSelect = inputScanner.nextInt();
                switch (menuSelect){
                    case 0: System.out.println("Quitting program");
                        break;
                    case 1: SortArrayList.sortAlphabetical(itemList);
                        break;
                    case 2: SortArrayList.sortReverseAlphabetical(itemList);
                        break;
                }
        }

    }

    //prompt user for a filename
    public static String fileEntry() {
        System.out.println("==================================");
        System.out.println("Please Enter the name of the file:");
        System.out.println("==================================");
        String fileName = inputScanner.nextLine();
        return fileName;
    }

    //println the contents of a list
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