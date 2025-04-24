import java.awt.*;
import javax.swing.*;
public class JFrameEdureka{
    public static void main(String s[]){
        JFrame frame=new JFrame("Frame Example");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label=new JLabel("JFrame by Example");
        JButton button=new JButton();
        button.setText("Button");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
