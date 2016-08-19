import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by vishal.kumar1 on 20/08/16.
 *///log in button
class ActionMaglog implements ActionListener {
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


