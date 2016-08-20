/**
 * Created by gaurav on 20-08-2016.
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 19/08/16.
 */
//manager
class ActionMAG implements ActionListener {

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
        button_Mag_log.addActionListener (new ActionMaglog(frame,magId,pass));

    }
}