package ex2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;


public class DotsPanel extends JPanel implements MouseListener{
    public    ArrayList<Point>    L    =    new    ArrayList<Point>();

    public    DotsPanel()
    {
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    // ADD CODE TO DRAW THE DOTS
    @Override
    protected void paintComponent(Graphics g) { //draws array of dots
        super.paintComponent(g);
        for (Point point : L) {
            g.fillOval(point.x, point.y, 15, 15);
            g.setColor(Color.DARK_GRAY);
        }
    }
    public void clear() { //clears the dots (method used in Button clear listener)
        L.clear();
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mouseClicked(MouseEvent e) {
        L.add(e.getPoint()); 
        repaint();
    }
    

    // ADD CLEAR METHOD
    
    

    // ADD MOUSE LISTENERS
   
}
