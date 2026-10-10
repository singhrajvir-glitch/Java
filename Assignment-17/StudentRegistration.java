
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JButton submit;

    StudentRegistration() {
        setTitle("Student Registration Form");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        submit = new JButton("Register");
        add(submit);
        submit.addActionListener(this);

        add(new JLabel(""));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,
            "Student Registered Successfully!\n" +
            "Name: " + name.getText() + "\n" +
            "Roll No: " + roll.getText() + "\n" +
            "Course: " + course.getText());
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
