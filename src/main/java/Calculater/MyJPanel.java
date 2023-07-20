package Calculater;

import javax.swing.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class MyJPanel extends JPanel {
    public MyJPanel(String name, int width, int height) {
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());

        /*super.setName(name);
        super.setPreferredSize(new Dimension(300, 50));
        super.setLayout(new FlowLayout(FlowLayout.LEFT));
        super.setMinimumSize(new Dimension(300,50));*/


    }
}
