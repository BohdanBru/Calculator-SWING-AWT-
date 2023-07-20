package Calculater;

import Calculater.listners.CalcButtonActionListener;
import Calculater.listners.CalcTextFieldFocusListener;
import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import com.jtattoo.plaf.smart.SmartLookAndFeel;

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.*;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class Launcher {
    public static final String INPUT_NUMBER = "Input Number";

    private MyJButton plus;
    private MyJButton minus;
    private MyJButton divide;
    private MyJButton multiply;
    private MyJButton changeSkin;

    private JLabel labelNumber1;
    private JLabel labelNumber2;
    private JLabel labelResult;

    private MyJTextField fieldNumber1;
    private MyJTextField fieldNumber2;
    private MyJTextField fieldResult;

    private MyJPanel panel1;
    private MyJPanel panel2;
    private MyJPanel panel3;
    private MyJFrame frame;


    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        Launcher launcher = new Launcher();
        launcher.createLabels();
        launcher.createTextFields();
        launcher.createButtons();
        launcher.createPanels();
        launcher.createFrame();

    }

    private void createFrame() {
        frame = new MyJFrame("Calculator", 430, 200, new BorderLayout(2, 2));
        frame.setMinimumSize(new Dimension(430, 200));

        frame.setResizable(false);

        frame.getContentPane().add(panel1, BorderLayout.NORTH);
        frame.getContentPane().add(panel2, BorderLayout.CENTER);
        frame.getContentPane().add(panel3, BorderLayout.SOUTH);
        changeSkinListener();

        frame.setVisible(true);
    }

    private void createPanels() {
        panel1 = new MyJPanel("panel1", 100, 100);
        panel1.setPreferredSize(new Dimension(200, 50));
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2 = new MyJPanel("panel2", 100, 100);
        panel2.setPreferredSize(new Dimension(200, 50));
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3 = new MyJPanel("panel4", 100, 100);
        panel3.setPreferredSize(new Dimension(200, 50));
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(labelNumber1);
        panel1.add(fieldNumber1);
        panel1.add(labelNumber2);
        panel1.add(fieldNumber2);
        panel2.add(plus);
        panel2.add(minus);
        panel2.add(multiply);
        panel2.add(divide);
        panel3.add(labelResult);
        panel3.add(fieldResult);
        panel3.add(changeSkin);
    }

    private void createLabels() {
        labelNumber1 = new JLabel("Number");
        labelNumber2 = new JLabel("Number");
        labelResult = new JLabel("Result");

    }

    private void createButtons() {
        plus = new MyJButton("Plus");
        minus = new MyJButton("Minus");
        divide = new MyJButton("Divide");
        multiply = new MyJButton("Multiply");
        changeSkin = new MyJButton("Change skin");
        addButtonListeners();
    }

    private void createTextFields() {
        fieldNumber1 = new MyJTextField(INPUT_NUMBER, 5);
        fieldNumber2 = new MyJTextField(INPUT_NUMBER, 5);
        fieldResult = new MyJTextField(10, Color.RED);
        fieldResult.setEditable(false);
        fieldResult.setFocusable(false);
        addTextFieldListeners();
    }


    private void addButtonListeners() {
        CalcButtonActionListener bl = new CalcButtonActionListener(fieldNumber1, fieldNumber2, fieldResult);

        plus.addActionListener(bl);
        minus.addActionListener(bl);
        multiply.addActionListener(bl);
        divide.addActionListener(bl);
    }

    private void addTextFieldListeners() {
        fieldNumber1.addFocusListener(new CalcTextFieldFocusListener(fieldNumber1));
        fieldNumber2.addFocusListener(new CalcTextFieldFocusListener(fieldNumber2));
    }
    private void changeSkinListener(){
        changeSkin.addActionListener(new ChangeSkinListner(frame, new SmartLookAndFeel()));
    }

}
