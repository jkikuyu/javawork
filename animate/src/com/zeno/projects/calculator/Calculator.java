/*
 * class to create a simple calculator 
 */
package com.zeno.projects.calculator;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jude Kikuyu
 * date: 29/02/2016
 */
public class Calculator extends JFrame {
    
    JButton [] numbers = new JButton[10];
    JButton plus;
    JButton minus;
    JButton multiply;
    JButton divide;
    JButton equals;
    JButton dot;
    JTextField output;
    JTextField operand1;
    JTextField operand2;
    // constructor to initial values
    
    public Calculator(){
        super("Jude's Calculator");
        numbers = new JButton[10];
        for(int i = 0; i < 10; i++)
            numbers[i] = new JButton("" + i);
        
        plus = new JButton("+");
        
        minus = new JButton("+");
        
        multiply = new JButton("x");

        divide = new JButton("/");
        equals = new JButton("=");
        
        dot = new JButton(".");
        
        operand1 = new JTextField(7);
        operand2 = new JTextField(7);
        output = new JTextField(15);
        
        this.setSize(300,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // panel to have the operand fields
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2,1));
        add(top, BorderLayout.NORTH);
        JPanel input = new JPanel();
        input.add(operand1);
        input.add(operand2);
        top.add(input);
        JPanel results = new JPanel();
        results.add(output);
        top.add(results);
        // panel to contain the calculator buttons
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4,1));
        center.add(getRow(numbers[7], numbers[8], numbers[9], plus));
        center.add(getRow(numbers[4], numbers[5], numbers[6], minus));
        center.add(getRow(numbers[1], numbers[2], numbers[3], multiply));
        center.add(getRow(dot, numbers[0], equals, divide));
        add(center);

    }
    public void createAndShowWindow(JFrame c){
        c.pack();
        c.setVisible(true);

    }
   private JPanel getRow(JButton b1, JButton b2, JButton b3, JButton b4){
    JPanel row = new JPanel();
    row.setLayout(new BoxLayout(row,BoxLayout.X_AXIS));
    row.add(b1);
    row.add(b2);
    row.add(b3);
    row.add(b4);
    row.add(Box.createHorizontalGlue());
    row.add(b1);row.add(b2);row.add(b3);row.add(b4);
    row.add(Box.createHorizontalGlue());

    return row;
    }

  public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Calculator calc = new Calculator(); 
                calc.createAndShowWindow(calc);
            }
        });
    }

}