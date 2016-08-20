/**
 * Created by gaurav on 20-08-2016.
 */import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 20/08/16.
 */
//log in button
class ActionEmplog implements ActionListener {
    JFrame tempFrame;
    JFrame frame;
    JTextField EmpId;
    JPasswordField pass;
    public ActionEmplog(JFrame logFrame, JTextField txt, JPasswordField pas){

        tempFrame= logFrame;
        EmpId = txt;
        pass = pas;
    }

    public void actionPerformed (ActionEvent e) {
        if((EmpId.getText().equals(Constant.GAURAV))) {
            tempFrame.setVisible(false);
            tempFrame.dispose();
            frame = new JFrame("EMPLOYEE");
            frame.setVisible(true);
            frame.setSize(400, 300);
        }
    }
}
