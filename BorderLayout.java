import java.awt.*;
import javax.swing.*;
public class BorderLayoutExample{
    public static void main(String s[]){
        JFrame frame=new JFrame("Border Layout Example");
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("North"),BorderLayout.NORTH);
        frame.add(new JButton("South"),BorderLayout.SOUTH);
        frame.add(new JButton("East"),BorderLayout.EAST);
        frame.add(new JButton("West"),BorderLayout.WEST);
        frame.add(new JButton("Center"),BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
