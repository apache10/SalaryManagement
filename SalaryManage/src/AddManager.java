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

   /* public AddManager(){
        JFrame frame = new JFrame("Enter the respective details");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("ADD MANAGER");
        panel.add(button);
        button.addActionListener (new Action1());

    }*/

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

    }

    /*static class Action1 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            JFrame frame2 = new JFrame("details");
            frame2.setVisible(true);
            frame2.setSize(200,200);
            JLabel label = new JLabel("ADD MANAGER");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label);
        }
    }*/

}
