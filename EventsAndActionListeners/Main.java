package EventsAndActionListeners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Window extends JFrame implements ActionListener {
    JButton button;
    JTextArea ta,ta1;
    Window(String title){
      super(title);
      button = new JButton();
      button.setText("Button");
      button.setFocusable(false);
      button.addActionListener(this);
      button.setBounds(20,20,100,40);

      ta = new JTextArea();
      ta.setText("Enter something here");
      ta.setBounds(20,65,150,30);
      this.add(ta);

      ta1 = new JTextArea();
      ta1.setText("Enter another text here");
      ta1.setBounds(20,100,150,30);
      this.add(ta1);

      this.add(button);
      this.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(500,500);
      this.setVisible(true);
  }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource()== button){
            this.ta1.setText(this.ta.getText());
        }
    }
}
public class Main {
    public static void main(String[] args) {
    Window mywindow = new Window("Events and Action Listeners");
    }
}
