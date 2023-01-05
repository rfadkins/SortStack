package org.example;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Function_FileMenu {
    GraphicalInterface gui;
    String fileName = null;
    String fileLocation = null;

    public Function_FileMenu(GraphicalInterface gui) {
        this.gui = gui;
    }
    static List<String> fileMenuItemList = new ArrayList<>();


    public void openFile() {
        FileDialog dialog = new FileDialog(this.gui.window, "Open", 0);
        dialog.setVisible(true);
        if (dialog.getFile() != null) {
            fileMenuItemList.clear();
            this.gui.textArea.setText("");
            this.fileName = dialog.getFile();
            this.fileLocation = dialog.getDirectory();
            String fileLocation = (dialog.getDirectory() + dialog.getFile());
          fileMenuItemList.addAll(TXT2ArrayList.convert(fileLocation));
        }
        this.gui.textArea.append("=================" + "\n");
        this.gui.textArea.append("DATA TO BE SORTED" + "\n");
        this.gui.textArea.append("=================" + "\n");
        for (String sortText: fileMenuItemList) {
            this.gui.textArea.append(sortText + "\n");
        }

    }

    public void sortAlphabetical(Boolean reverse){
        List<String> sortedList = new ArrayList<>();
        sortedList.clear();
        if (reverse==false){sortedList.addAll(SortArrayList.sortAlphabetical(fileMenuItemList, false));}
        if (reverse==true){sortedList.addAll(SortArrayList.sortAlphabetical(fileMenuItemList,true));}
        fileMenuItemList.clear();;
        fileMenuItemList.addAll(sortedList);;

        this.gui.textArea.setText("");
        this.gui.textArea.append("================================" + "\n");
        this.gui.textArea.append("Your Translated data looks like:" + "\n");
        this.gui.textArea.append("================================" + "\n");
        for (String sortText: fileMenuItemList) {
            this.gui.textArea.append(sortText + "\n");
        }
    }

/*     Cut for efficiency.

        public void sortReverseAlphabetical(){

        List<String> sortedList = new ArrayList<>();
        sortedList.clear();
        sortedList.addAll(SortArrayList.sortReverseAlphabetical(fileMenuItemList));
        fileMenuItemList.clear();;
        fileMenuItemList.addAll(sortedList);


        this.gui.textArea.setText("");
        this.gui.textArea.append("================================" + "\n");
        this.gui.textArea.append("Your Translated data looks like:" + "\n");
        this.gui.textArea.append("================================" + "\n");
        for (String sortText: fileMenuItemList) {
            this.gui.textArea.append(sortText + "\n");
        }
    }*/

    public void exitFile() {
        System.exit(0);
    }
}
