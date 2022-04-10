package Buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame implements ActionListener {
    JButton button;
    JLabel label;

    Window(String title){
            super(title);
            label = new JLabel();
            label.setBounds(200,200,200,50);
            label.setText("Hello World");
            label.setVisible(false);


            button = new JButton();
            button.setBounds(200,100,300,50);
            button.addActionListener(this);
            button.setText("I'm a button");
           // button.addActionListener(e -> System.out.println("poo"));
            button.setFocusable(false);
            button.setFont(new Font("Comic Sans",Font.BOLD,25));
            button.setBorder(BorderFactory.createEtchedBorder());
            button.setVerticalAlignment(JLabel.CENTER);
            button.setHorizontalAlignment(JLabel.CENTER);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(500,500);
            this.setLayout(null);
            this.setVisible(true);
            this.add(button);
            this.add(label);
        }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            label.setVisible(true);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Window mywindow = new Window("Buttons");
    }
}
