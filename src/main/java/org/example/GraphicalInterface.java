package org.example;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GraphicalInterface implements ActionListener {
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu actionMenu;
    JMenu helpMenu;
    JMenuItem openItem;
    JMenuItem exitItem;
    JMenuItem sortAlphabeticalItem;
    JMenuItem sortReverseAlphabeticalItem;
    JMenuItem aboutItem;
    Function_FileMenu file = new Function_FileMenu(this);

    public static void main() {
        new GraphicalInterface();
    }

    public GraphicalInterface() {
        this.newWindow();
        this.newTextArea();
        this.newMenuBar();
        this.window.setVisible(true);
    }

    public void newWindow() {
        this.window = new JFrame("SortStack");
        this.window.setSize(1024, 768);
        this.window.setDefaultCloseOperation(3);
    }

    public void newTextArea() {
        this.textArea = new JTextArea();
        this.scrollPane = new JScrollPane(this.textArea, 20, 30);
        this.scrollPane.setBorder(BorderFactory.createEmptyBorder());
        this.window.add(this.scrollPane);
        this.textArea.setEditable(false);
    }

    public void newMenuBar() {
        this.menuBar = new JMenuBar();
        this.window.setJMenuBar(this.menuBar);
        this.fileMenu = new JMenu("File");
        this.actionMenu= new JMenu("Action");
        this.helpMenu = new JMenu("Help");
        this.menuBar.add(this.fileMenu);
        this.menuBar.add(this.actionMenu);
        this.menuBar.add(this.helpMenu);
        this.openItem = new JMenuItem("Open");
        this.exitItem = new JMenuItem("Exit");
        this.sortAlphabeticalItem = new JMenuItem("Sort Alphabetical");
        this.sortReverseAlphabeticalItem = new JMenuItem("Sort Reverse Alphabetical");
        this.aboutItem = new JMenuItem("About");
        this.openItem.addActionListener(this);
        this.openItem.setActionCommand("Open");
        this.exitItem.addActionListener(this);
        this.exitItem.setActionCommand("Exit");
        this.sortAlphabeticalItem.addActionListener(this);
        this.sortAlphabeticalItem.setActionCommand("Sort Alphabetical");
        this.sortReverseAlphabeticalItem.addActionListener(this);
        this.sortReverseAlphabeticalItem.setActionCommand("Sort Reverse Alphabetical");
        this.fileMenu.add(this.openItem);
        this.fileMenu.add(this.exitItem);
        this.actionMenu.add(this.sortAlphabeticalItem);
        this.actionMenu.add(this.sortReverseAlphabeticalItem);
        this.helpMenu.add(this.aboutItem);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Open":
                this.file.openFile();
                break;
            case "Sort Alphabetical":
                this.file.sortAlphabetical(false);
                break;
            case "Sort Reverse Alphabetical":
                this.file.sortAlphabetical(true);
                break;
            case "Exit":
                this.file.exitFile();
        }

    }
}
