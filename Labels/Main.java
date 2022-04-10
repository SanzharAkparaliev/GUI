package Labels;

import javax.swing.*;
import java.awt.*;

class MyWindow extends JFrame {
    MyWindow(String title){
        super(title);
        ImageIcon image = new ImageIcon(new ImageIcon("/home/sanzhar/java/GUI/Labels/img.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));

        JLabel label = new JLabel();
        label.setText("Bro,do you even code?");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setIconTextGap(10);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        this.add(label);
       // this.setSize(500,500);
        this.setVisible(true);
        this.pack();
    }
}
public class Main {
    public static void main(String[] args) {
        MyWindow firstWindow = new MyWindow("Labels Example");
    }
}
