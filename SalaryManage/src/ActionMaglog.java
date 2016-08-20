/**
 * Created by gaurav on 20-08-2016.
 */import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 20/08/16.
 *///log in button
class ActionMaglog implements ActionListener {
    JFrame tempFrame;
    JTextField MagId;
    JPasswordField pass;
    JFrame frame;
    public ActionMaglog(JFrame logFrame, JTextField txt,JPasswordField pas){
        tempFrame= logFrame;
        MagId = txt;
        pass = pas;
    }

    public void actionPerformed (ActionEvent e) {
        if ((MagId.getText().equals(Constant.GAURAV))) {
            tempFrame.setVisible(false);
            tempFrame.dispose();
            frame = new JFrame("MANAGER");
            frame.setVisible(true);
            frame.setSize(400, 300);
        }
    }
}


