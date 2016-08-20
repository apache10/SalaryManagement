/**
 * Created by gaurav on 20-08-2016.
 */import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 19/08/16.
 */
//log in button
class ActionCeolog implements ActionListener {
    JFrame tempFrame;
    JPasswordField pass;
    JTextField CeoId;

    JFrame frame;
    public ActionCeolog(JFrame logFrame, JPasswordField pas, JTextField txt){
        tempFrame= logFrame;
        CeoId = txt;
        pass = pas;

    }

    public void actionPerformed (ActionEvent e) {
        System.out.println(CeoId.getText());
        System.out.println(pass.getPassword().toString());
        if((CeoId.getText().equals(Constant.GAURAV))) {
            tempFrame.setVisible(false);
            tempFrame.dispose();
            frame = new JFrame("CEO");
            frame.setVisible(true);
            frame.setSize(400, 300);
        }
        else return;
    }
}
