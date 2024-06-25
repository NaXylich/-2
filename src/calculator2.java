import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator2 extends JFrame {
    public int res = 0;

    public calculator2() {
        setTitle("Калькулятор");
        JPanel panel = new JPanel();
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");
        JLabel result = new JLabel("result");
        JTextField x1 = new JTextField("1", 10);
        JTextField x2 = new JTextField("2", 10);

        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 + x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerMinus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 - x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 * x_2;
                result.setText(String.valueOf(res));
            }
        };

        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                if (x_2 != 0) {
                    res = x_1 / x_2;
                    result.setText(String.valueOf(res));
                } else {
                    result.setText("Cannot divide by zero");
                }
            }
        };

        plus.addActionListener(listenerPlus);
        minus.addActionListener(listenerMinus);
        multiply.addActionListener(listenerMultiply);
        divide.addActionListener(listenerDivide);

        panel.setSize(new Dimension(500, 500));
        add(panel);

        panel.add(x1);
        panel.add(x2);
        panel.add(result);
        panel.add(plus);
        panel.add(minus);
        panel.add(multiply);
        panel.add(divide);

        setPreferredSize(new Dimension(600, 600));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }

    public static void main(String[] args) {
        new calculator2();
    }
}
