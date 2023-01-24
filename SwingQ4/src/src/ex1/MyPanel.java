package ex1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class MyPanel extends JPanel {
    public    MyPanel()
    {
        setBackground(Color.WHITE);
    }

    public    void    paintComponent    (Graphics    G)
    {
        // ADD CODE
        G.drawRect(100, 100, 100, 100);
        G.drawRect(200, 200, 100, 100);
        G.drawRect(100, 200, 100, 100);
        G.drawRect(200, 100, 100, 100);
        G.setColor(Color.RED);
        G.fillRect(100, 100, 100, 100);
        G.setColor(Color.BLUE);
        G.fillRect(200, 100, 100, 100);
        G.setColor(Color.GREEN);
        G.fillRect(100, 200, 100, 100);

        //For upper-right
        // int width = getWidth();
        // int height = getHeight();
        // int x1 = 0, y1 = 0,
        //     x2 = width, y2 = 0;
        // while (x1 < width) {
        //     G.drawLine(x1, y1, x2, y2);
        //     y2+=15;                 
        //     x1+=15;                 
        // }
       // G.drawLine(0, 0, 400, 0);

        int width = getWidth();
        int height = getHeight();
        int x1 = 0, y1 = 0,
            x2 = width, y2 = 0;
        while (y1 < width) {
            G.drawLine(x1, y1, x2, y2);
            G.setColor(Color.GRAY);
            
            y1+=15;                 
            x2-=15;                 
        }

        // while (x1 < width) {
        //     G.drawLine(x1, y1, x2, y2);
        //     G.setColor(Color.GRAY);
            
        //     y1+=15;                 
        //     x2-=15;                 
        // }
        
        
        

        System.out.println("paint(.)");
    }
}
