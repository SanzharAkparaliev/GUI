package panels;

import javax.swing.*;
import java.awt.*;

class Window extends JFrame{
    Window(String title){
        super(title);
        JLabel soz = new JLabel("Hi");

        soz.setForeground(new Color(0x00FF00));
        soz.setFont(new Font("MV Boli", Font.PLAIN, 20));


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        this.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(255,0,250,250);
        this.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,255,500,250);
        this.add(greenPanel);
        redPanel.add(soz);

        this.setLayout(null);
        this.setSize(750,750);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class Main {
    public static void main(String[] args) {
        Window myWindow = new Window("Panels");
    }
}
