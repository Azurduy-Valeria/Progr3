package ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    JTextField euros;
    JTextField bitcoins;

    public Controller   (JTextField T1,JTextField T2)
    {
        euros      =   T1;
        bitcoins   =   T2;

        // ADD CODE HERE
        euros.addActionListener(this);
        bitcoins.addActionListener(this);
    }

    public void actionPerformed  (ActionEvent e)
    {

        // ADD CODE HERE

        // (use e.getSource() to determine the source of the event) 
        if (e.getSource() == euros){
        double d1 = Double.parseDouble(euros.getText());
        double d3 = d1* 0.00005;
        String str1 = String.valueOf(d3);
        bitcoins.setText(str1);
        }

        if (e.getSource() == bitcoins){
            double d2 = Double.parseDouble(bitcoins.getText());
            double d4 = d2/ 0.00005;
            String str2 = String.valueOf(d4);
            euros.setText(str2);
            }
    }
}
