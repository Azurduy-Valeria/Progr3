package ex4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Interface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Interface Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        frame.add(textArea);

        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem clearMenuItem = new JMenuItem(new ClearAction(textArea));
        fileMenu.add(clearMenuItem);
        JMenuItem exitMenuItem = new JMenuItem(new ExitAction());
        fileMenu.add(exitMenuItem);

        JMenu colorMenu = new JMenu("Color");
        menuBar.add(colorMenu);
        JMenuItem redMenuItem = new JMenuItem(new ColorAction(textArea, Color.RED, "Red"));
        colorMenu.add(redMenuItem);
        JMenuItem greenMenuItem = new JMenuItem(new ColorAction(textArea, Color.GREEN, "Green"));
        colorMenu.add(greenMenuItem);
        JMenuItem blueMenuItem = new JMenuItem(new ColorAction(textArea, Color.BLUE, "Blue"));
        colorMenu.add(blueMenuItem);

        JToolBar toolBar = new JToolBar();
        frame.add(toolBar, java.awt.BorderLayout.SOUTH);
        toolBar.add(clearMenuItem);
        toolBar.add(exitMenuItem);
        toolBar.add(redMenuItem);
        toolBar.add(greenMenuItem);
        toolBar.add(blueMenuItem);

        frame.pack();
        frame.setVisible(true);
    }
}

