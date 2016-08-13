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
//CEO
static class ActionCEO implements ActionListener {  
	JFrame tempFrame;
  JFrame frame;
  JPasswordField pass;
  JTextField ceoId;
	public ActionCEO(JFrame logInFrame){
		 tempFrame=logInFrame;
	}

  public void actionPerformed (ActionEvent e) { 
    tempFrame.setVisible(false);   
    tempFrame.dispose(); 
    frame = new JFrame("Login as CEO");
    frame.setVisible(true);
    frame.setSize(400,300);
    loginCeo();   
  }
  public void loginCeo(){
    JLabel label = new JLabel("please enter employee ID and PASSWORD");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);

  JTextField ceoId = new JTextField("employeeID");
  JPasswordField pass = new JPasswordField("Password");  
  JButton button_Ceo_log = new JButton("login");
  panel.add(ceoId);
  panel.add(pass);
  panel.add(button_Ceo_log);
  button_Ceo_log.addActionListener (new ActionCeolog(frame));
  ceoId.addActionListener();
  pass.addActionListener();
  }
}
//log in button
static class ActionCeolog implements ActionListener {  
  JFrame tempFrame;
  JFrame frame;
  public ActionCeolog(JFrame logFrame){
     tempFrame= logFrame;
  }

  public void actionPerformed (ActionEvent e) { 
    tempFrame.setVisible(false);   
    tempFrame.dispose(); 
    frame = new JFrame("CEO");
    frame.setVisible(true);
    frame.setSize(400,300);
  }
}  
    
//manager
static class ActionMAG implements ActionListener {

	JFrame tempFrame;
  JFrame frame;
  JPasswordField pass;
  JTextField magId;
	public ActionMAG(JFrame logInFrame){
		 tempFrame=logInFrame;
	}        

  public void actionPerformed (ActionEvent e) {   
  	tempFrame.setVisible(false); 
  	tempFrame.dispose(); 
    frame = new JFrame("Login as MANAGER");
    frame.setVisible(true);
    frame.setSize(400,300);
    loginMag();
  }
  public void loginMag(){
    JLabel label = new JLabel("please enter employee ID and PASSWORD");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);

    JTextField magId = new JTextField("employeeID");
    JPasswordField pass = new JPasswordField("Password");
    JButton button_Mag_log = new JButton("login");
    panel.add(magId);
    panel.add(pass);
    panel.add(button_Mag_log);
    button_Mag_log.addActionListener (new ActionMaglog(frame));
    magId.addActionListener();
    pass.addActionListener();

  }
}
//log in button
static class ActionMaglog implements ActionListener {  
  JFrame tempFrame;
  JFrame frame;
  public ActionMaglog(JFrame logFrame){
     tempFrame= logFrame;
  }

  public void actionPerformed (ActionEvent e) { 
    tempFrame.setVisible(false);   
    tempFrame.dispose(); 
    frame = new JFrame("MANAGER");
    frame.setVisible(true);
    frame.setSize(400,300);
  }
}

//EMPLOYEE
static class ActionEMP implements ActionListener {  
	JFrame tempFrame;
  JFrame frame;
  JPasswordField pass;
  JTextField empId;
	public ActionEMP(JFrame logInFrame){
		 tempFrame=logInFrame;
	}      

  public void actionPerformed (ActionEvent e) {  
  	tempFrame.setVisible(false);   
  	tempFrame.dispose();
    frame = new JFrame("Login as EMPLOYEE");
    frame.setVisible(true);
    frame.setSize(400,300);
    loginEmp();
  }
  public void loginEmp(){
    JLabel label = new JLabel("please enter employee ID and PASSWORD");
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.add(label);

  
    JButton button_Emp_log = new JButton("login");
    JTextField empId = new JTextField("employeeID");
    JPasswordField pass = new JPasswordField("Password");
    
    panel.add(empId);
    panel.add(pass);
    panel.add(button_Emp_log);
    button_Emp_log.addActionListener (new ActionEmplog(frame));
    empId.addActionListener();
    pass.addActionListener();
 }
}

//log in button
static class ActionEmplog implements ActionListener {  
  JFrame tempFrame;
  JFrame frame;
  public ActionEmplog(JFrame logFrame){
     tempFrame= logFrame;
  }

  public void actionPerformed (ActionEvent e) { 
    tempFrame.setVisible(false);   
    tempFrame.dispose(); 
    frame = new JFrame("EMPLOYEE");
    frame.setVisible(true);
    frame.setSize(400,300);
  }
 }     
}