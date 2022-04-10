package GridLayout;

import javax.swing.*;
import java.awt.*;

class Wondow extends JFrame {
    Wondow(String title){
        super(title);
        this.add(new Button("1"));
        this.add(new Button("2"));
        this.add(new Button("3"));
        this.add(new Button("4"));
        this.add(new Button("5"));
        this.add(new Button("6"));
        this.add(new Button("7"));
        this.add(new Button("8"));
        this.add(new Button("9"));
        this.setLayout(new GridLayout(3,3));


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
