/**
 * Created by gaurav on 20-08-2016.
 */import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
            frame = new JFrame("profile");
            frame.setVisible(true);
            frame.setSize(600, 500);

            CEO c =new CEO();
            JLabel label = new JLabel(c.getname());
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.add(label);

            JLabel myLabel = new JLabel(String.valueOf(c.getsalary()));
            panel.add(myLabel);


            JButton button_Add_Mag = new JButton("ADD MANAGER");
            panel.add(button_Add_Mag);
            button_Add_Mag.addActionListener(new AddManager(frame));
            JButton button = new JButton("BACK");
            panel.add(button);
            button.addActionListener(new ActionCEO(frame));

        }
        else return;
    }
}
