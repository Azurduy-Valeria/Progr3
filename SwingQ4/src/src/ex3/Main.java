package ex3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.Timer;
import java.util.TimerTask;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel {
    private int hour;
    private int minute;
    private int second;

    // Constructor to initialize the current time
// Constructor to initialize the current time
    public Main() {
    // Get the current time
    Calendar calendar = new GregorianCalendar();
    this.hour = calendar.get(Calendar.HOUR);
    this.minute = calendar.get(Calendar.MINUTE);
    this.second = calendar.get(Calendar.SECOND);
    
    // Start the clock
    startClock();
}

public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // Draw the clock face
    g.setColor(Color.black);
    g.drawOval(20, 20, 200, 200);
        // Draw the clock hands
    g.drawLine(120, 120, (int)(120 + 70 * Math.cos(hour * (2 * Math.PI / 12) - (Math.PI / 2))), 
        (int)(120 - 70 * Math.sin(hour * (2 * Math.PI / 12) - (Math.PI / 2))));
    g.drawLine(120, 120, (int)(120 + 90 * Math.cos(minute * (2 * Math.PI / 60) - (Math.PI / 2))), 
        (int)(120 - 90 * Math.sin(minute * (2 * Math.PI / 60) - (Math.PI / 2))));
    g.drawLine(120, 120, (int)(120 + 100 * Math.cos(second * (2 * Math.PI / 60) - (Math.PI / 2))), 
        (int)(120 - 100 * Math.sin(second * (2 * Math.PI / 60) - (Math.PI / 2))));
}

public void startClock() {
Timer timer = new Timer(1000, new ActionListener() {
 public void actionPerformed(ActionEvent e) {
     // Update the current time
     Calendar calendar = new GregorianCalendar();
     hour = calendar.get(Calendar.HOUR);
     minute = calendar.get(Calendar.MINUTE);
     second = calendar.get(Calendar.SECOND);
     
     // Repaint the clock
     repaint();
 }
});
timer.start();
}

public static void main(String[] args) {
// Create a new frame
JFrame frame = new JFrame();
frame.setTitle("Clock");
frame.setSize(250, 250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Add the clock to the frame
Main clock = new Main();
frame.add(clock);

// Show the frame
frame.setVisible(true);
}
}



