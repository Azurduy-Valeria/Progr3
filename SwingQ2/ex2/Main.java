package ex2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

// import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;



public class Main {
    
    public static void main(String[] args)
    {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("Color Sliders Exercise");                         
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // ADD TOP PANEL

                JPanel    P1    =    new JPanel();
                
                
                JPanel    P2    =    new JPanel();
                P2.setLayout(new GridLayout(3,1));
                
                JSlider s1    = new JSlider(0,255,0);
                JSlider s2    = new JSlider(0,255,0);
                JSlider s3    = new JSlider(0,255,0);
             
                // add code for look of sliders
                s1.setOrientation(JSlider.HORIZONTAL);
                s2.setOrientation(JSlider.HORIZONTAL);
                s3.setOrientation(JSlider.HORIZONTAL);

                s1.setMaximum(255); 
                s1.setMinimum(0);   //sets minimun and maximum range of the Slider
                s2.setMaximum(255);
                s2.setMinimum(0);
                s3.setMaximum(255);
                s3.setMinimum(0);


                
                s1.setPaintTicks(true);  //It shows the ticks 
                s1.setPaintLabels(true);  //It shows labels of the ticks (0, 50, 100...)
                // s1.setMinorTickSpacing(5);
                s1.setMajorTickSpacing(50); //sets range between major ticks 

                s2.setPaintTicks(true);
                s2.setPaintLabels(true);
                s2.setMajorTickSpacing(50);


                s3.setPaintTicks(true);
                s3.setPaintLabels(true);
                s3.setMajorTickSpacing(50);

                // add titles for slider
                TitledBorder n1 = new TitledBorder("Red");
                s1.setBorder(n1); //sets the title of the Slider 
                TitledBorder n2 = new TitledBorder("Green");
                s2.setBorder(n2);
                TitledBorder n3 = new TitledBorder("Blue");
                s3.setBorder(n3);

                P2.add(s1);
                P2.add(s2);
                P2.add(s3);
                
                ChangeListener    L    =    new    ChangeListener() {
                    public void stateChanged(ChangeEvent e) {
                        P1.setBackground(new Color(s1.getValue(),s2.getValue(), s3.getValue()));   
                        
                    }
                    
                };
                
                s1.addChangeListener(L);
                s2.addChangeListener(L);
                s3.addChangeListener(L);
                
                F.getContentPane().add(P1);
                F.getContentPane().add(P2,BorderLayout.SOUTH);
                
                F.setSize(400,400);
                F.setVisible(true); 
            }
        });
    }

}
