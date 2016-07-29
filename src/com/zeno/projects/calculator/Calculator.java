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
 * date: 29/06/2016
 */
public class Calculator extends JFrame  implements ActionListener {
    JPanel[] buttonRow = new JPanel[4];
    JButton [] numbers = new JButton[10];
    private static JButton plus;
    private static JButton minus;
    private static JButton multiply;
    private static JButton divide;
    private static JButton equals;
    private static JButton dot;
    private static Stack operand, operator;
    double amt =0.0, t = 0.0;
    int[] dimW = {300,45,100,90};
    int[] dimH = {35, 40};
    Dimension displayDimension = new Dimension(dimW[0], dimH[0]);
    Dimension regularDimension = new Dimension(dimW[1], dimH[1]);
    Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);
    Dimension zeroButDimension = new Dimension(dimW[3], dimH[1]);
    Font font = new Font("Times new Roman", Font.BOLD, 14);

    JTextArea output;
    JPanel displayPanel, resultPanel;
    JPanel display;
    
    public Calculator(){
        super("Jude's Calculator");
        numbers = new JButton[10];
        setResizable(false);
        setSize(380, 250);
        setDesign();
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        for(int i = 0; i < 10; i++){
            numbers[i] = new JButton("" + i);
            numbers[i].setActionCommand(Integer.toString(i));
            numbers[i].setPreferredSize(regularDimension);
            numbers[i].addActionListener(this);

        }
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
        FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);
        GridLayout grid = new GridLayout(5,4);
        setLayout(grid);

        for(int i = 0; i < 4; i++){
            buttonRow[i] = new JPanel();
            buttonRow[i].setLayout(f2);
            buttonRow[i].setFont(font);
        }

        plus = new JButton("+");
        plus.setActionCommand("+");
        plus.addActionListener(this);
        plus.setPreferredSize(regularDimension);

        minus = new JButton("-");
        minus.setActionCommand("-");
        minus.addActionListener(this);
        minus.setPreferredSize(regularDimension);

        multiply = new JButton("x");
        multiply.setActionCommand("x");
        multiply.addActionListener(this);
        multiply.setPreferredSize(regularDimension);

        divide = new JButton("/");
        divide.setActionCommand("/");
        divide.addActionListener(this);
        divide.setPreferredSize(regularDimension);

        equals = new JButton("=");
        equals.setActionCommand("=");
        equals.addActionListener(this);
        equals.setPreferredSize(regularDimension);

        dot = new JButton(".");
        dot.setActionCommand(".");
        dot.addActionListener(this);
        dot.setPreferredSize(regularDimension);

        operand = new Stack();
        operator = new Stack();
        output = new JTextArea(1,10);
        output.setEditable(false);
        output.setBackground(Color.white);
        output.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        output.setPreferredSize(displayDimension);

        displayPanel = new JPanel();
        displayPanel.setLayout(f1);

        displayPanel.add(output);
        add(displayPanel);
        for(int i = 7; i < 10; i++)
            buttonRow[0].add(numbers[i]);
        buttonRow[0].add(plus);
        add(buttonRow[0]);

        for(int i = 4; i < 7; i++)
            buttonRow[1].add(numbers[i]);
        buttonRow[1].add(minus);
        add(buttonRow[1]);

        for(int i = 1; i < 4; i++)
            buttonRow[2].add(numbers[i]);
        buttonRow[2].add(divide);
        add(buttonRow[2]);
       buttonRow[3].add(numbers[0]);
       buttonRow[3].add(dot);
       buttonRow[3].add(equals);
       buttonRow[3].add(multiply);
       add(buttonRow[3]);
    }
    public final void setDesign() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) { }
    }

    public void createAndShowWindow(JFrame c){
        c.pack();
        c.setVisible(true);

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

        boolean isExistOperand =true,
                isResultComputed = false;
        boolean isExistOperator =true;
        if (operand.size() == 0)
             isExistOperand = false;
             isExistOperator = false;

        if(cmd.matches("\\+\\-\\/")==true ||cmd.equals("x")){
            cmd = (cmd.equals("x"))?"*":cmd;
            operator.push(cmd);
            isExistOperator = false;

        }
        else{
            if (operand.size()==0)
                operand.push(cmd);

            else{
                if(isExistOperand){
                    operand.push(cmd);
                    
                    isResultComputed = true;
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
        }
        text = output.getText();
        text +=cmd;
        output.setText(text);

        if (isResultComputed){
            cmd = Double.toString(computeTotal());
            int r =(int) Double.parseDouble(cmd);
            text =Integer.toString(r);
            output.setText(text);
        }
        if (isExistOperator){
            text = output.getText();
            text +=Integer.toString(Integer.parseInt(cmd));
            output.setText(text);
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
      else if(operator.peek().equals("*")){

        amt = Double.parseDouble((String)operand.pop())* Double.parseDouble((String)operand.pop());
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