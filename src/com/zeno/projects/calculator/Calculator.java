/*
 * class to create a simple calculator 
 */
package com.zeno.projects.calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import javax.swing.*;

/**
 *
 * @author Jude Kikuyu
 * date: 29/02/2016
 */
public class Calculator extends JFrame  implements ActionListener {
    
    JButton [] numbers = new JButton[10];
    private static JButton plus;
    private static JButton minus;
    private static JButton multiply;
    private static JButton divide;
    private static JButton equals;
    private static JButton dot;
    private static Stack operand, operator;
    double amt =0.0, t = 0.0;
    JTextArea output,result;
    JPanel display;
//    JTextField operand1;
//    JTextField operand2;
    // constructor to initial values
    
    public Calculator(){
        super("Jude's Calculator");
        numbers = new JButton[10];
        for(int i = 0; i < 10; i++){
            numbers[i] = new JButton("" + i);
            numbers[i].setActionCommand(Integer.toString(i));
            numbers[i].addActionListener(this);
        }
        plus = new JButton("+");
        plus.setActionCommand("+");
        plus.addActionListener(this);
       
        minus = new JButton("-");
        minus.setActionCommand("-");
        minus.addActionListener(this);
        
        multiply = new JButton("x");
        multiply.setActionCommand("x");
        multiply.addActionListener(this);

        divide = new JButton("/");
        divide.setActionCommand("/");
        divide.addActionListener(this);

        equals = new JButton("=");
        equals.setActionCommand("=");
        equals.addActionListener(this);
       
        dot = new JButton(".");
        dot.setActionCommand(".");
        dot.addActionListener(this);
       
        operand = new Stack();
        operator = new Stack();
        output = new JTextArea(1,20);
        output.setEditable(false);
        output.setBackground(Color.white);
        result = new JTextArea(1,10);
        result.setEditable(false);
        result.setBackground(Color.white);

        this.setSize(300,400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // panel to have the operand fields
        JPanel top = new JPanel();
        top.setLayout(new GridLayout(2,1));
        add(top, BorderLayout.NORTH);
//        JPanel input = new JPanel();
//        input.add(operand1);
//        input.add(operand2);
//        top.add(input);
          display = new JPanel();

          display.add(output);
          display.add(result);
        top.add(display);
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
    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * The use of a stack to allow for entry of several values for computation
         * operand is entered as one value until a computation symbol is encountered
         * this marks the end of the first operand.
         */
        String cmd =e.getActionCommand(),
        text = "";

        boolean isExistOperator =true;
        if (operand.size() == 0)
             isExistOperator= false;

        if(cmd.matches("\\+\\-\\/")==true ||cmd.equals("x")){
            cmd = (cmd.equals("x"))?"*":cmd;
            operator.push(cmd);

        }
        else{
            if (operand.size()==0)
                operand.push(cmd);

            else{
                if(isExistOperator){
                    operand.push(cmd);
                    cmd = Double.toString(computeTotal());
                    operand.push(cmd);
                }
                else{
                    cmd = operand.pop()+cmd ;
                    operand.push(cmd);
                }

           }
        }
        if (isExistOperator){
            text = result.getText();
            text +=Integer.toString(Integer.parseInt(cmd));
            result.setText(text);
        }
        else{
            text = output.getText();
            text +=cmd;
            output.setText(text);
        }
    }
  private double computeTotal(){

      if(operator.peek().equals("+"))
          amt =Double.parseDouble((String)operand.pop())+Double.parseDouble((String)operand.pop());
      else if(operator.peek().equals("-")){
          t = Double.parseDouble((String)operand.pop());
          amt =Double.parseDouble((String)operand.pop())/t;
      }
      else if(operator.peek().equals("*"))
          amt = Double.parseDouble((String)operand.pop()) * Double.parseDouble((String)operand.pop());
      else if(operator.peek().equals("/")){
          t = Double.parseDouble((String)operand.pop());
          amt =Double.parseDouble((String)operand.pop())/t;

      }
      return amt;
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