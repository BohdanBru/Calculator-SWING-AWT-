package Calculater;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class MyJButton extends JButton {

    public MyJButton(String s) {
        super.setText(s);
        super.setSize(new Dimension(120, 80));
    }public MyJButton(String s, int width, int height    ) {
        super.setText(s);
        super.setSize(width ,height);
    }
}
