package FlowLayout;

import javax.swing.*;
import java.awt.*;

class Wondow extends JFrame{
    Wondow(String title){
        super(title);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,150));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
public class Main {
    public static void main(String[] args) {
        Wondow mywindow = new Wondow("flow layout");
    }
}
