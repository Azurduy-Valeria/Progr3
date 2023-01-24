package ex1;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Main {
    public static void main(String[] args)
    {

        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame("Converter");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                F.getContentPane().setLayout(new GridLayout(2,1));

                JTextField  t1   =   new JTextField(20);
                JTextField  t2   =   new JTextField(20);
                
                // SET TEXT ALIGNMENT AND BORDER FOR t1
                t1.setBorder(new TitledBorder("euros"));
                t1.setHorizontalAlignment(SwingConstants.RIGHT);

                // SET TEXT ALIGNMENT AND BORDER FOR t2
                t2.setBorder(new TitledBorder("bitcoins"));
                t2.setHorizontalAlignment(SwingConstants.RIGHT);


                F.getContentPane().add(t1);
                F.getContentPane().add(t2);
                new Controller(t1,t2);
                
                F.pack(); 
                F.setVisible(true); 
            }
        });
    }
}
