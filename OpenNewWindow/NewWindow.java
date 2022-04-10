package OpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow extends JFrame {
    NewWindow(String title){
        super(title);
        Label label = new Label("Hello World");
        label.setFont(new Font(null,Font.PLAIN,25));
        label.setBounds(0,0,500,50);

        this.add(label);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
