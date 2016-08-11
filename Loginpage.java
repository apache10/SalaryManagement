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
static class ActionCEO implements ActionListener {  
	JFrame tempFrame;
	public ActionCEO(JFrame logInFrame){
		 tempFrame=logInFrame;
	}

  public void actionPerformed (ActionEvent e) { 
    tempFrame.setVisible(false);   
    tempFrame.dispose(); 
    JFrame frame = new JFrame("LOGIN as CEO");
    frame.setVisible(true);
    frame.setSize(400,300);
    JLabel label = new JLabel("CEO");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);   
  }
}   
static class ActionMAG implements ActionListener {

	JFrame tempFrame;
	public ActionMAG(JFrame logInFrame){
		 tempFrame=logInFrame;
	}        

  public void actionPerformed (ActionEvent e) {   
  	tempFrame.setVisible(false); 
  	tempFrame.dispose(); 
    JFrame frame = new JFrame("LOGIN as MANAGER");
    frame.setVisible(true);
    frame.setSize(400,300);

    JLabel label = new JLabel("MANAGER");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);
  }
}
static class ActionEMP implements ActionListener {  
	JFrame tempFrame;
	public ActionEMP(JFrame logInFrame){
		 tempFrame=logInFrame;
	}      

  public void actionPerformed (ActionEvent e) {  
  	tempFrame.setVisible(false);   
  	tempFrame.dispose();
    JFrame frame = new JFrame("LOGIN as EMPLOYEE");
    frame.setVisible(true);
    frame.setSize(400,300);

    JLabel label = new JLabel("EMPLOYEE");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);
  }
 }    
}