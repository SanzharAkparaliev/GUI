package RadioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton humburgerButton;
    JRadioButton hotdogButton;
    JButton button;
    Window(){
        pizzaButton = new JRadioButton("Pizza");
        pizzaButton.setFocusable(false);
        hotdogButton = new JRadioButton("hotdog");
        hotdogButton.setFocusable(false);
        humburgerButton = new JRadioButton("humburger");
        humburgerButton.setFocusable(false);

        button = new JButton("Button");
        button.setFocusable(false);
        button.setPreferredSize(new Dimension(100,40));
        button.addActionListener(this);
        this.add(button);
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(humburgerButton);
        group.add(hotdogButton);
        this.add(pizzaButton);
        this.add(hotdogButton);
        this.add(humburgerButton);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(humburgerButton.isSelected()){
            JOptionPane.showMessageDialog(this,"humburger");
        }
        if(hotdogButton.isSelected()){
            JOptionPane.showMessageDialog(this,"hotdog");
        }
        if(pizzaButton.isSelected()){
            JOptionPane.showMessageDialog(this,"pizza");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Window window = new Window();
    }
}
