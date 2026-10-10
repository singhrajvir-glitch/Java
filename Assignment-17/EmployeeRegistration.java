import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeRegistration extends JFrame implements ActionListener {
    JTextField id, name, department, salary;
    JButton submit;

    EmployeeRegistration() {
        setTitle("Employee Registration Form");
        setSize(350, 250);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Employee ID:"));
        id = new JTextField();
        add(id);

        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Department:"));
        department = new JTextField();
        add(department);

        add(new JLabel("Salary:"));
        salary = new JTextField();
        add(salary);

        submit = new JButton("Submit");
        add(submit);
        submit.addActionListener(this);

        add(new JLabel(""));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this,
            "Employee Details\n" +
            "ID: " + id.getText() + "\n" +
            "Name: " + name.getText() + "\n" +
            "Department: " + department.getText() + "\n" +
            "Salary: " + salary.getText());
    }

    public static void main(String[] args) {
        new EmployeeRegistration();
    }
}
