package org.example;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

    public static List<String> sortAlphabetical(List<String> unsortedList) {
        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(unsortedList);
        sortedList.add("Pretend I actually sorted it alphabetically for now");
        return sortedList;
    }

    public static List<String> sortReverseAlphabetical(List<String> unsortedList) {
        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(unsortedList);
        sortedList.add("Pretend I actually sorted it reverse alphabetically for now");
        return sortedList;
    }


}
