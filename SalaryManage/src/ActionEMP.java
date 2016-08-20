/**
 * Created by gaurav on 20-08-2016.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 19/08/16.
 */
//EMPLOYEE
class ActionEMP implements ActionListener {
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
        button_Emp_log.addActionListener (new ActionEmplog(frame,empId,pass));
    }
}