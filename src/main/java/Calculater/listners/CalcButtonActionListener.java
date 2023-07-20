package Calculater.listners;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class CalcButtonActionListener implements ActionListener {
    JTextField number1;
    JTextField number2;
    JTextField result;

    public CalcButtonActionListener(JTextField number1, JTextField number2, JTextField result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!(e.getSource() instanceof JButton)){
            return;
        }
        JButton button =(JButton) e.getSource();
       final double a = Double.parseDouble(number1.getText());
       final double b = Double.parseDouble(number2.getText());

        if (button.getActionCommand().equals("Plus")) {
            result.setText(String.valueOf(a+b));
        } else if (button.getActionCommand().equals("Divide")) {
            result.setText(String.valueOf(a/b));
        } else if (button.getActionCommand().equals("Minus")) {
            result.setText(String.valueOf(a-b));
        } else if (button.getActionCommand().equals("Multiply")) {
            result.setText(String.valueOf(a*b));
        }

    }
}
