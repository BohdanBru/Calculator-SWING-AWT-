package Calculater;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class ChangeSkinListner implements ActionListener {
    LookAndFeel laf;
    JFrame frame;
    int count = 1;

    public ChangeSkinListner(MyJFrame frame, LookAndFeel laf) {
        this.frame = frame;
       this.laf = laf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (count % 2 != 0) {
                UIManager.setLookAndFeel(laf);
                count++;
            }else {
                UIManager.setLookAndFeel(new AeroLookAndFeel());
                count++;
            }

        } catch (UnsupportedLookAndFeelException ex) {
            throw new RuntimeException(ex);
        }
        SwingUtilities.updateComponentTreeUI(frame);
    }
}
