import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Loginpage {

public static void main (String[] args){    
  JFrame logInFrame = new JFrame("login page");
  logInFrame.setVisible(true);
  logInFrame.setSize(500,200);
  logInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel panel = new JPanel();
  logInFrame.add(panel);

  JButton button_CEO = new JButton("log in as CEO");
  panel.add(button_CEO);
  button_CEO.addActionListener (new ActionCEO(logInFrame));

  
  JButton button_MAG = new JButton("log in as MANAGER");
  panel.add(button_MAG);
  button_MAG.addActionListener (new ActionMAG(logInFrame)); 

  
  JButton button_EMP = new JButton("log in as EMPLOYEE");
  panel.add(button_EMP);
  button_EMP.addActionListener (new ActionEMP(logInFrame)); 
}

}