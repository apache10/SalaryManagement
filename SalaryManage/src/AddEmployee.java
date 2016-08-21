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
        JButton button1 = new JButton("BACK");
        panel.add(button1);
        button1.addActionListener(new ActionMAG(frame));
    }



}

