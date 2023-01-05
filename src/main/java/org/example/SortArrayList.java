package org.example;

import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

    public static List<String> sortAlphabetical(List<String> unsortedList, Boolean reverse) {
        List<String> sortedList = new ArrayList<>();
        sortedList.addAll(unsortedList);
        if (reverse==false){
            sortedList.add("Pretend I actually sorted it alphabetically for now");
        }
        if (reverse==true){
            sortedList.add("Pretend I actually sorted it reverse alphabetically for now");
        }
        return sortedList;
    }

}
