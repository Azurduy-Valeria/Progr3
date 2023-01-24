package ex1;
import javax.swing.*;

public class HelloWorldSwing {
    private static void initGUI() 
    {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,400);
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            public void run()
            {
                initGUI();
            }
        });
    }
}
