
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BankBalanceCalculator extends JFrame implements ActionListener {
    JTextField balance, amount;
    JButton deposit, withdraw;
    JLabel result;

    BankBalanceCalculator() {
        setTitle("Bank Balance Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(4, 2, 10, 10));

        add(new JLabel("Initial Balance:"));
        balance = new JTextField();
        add(balance);

        add(new JLabel("Transaction Amount:"));
        amount = new JTextField();
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");

        add(deposit);
        add(withdraw);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);

        result = new JLabel("Updated Balance: ");
        add(result);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double b = Double.parseDouble(balance.getText());
        double a = Double.parseDouble(amount.getText());

        if (e.getSource() == deposit) {
            b = b + a;
        } else if (e.getSource() == withdraw) {
            if (a > b) {
                JOptionPane.showMessageDialog(this,
                    "Insufficient Balance!");
                return;
            }
            b = b - a;
        }

        balance.setText(String.valueOf(b));
        result.setText("Updated Balance: " + b);
    }

    public static void main(String[] args) {
        new BankBalanceCalculator();
    }
}
