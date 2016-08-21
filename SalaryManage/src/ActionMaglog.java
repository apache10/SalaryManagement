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
            frame = new JFrame("MANAGER profile");
            frame.setVisible(true);
            frame.setSize(400, 300);

            Manager c =new Manager();
            JLabel label = new JLabel(c.getname());
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.add(label);

            JLabel myLabel = new JLabel(String.valueOf(c.getsalary()));
            panel.add(myLabel);


            JButton button_Add_EMP = new JButton("ADD EMPLOYEE");
            panel.add(button_Add_EMP);
            button_Add_EMP.addActionListener(new AddEmployee(frame));
            JButton button = new JButton("BACK");
            panel.add(button);
            button.addActionListener(new ActionMAG(frame));
        }
    }
}


