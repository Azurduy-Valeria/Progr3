package ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton implements ActionListener
{
    private boolean isSelected;

    public MyButton()
    {
        // ADD CODE HERE
        setText(" ");
        isSelected = false;
        addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // ADD CODE HERE
        
        if (isSelected) {
            setText(" ");
            isSelected = false;
        } else {
            setText("*");
            isSelected = true;
        }
        
    }
}
