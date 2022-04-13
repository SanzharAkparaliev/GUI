package TextFileds;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class App extends JFrame implements ActionListener{
    JButton button;
    JTextField textField;
    App(){
        button = new JButton("Button");
        button.addActionListener(this);
        button.setFocusable(false);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        this.add(button);
        this.add(textField);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == button){
            System.out.println("Welcome " + textField.getText());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        App ap  = new App();
    }
}
