/**
 * Created by gaurav on 20-08-2016.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddEmployee implements ActionListener {
    JFrame tempFrame;
    JFrame frame;
    public AddEmployee(JFrame logFrame) {
        tempFrame = logFrame;
    }

   /* public AddEmployee(){
        JFrame frame = new JFrame("Enter the respective details");
        frame.setVisible(true);
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton button = new JButton("ADD EMPLOYEE");
        panel.add(button);
        button.addActionListener (new Action1());

    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        tempFrame.setVisible(false);
        tempFrame.dispose();
        frame = new JFrame("add employee profile");
        frame.setVisible(true);
        frame.setSize(600, 500);
        JPanel panel = new JPanel();
        frame.add(panel);
        JTextField employeeName = new JTextField("name of employee");
        panel.add(employeeName);
        JTextField employeeExp = new JTextField("experience of employee");
        panel.add(employeeExp);
        JButton button = new JButton("ADD EMPLOYEE");
        panel.add(button);
        button.addActionListener(new saveEmployee(frame,employeeName, employeeExp));
    }


   /* static class Action1 implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            JFrame frame2 = new JFrame("details");
            frame2.setVisible(true);
            frame2.setSize(200,200);
            JLabel label = new JLabel("mag");
            JPanel panel = new JPanel();
            frame2.add(panel);
            panel.add(label);
        }
    }*/

}

