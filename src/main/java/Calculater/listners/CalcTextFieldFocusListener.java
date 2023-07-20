package Calculater.listners;

import Calculater.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class CalcTextFieldFocusListener implements FocusListener {
    private JTextField field;

    public CalcTextFieldFocusListener(JTextField number) {
    field = number;
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (field.getText().trim().equals(Launcher.INPUT_NUMBER)) {
            field.setText("");
            field.setForeground(Color.BLACK);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (field.getText().trim().equals("")) {
            field.setText(Launcher.INPUT_NUMBER);
            field.setForeground(Color.GRAY);
        }
    }
}
