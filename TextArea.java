import java.awt.*;
public class TextAreaExp{
    public static void main(String s[]){
        Frame f=new Frame();
        f.setSize(400,400);
        TextArea area=new TextArea("Welcom to javalab");
        area.setBounds(10,30,300,300);

        f.add(area);
        f.setLayout(null);
        f.setVisible(true);
        }
}
