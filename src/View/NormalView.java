package View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NormalView extends JPanel {
    private JTextField textField;
    private JLabel resultLabel;
    private JButton buton1;
    private JButton buton8;
    private JButton buton9;
    private JButton buton7;
    private JButton buton3;
    private JButton buton4;
    private JButton buton6;
    private JButton buton5;
    private JButton buton2;
    private JButton equalButton;
    private JRadioButton viewToggle;
    private JButton clearButton;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton backButton;
    private JButton buton0;

    public NormalView() {
        //declare components
        textField = new JTextField (20);
        textField.setEditable(false);
        textField.setText("0");
        resultLabel = new JLabel ("");
        buton0 = new JButton ("0");
        buton1 = new JButton ("1");
        buton8 = new JButton ("8");
        buton9 = new JButton ("9");
        buton7 = new JButton ("7");
        buton3 = new JButton ("3");
        buton4 = new JButton ("4");
        buton6 = new JButton ("6");
        buton5 = new JButton ("5");
        buton2 = new JButton ("2");
        equalButton = new JButton ("=");
        viewToggle = new JRadioButton ("Scientific");
        clearButton = new JButton ("Clear");
        addButton = new JButton ("+");
        subtractButton = new JButton ("-");
        multiplyButton = new JButton ("*");
        divideButton = new JButton ("/");
        backButton = new JButton ("<-");

        //adjust size and set layout
        setPreferredSize (new Dimension (301, 291));
        setLayout (null);

        //add components
        add (textField);
        add (resultLabel);
        add (buton0);
        add (buton1);
        add (buton8);
        add (buton9);
        add (buton7);
        add (buton3);
        add (buton4);
        add (buton6);
        add (buton5);
        add (buton2);
        add (equalButton);
        add (clearButton);
        add (addButton);
        add (subtractButton);
        add (multiplyButton);
        add (divideButton);
        add (backButton);

        //set component bounds
        textField.setBounds (2, 35, 298, 25);
        resultLabel.setBounds (5, 5, 300, 25);
        buton0.setBounds(155 - 75, 230, 70, 60);
        buton1.setBounds (0, 175, 75, 50);
        buton8.setBounds (80, 65, 70, 50);
        buton9.setBounds (155, 65, 70, 50);
        buton7.setBounds (0, 65, 75, 50);
        buton3.setBounds (155, 175, 70, 50);
        buton4.setBounds (0, 120, 75, 50);
        buton6.setBounds (155, 120, 70, 50);
        buton5.setBounds (80, 120, 70, 50);
        buton2.setBounds (80, 175, 70, 50);
        equalButton.setBounds (155, 230, 70, 60);
        viewToggle.setBounds (0, 265, 100, 25);
        clearButton.setBounds (0, 230 + 32, 75, 27);
        addButton.setBounds(155 + 75, 65, 70, 50);
        subtractButton.setBounds(155 + 75, 120, 70, 50);
        multiplyButton.setBounds(155 + 75, 175, 70, 50);
        divideButton.setBounds(130 + 100, 230, 70, 60);
        backButton.setBounds(0, 230, 75, 27);
    }

    public void actButon0(ActionListener cal){
        buton0.addActionListener(cal);
    }

    public void actButon1(ActionListener cal){
        buton1.addActionListener(cal);
    }

    public void actButon2(ActionListener cal){
        buton2.addActionListener(cal);
    }

    public void actButon3(ActionListener cal){
        buton3.addActionListener(cal);
    }

    public void actButon4(ActionListener cal){
        buton4.addActionListener(cal);
    }

    public void actButon5(ActionListener cal){
        buton5.addActionListener(cal);
    }

    public void actButon6(ActionListener cal){
        buton6.addActionListener(cal);
    }

    public void actButon7(ActionListener cal){
        buton7.addActionListener(cal);
    }

    public void actButon8(ActionListener cal){
        buton8.addActionListener(cal);
    }

    public void actButon9(ActionListener cal){
        buton9.addActionListener(cal);
    }

    public void actEgal(ActionListener cal){
        equalButton.addActionListener(cal);
    }

    void actToggle(ActionListener cal){
        viewToggle.addActionListener(cal);
    }

    public void actButonClear(ActionListener cal){
        clearButton.addActionListener(cal);
    }

    public void actAdunare(ActionListener cal){
        addButton.addActionListener(cal);
    }

    public void actScadere(ActionListener cal){
        subtractButton.addActionListener(cal);
    }

    public void actInmultire(ActionListener cal){
        multiplyButton.addActionListener(cal);
    }

    public void actImpartire(ActionListener cal){
        divideButton.addActionListener(cal);
    }

    public void actBack(ActionListener cal){
        backButton.addActionListener(cal);
    }

    public String getTextField(){
        return textField.getText();
    }

    public void setTextField(String s){
        textField.setText(s);
    }

    public String getResultLabel(){
        return resultLabel.getText();
    }

    public void setResultLabel(String s){
        resultLabel.setText(s);
    }
}
