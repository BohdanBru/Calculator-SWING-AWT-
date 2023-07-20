package Calculater;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class MyJTextField extends JTextField {
    public MyJTextField(String text, int columns) {
        super(columns);
        super.setText(text);
    }
    public MyJTextField(int columns) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(Color.GRAY);
    }

    public MyJTextField(int columns, Color textColor) {
        super.setColumns(columns);
        Font font = new Font("Courier", Font.ITALIC, 12);
        super.setFont(font);
        super.setForeground(textColor);
    }
}
