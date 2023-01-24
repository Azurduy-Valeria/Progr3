package ex4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;


import java.awt.event.*;

public class Time {
    //Create a Window with a JLabel, and update it so that it reflect the current time.

    public static void main(String[] args) {
        
        final DateFormat df = new SimpleDateFormat("HH:mm:ss");

        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                JFrame F = new JFrame("Time");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(200,100);
                F.setVisible(true);

                JLabel L = new JLabel("Current Time: ");
                F.add(L);
                L.setHorizontalAlignment(SwingConstants.CENTER);
                
                javax.swing.Timer T = new Timer(500,  new ActionListener()
                {
                   public void actionPerformed(ActionEvent evt)
                   {
                    L.setText("Current time: "+df.format(new Date()));

                 } });
              T.start();



            }
        });
    }
}
