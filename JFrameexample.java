import javax.swing.*;
public class JFrameExample{
    public static void main(String s[]){
        JFrame frame=new JFrame("Frame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
        frame.setLayout(null);

        JMenuBar menuBar=new JMenuBar();
        JMenu fileMenu=new JMenu("File");
        JMenuItem openItem=new JMenuItem("Open");
        JMenuItem exitItem=new JMenuItem("Exit");

        JButton button=new JButton("Click Me");
        button.setBounds(350,30,100,20);
        
        frame.add(button);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        exitItem.addActionListener(e->System.exit(0));
        frame.setVisible(true);
        
    }
}
