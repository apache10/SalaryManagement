/**
 * Created by gaurav on 20-08-2016.

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AddManager  implements ActionListener {
    JFrame tempFrame;
    JFrame frame;
    public AddManager(JFrame logFrame) {
        tempFrame = logFrame;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        tempFrame.setVisible(false);
        tempFrame.dispose();
        frame = new JFrame("add manager profile");
        frame.setVisible(true);
        frame.setSize(600, 500);
        JPanel panel = new JPanel();
        frame.add(panel);
        JTextField managerName = new JTextField("name of manager");
        panel.add(managerName);
        JTextField managerExp = new JTextField("experience of manager");
        panel.add(managerExp);
        JButton button = new JButton("ADD MANAGER");
        panel.add(button);
        button.addActionListener(new saveManager(frame,managerName,managerExp));
        JButton button1 = new JButton("BACK");
        panel.add(button1);
        button1.addActionListener(new ActionCEO(frame));

    }


}
