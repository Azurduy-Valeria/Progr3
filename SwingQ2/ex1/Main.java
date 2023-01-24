package ex1;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Main
{
    
    static    JLabel    B    =    new    JLabel();
    
    public static void main(String[] args)
    {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                JFrame    F    =    new    JFrame();
                F.setTitle("JMenu Exercise");                         
                F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                F.getContentPane().add(B);
                B.setOpaque(true);
                B.setHorizontalAlignment(JLabel.CENTER);
               
                
                F.setJMenuBar(createJMenuBar());

                F.setSize(400,400);                   // set Window size
                F.setVisible(true); 
            }
        });
    }

    static    JMenuBar    createJMenuBar()
    {
        JMenuBar    M    =    new    JMenuBar();
        // ADD CODE HERE
        JMenu menu1 = new JMenu("Color");
        JMenu menu2 = new JMenu("Name");
        
        
        M.add(menu1);
        M.add(menu2);

        JMenuItem submenuRed = new JMenuItem("Red");
        JMenuItem submenuGreen = new JMenuItem("Green");
        JMenuItem submenuBlue = new JMenuItem("Blue");
        menu1.add(submenuRed);
        menu1.add(submenuGreen);
        menu1.add(submenuBlue);

        JMenuItem submenuAlice = new JMenuItem("Alice");
        JMenuItem submenuBob = new JMenuItem("Bob");
        JMenuItem submenuCarol = new JMenuItem("Carol");
        menu2.add(submenuAlice);
        menu2.add(submenuBob);
        menu2.add(submenuCarol);


        submenuRed.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setBackground(Color.RED);
               
            }});

        submenuGreen.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setBackground(Color.GREEN);
               
            }});    

        submenuBlue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setBackground(Color.BLUE);
               
            }});

            
        
        submenuAlice.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setText("Hello Alice");
               
            }});

        submenuBob.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setText("Hello Bob");
               
            }});


        submenuCarol.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                B.setText("Hello Carol");
               
            }});
        

        return M;
    }
       
}
