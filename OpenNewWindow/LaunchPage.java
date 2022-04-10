package OpenNewWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage extends JFrame implements ActionListener {
    Button myButton;
    LaunchPage(){
        myButton = new Button("New Window");
        myButton.setBounds(100,160,200,40);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        this.add(myButton);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()==myButton){
            this.dispose();
            NewWindow mywindow = new NewWindow("new window");
        }
    }
}
