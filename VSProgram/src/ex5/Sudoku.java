package ex5;


import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.*;

public class Sudoku {

    public static void main(String[] args) {
        
    
    SwingUtilities.invokeLater(new Runnable(){

        public void run(){
            JFrame frame = new JFrame("Sudoku");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            frame.setSize(600, 600);
            frame.setVisible(true);
            frame.getContentPane().setLayout(new BorderLayout());
            JPanel P = new JPanel();
            //GridLayout grid = new GridLayout(9, 9);
            P.setLayout(new GridLayout(3,3));
            
            frame.setContentPane(P);
            
        }

    });



    }
}
