package ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumPad  {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame  F = new JFrame("NumPad");
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                F.setSize(400, 300);
                F.setVisible(true);
                F.getContentPane().setLayout(new BorderLayout());

                JTextField  T   =   new JTextField();
                F.getContentPane().add(T,BorderLayout.NORTH);

                JPanel  P = new JPanel();
                F.getContentPane().add(P,BorderLayout.CENTER);

                P.setBackground(Color.GREEN);

                // STEP 1: create 12 buttons
                JButton button1 = new JButton("1");
                JButton button2 = new JButton("2");
                JButton button3 = new JButton("3");
                JButton button4 = new JButton("4");
                JButton button5 = new JButton("5");
                JButton button6 = new JButton("6");
                JButton button7 = new JButton("7");
                JButton button8 = new JButton("8");
                JButton button9 = new JButton("9");
                JButton button10 = new JButton(".");
                JButton button11 = new JButton("DEL");
                JButton button12 = new JButton("0");
                
                // STEP 2: set layout of panel
                P.setLayout(new GridLayout(4,3) );

                // STEP 3: add buttons to panel
                P.add(button1);
                P.add(button2 );
                P.add(button3 );
                P.add(button4 );
                P.add(button5 );
                P.add(button6 );
                P.add(button7 );
                P.add(button8);
                P.add(button9 );
                P.add(button10 );
                P.add(button11 );
                P.add(button12 );

                // STEP 4: add listeners
                button1.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e)
                    {
                        T.replaceSelection(button1.getText());
                        
           }});

           button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                T.replaceSelection(button2.getText());
               
            }});

            button3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                   T.replaceSelection(button3.getText());
             }});

             button4.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button4.getText());
             }});

             button5.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button5.getText());
            }});

            button6.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button6.getText());
            }});

            button7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button7.getText());
            }});

            button8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button8.getText());
            }});

            button9.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button9.getText());
            }});

            button10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    T.replaceSelection(button10.getText());
            }});

            button11.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                   T.setText("");
            }});

            button12.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e)
                {
                    
             }});
      



            } });
            
    }

}
