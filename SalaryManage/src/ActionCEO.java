/**
 * Created by gaurav on 20-08-2016.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//CEO
class ActionCEO implements ActionListener {
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
        button_Ceo_log.addActionListener (new ActionCeolog(frame,pass,ceoId));


    }
}
