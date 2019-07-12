package com.kobra.nateghi.exercise2;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicTreeUI;
import java.awt.*;
import java.awt.event.*;

public class Form extends JFrame{
    private JPanel rootPanel;
    private JPanel northPanel;
    private JPanel centerPanel;
    private JRadioButton plainRadioButton;
    private JRadioButton boldRadioButton;
    private JRadioButton italicRadioButton;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel phoneLabel;
    private JList list1;
    private JTextField lastNameTextField;
    private JTextField firstNameTextField;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JList list2;
    private JButton addButton;
    private JTextField outputTextField;
    private JPanel southPanel;
    private JButton submitButton;
    private ButtonGroup buttonGroup;

    private static final String[] comboBoxList={
       "Full Time",
        "Part Time"
    };
    private static final String[] listOfJobs={
            "Cashier",
            "Customer Service",
            "Cleaning",
            "Tutoring",
            "Science",
            "Mathematics",
            "Software Engineering",
            "Software Testing",
            "IT",
            "Nursing",
            "Painting",
            "Receptionist",
            "Animation",
            "Plumbing",
            "Construction"
    };
    public Form() {
        buttonGroup=new ButtonGroup();
        buttonGroup.add(plainRadioButton);
        buttonGroup.add(boldRadioButton);
        buttonGroup.add(italicRadioButton);

        plainRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Plain Font");
                outputTextField.setFont(new Font("Serif", Font.PLAIN, 13));
            }
        });
        boldRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Bold Font");
                outputTextField.setFont(new Font("Serif", Font.BOLD, 13));
            }
        });
        italicRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText("Italic Font");
                outputTextField.setFont(new Font("Serif", Font.ITALIC, 13));
            }
        });
        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                outputTextField.setText(comboBoxList[comboBox1.getSelectedIndex()]);
            }
        });
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                outputTextField.setText(listOfJobs[list1.getSelectedIndex()]);
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputTextField.setText("Item added");
                list2.setListData(list1.getSelectedValuesList().toArray(new String[0]));
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Thank you "+firstNameTextField.getText()+
                                ", we will contact you shortly",
                        "Application Form",JOptionPane.PLAIN_MESSAGE);

            }
        });



        MouseHandler mouseHandler = new MouseHandler();
        rootPanel.addMouseListener(mouseHandler);
        rootPanel.addMouseMotionListener(mouseHandler);

    }
    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            outputTextField.setText(String.format("Mouse cLicked at [%d,%d ]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mousePressed(MouseEvent e) {
            outputTextField.setText(String.format("Mouse pressed at [%d,%d]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            outputTextField.setText(String.format("Mouse released at [%d,%d]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            outputTextField.setText(String.format("Mouse entered at [%d,%d]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            outputTextField.setText(String.format("Mouse exited at [%d,%d]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mouseDragged(MouseEvent e) {
            outputTextField.setText(String.format("Mouse dragged at [%d,%d]",
                    e.getX(),e.getY()));

        }

        @Override
        public void mouseMoved(MouseEvent e) {
            outputTextField.setText(String.format("Mouse moved at [%d,%d]",
                    e.getX(),e.getY()));

        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame(" Application Form");
        frame.setContentPane(new Form().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
