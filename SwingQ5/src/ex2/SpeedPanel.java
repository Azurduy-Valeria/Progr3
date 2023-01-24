package ex2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BoundedRangeModel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpeedPanel    extends    JPanel    implements    ChangeListener
{

    BoundedRangeModel    M;

    public    SpeedPanel(BoundedRangeModel    newM)
    {
        M    =    newM;
        setBackground(Color.WHITE);

        
    }

    public    void    paintComponent    (Graphics    G)
    {
        super.paintComponent(G);
        
        Graphics2D    G2    =    (Graphics2D)    G;
        
        // ADD CODE
        G2.drawArc(120, 130, 140, 100, 5, 150);
        G2.fillArc(FRAMEBITS, ERROR, WIDTH, HEIGHT, ALLBITS, ABORT);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // TODO Auto-generated method stub
        
    }

    // ADD CODE HERE
}

