package Frames;

import javax.swing.*;
import java.awt.*;

class MyWindow extends JFrame{
    MyWindow(String title){
        super(title);
        this.setSize(420,420);
//        this.setLayout(null);
        this.setLayout(new FlowLayout());
        this.setResizable(false); //mashtab final
        this.getContentPane().setBackground(new Color(0x123456));

        JButton b1 = new JButton("One");
        JButton b2 = new JButton("Two");
        JButton b3 = new JButton("Three");
//        b1.setBounds(20,20,100,30);
//        b2.setBounds(20,60,100,30);
//        b3.setBounds(20,100,100,30);

        this.add(b1);
        this.add(b2);
        this.add(b3);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class GUI_01 {
    public static void main(String[] args) {
        MyWindow firstWindow = new MyWindow("My First Window");
    }
}
