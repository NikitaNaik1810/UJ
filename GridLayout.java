import java.awt.*;
import javax.swing.*;
public class GridLayoutExample {
    public static void main(String s[]){
        JFrame frame=new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new GridLayout(3,2));
        for(int i=1;i<=9;i++){
            frame.add(new JButton("Button"+i));
        }
        frame.pack();
        frame.setVisible(true);
    }
}
