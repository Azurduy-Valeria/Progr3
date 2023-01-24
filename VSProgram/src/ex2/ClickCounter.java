package ex2;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ClickCounter implements ActionListener {
    
    private int clickCount;

    public static void myGUI() 
    {
    JFrame frame = new JFrame("Click Counter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    JLabel label = new JLabel("Click Count:");
    frame.getContentPane().add(label);
    

    frame.pack();
    frame.setVisible(true);
    frame.setSize(400,200);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    
    JButton button = new JButton("Click HERE");
    frame.getContentPane().add(button);
    frame.add(button, BorderLayout.SOUTH);
    
    
    }
    
    

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                myGUI();
            }
        });
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
