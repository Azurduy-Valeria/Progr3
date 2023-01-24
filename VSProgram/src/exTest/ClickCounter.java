package exTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickCounter implements ActionListener 
{
  // Initialize the counter
  private int i = 0;
  
  // label to display the counter value
  private JLabel label;

  // Increment button
  private JButton plus;
  
  public JPanel getPanel() {
    // Create the panel
    JPanel panel = new JPanel(new BorderLayout());
    
    // Add increment button to JPanel
    plus = new JButton("Click here");
    panel.add(plus, BorderLayout.SOUTH);
    plus.addActionListener(this);
    
    
    // Add the counter to JPanel
    label = new JLabel("Click count " + i);
    panel.add(label);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    return panel;
  }
  
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == plus) {
      i++;
      label.setText("Click count " + i);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("Click Counter");
    frame.setSize(new Dimension(250, 200));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // Create the panel
    ClickCounter counter = new ClickCounter();
    JPanel counterPanel = counter.getPanel(); 
      
    // Add the panel to the center of the window
    Container content = frame.getContentPane();
    content.add(counterPanel, BorderLayout.CENTER);
    
    // Show the window
    frame.setVisible(true);
  }
}