import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class NewCalc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 150);

        JPanel panel = new JPanel();

        JLabel label1 = new JLabel("First Number");
        JTextField textField1 = new JTextField(5);
        JLabel label2 = new JLabel("Second Number");
        JTextField textField2 = new JTextField(5);
        JLabel label3 = new JLabel("Sum");
        JTextField textField3 = new JTextField(5);
        textField3.setEditable(false); 

        JButton button = new JButton("Compute");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int number1 = Integer.parseInt(textField1.getText());
                    int number2 = Integer.parseInt(textField2.getText());
                    int sum = number1 + number2;
                    textField3.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    textField3.setText("Error");
                }
            }
        });

        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}
