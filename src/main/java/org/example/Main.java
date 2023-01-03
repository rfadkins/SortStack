package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Check back later.");
        System.out.println("We're kind of basic at the moment.");
        String fileName = "test.txt";
        List<String> itemList = new ArrayList<>();
        itemList.addAll(TXT2ArrayList.convert(fileName));


        //Test Outputs
        listMyList(itemList);
    }

    public static void listMyList(List<String> myList) {
        System.out.println("=============================================");
        System.out.println("Here's the List I've generated, just for you.");
        System.out.println("=============================================");
        for (String listData : myList) {
            System.out.println(listData);
        }
    }
}