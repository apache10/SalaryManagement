import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee {

public static void main (String[] args){    
  JFrame frame = new JFrame("Enter the respective details");
  frame.setVisible(true);
  frame.setSize(500,200);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  frame.add(panel);
  JButton button = new JButton("ADD EMPLOYEE");
  panel.add(button);
  button.addActionListener (new Action1());

}
static class Action1 implements ActionListener {        
  public void actionPerformed (ActionEvent e) {     
    JFrame frame2 = new JFrame("details");
    frame2.setVisible(true);
    frame2.setSize(200,200);
    JLabel label = new JLabel("CEO");
    JPanel panel = new JPanel();
    frame2.add(panel);
    panel.add(label);       
  }
}   

}    
