package ex1;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ColorList
{

public static void main(String[] args)
{
   
    javax.swing.SwingUtilities.invokeLater(new Runnable()
    {
        public void run()
        {
            final HashMap<String, Color>     M    =    new    HashMap<String, Color>();
            M.put("Black"    ,    new    Color(0,0,0));
            M.put("White"    ,    new    Color(255,255,255));
            M.put("Red"        ,    new    Color(255,0,0));
            M.put("Lime"    ,    new    Color(0,255,0));
            M.put("Blue"    ,    new    Color(0,0,255));
            M.put("Yellow"    ,    new    Color(255,255,0));
            M.put("Cyan"    ,    new    Color(0,255,255));
            M.put("Magenta"    ,    new    Color(255,0,255));
            M.put("Silver"    ,    new    Color(192,192,192));
            M.put("Gray"    ,    new    Color(128,128,128));
            M.put("Maroon"    ,    new    Color(128,0,0));
            M.put("Olive"    ,    new    Color(128,128,0));
            M.put("Green"    ,    new    Color(0,128,0));
            M.put("Purple"    ,    new    Color(128,0,128));
            M.put("Teal"    ,    new    Color(0,128,128));
            M.put("Navy"    ,    new    Color(0,0,128));
            
            JFrame    F    =    new    JFrame();
            F.setTitle("Swing Color List");                         
            F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            JPanel    P    =    new    JPanel(new GridLayout(1,2));

            final DefaultListModel<String>    M1    =    new    DefaultListModel<String>();
            
            // ADD THE COLOR NAMES TO THE MODEL
            //JList list1 = new JList<String>();
            M1.addElement("Red"); //0
            M1.addElement("Black"); //1
            M1.addElement("Yellow"); //2 
            M1.addElement("Olive"); //3
            M1.addElement("Teal"); //4 
            M1.addElement("Lime"); //5
            M1.addElement("Gray"); //6
            M1.addElement("White"); //7
            M1.addElement("Blue"); //8
            M1.addElement("Green"); //9
            M1.addElement("Magenta"); //10
            M1.addElement("Navy"); //11
            M1.addElement("Maroon");
            M1.addElement("Purple");
            M1.addElement("Cyan");
            M1.addElement("Silver");
            

            final JList<String>    L1    =    new    JList<String>(M1);
            
            // SET SINGLE SELECTION MODE
            L1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

            final JPanel        P2    =    new    JPanel();
            
           // ADD LISTENER THAT WILL CHANGE THE BACKGROUND COLOR
           L1.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
              int index = L1.getSelectedIndex();
              if (index==0){
                P2.setBackground(Color.RED);
              }else if(index == 1){
                P2.setBackground(Color.BLACK);
              }else if(index == 2){
                P2.setBackground(Color.YELLOW);
              }else if(index == 3){
                P2.setBackground(new Color(128, 128, 0));
              }else if(index == 4){
                P2.setBackground(Color.BLACK);
              }else if(index == 5){
                P2.setBackground(Color.BLACK);
              }else if(index == 6){
                P2.setBackground(Color.BLACK);
              }else if(index == 7){
                P2.setBackground(Color.BLACK);
              }else if(index == 8){
                P2.setBackground(Color.BLACK);
              }else if(index == 9){
                P2.setBackground(Color.BLACK);
              }else if(index == 10){
                P2.setBackground(Color.BLACK);
              }else if(index == 11){
                P2.setBackground(Color.BLACK);
              }else if(index == 12){
                P2.setBackground(Color.BLACK);
              }else if(index == 13){
                P2.setBackground(Color.BLACK);
              }else if(index == 14){
                P2.setBackground(Color.BLACK);
              }else if(index == 15){
                P2.setBackground(Color.BLACK);
              }

            }
          });

            P.add(L1);
            P.add(P2);
            
            F.getContentPane().add(P);
            
            F.setSize(400,400); 
            F.setVisible(true); 
        }
    });
}
}

