package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

    public static List<String> sortAlphabetical(List<String> sortList, Boolean reverse) {

        if (reverse==false){
            Collections.sort(sortList);
        }
        if (reverse==true){
            Collections.sort(sortList);
            Collections.reverse(sortList);
            sortList.add("Pretend I actually sorted it reverse alphabetically for now");
        }
        return sortList;
    }

}
