
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton add, subtract;
    JLabel result;

    SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("First Number:"));
        t1 = new JTextField();
        add(t1);

        add(new JLabel("Second Number:"));
        t2 = new JTextField();
        add(t2);

        add = new JButton("Addition");
        subtract = new JButton("Subtraction");

        add(add);
        add(subtract);

        add.addActionListener(this);
        subtract.addActionListener(this);

        result = new JLabel("Result: ");
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == add) {
            result.setText("Result: " + (a + b));
        } else if (e.getSource() == subtract) {
            result.setText("Result: " + (a - b));
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
