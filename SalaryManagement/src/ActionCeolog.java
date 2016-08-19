import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 19/08/16.
 */
//log in button
class ActionCeolog implements ActionListener {
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
