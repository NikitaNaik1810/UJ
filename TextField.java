import java.awt.*;

import javax.swing.JFrame;
public class Textfieldexp extends Frame{
    Textfieldexp(){
        Label FirstName=new Label("First Name");
        FirstName.setBounds(20,50,80,20);

        Label LastName=new Label("last Name");
        LastName.setBounds(20,90,80,20);

        Label dob=new Label("Date of Birth");
        dob.setBounds(20,130,80,20);

        TextField FirstNametf=new TextField();
        FirstNametf.setBounds(120,50,100,20);

        TextField LastNametf=new TextField();
        LastNametf.setBounds(120,90,100,20);

        TextField dobtf=new TextField();
        dobtf.setBounds(120,130,100,20);

        Button sbtn=new Button("Submit");
        sbtn.setBounds(20,160,100,30);

        Button rbtn=new Button("Reset");
        rbtn.setBounds(130,160,100,30);

        add(FirstName);
        add(LastName);
        add(dob);
        add(FirstNametf);
        add(LastNametf);
        add(dobtf);
        add(sbtn);
        add(rbtn);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        
    }
    public static void main(String[] args){
        Textfieldexp txt=new Textfieldexp();
    }
}
