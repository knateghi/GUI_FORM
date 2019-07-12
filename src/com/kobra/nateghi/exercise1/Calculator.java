package com.kobra.nateghi.exercise1;

import javax.swing.*;
import java.awt.*;


public class Calculator extends JFrame {
    //the instance variables are not private for this class because they will be used outside the class(for future projects)
    static JFrame frame;
    static JTextField textField;
    String string0, string1, string3;
    JPanel panel;
    JButton one, two, three, four, five, six, seven, eigth, nine, zero, addition, subtraction, multiplication, div, equals, dot;

    public Calculator(String title) {
        super(title);


        string0 = string1 = string3 = "";
        //  initializing the textField
        textField = new JTextField(null, 18);
        textField.setEditable(false);

        //initializing the panel
        panel = new JPanel();
        panel.setBackground(Color.lightGray);

        //initializing the buttons
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");

        eigth = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        subtraction = new JButton("-");
        addition = new JButton("+");
        multiplication = new JButton("*");
        div = new JButton("/");
        equals = new JButton("=");
        dot = new JButton(".");

        //adding the textField to the panel
        panel.add(BorderLayout.NORTH, textField);

        //adding the buttons to the panel
        panel.add(seven);
        panel.add(eigth);
        panel.add(nine);
        panel.add(div);
        panel.add(four);
        panel.add(five);
        panel.add(six);
        panel.add(multiplication);
        panel.add(one);
        panel.add(two);
        panel.add(three);
        panel.add(subtraction);
        panel.add(zero);
        panel.add(dot);
        panel.add(equals);
        panel.add(addition);


        //Creating New Frame
        frame = new JFrame("Calculator");

        frame.add(panel);

        frame.setSize(203, 230);
        frame.show();


    }


}




