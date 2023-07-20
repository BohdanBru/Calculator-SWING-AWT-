package Calculater;

import javax.swing.*;
import java.awt.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class MyJFrame extends JFrame {

    public MyJFrame(String s, int width, int height  ){
        super(s);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());

        /*super.setMinimumSize(new Dimension(350, 300));
        super.setSize(new Dimension(350, 300));
        super.setResizable(false);
        super.setLayout(new BorderLayout(2, 2));*/
    }
    public MyJFrame(String s, int width, int height, LayoutManager layoutManager  ){
        super(s);
        super.setSize(width, height);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(layoutManager);

    }
}
