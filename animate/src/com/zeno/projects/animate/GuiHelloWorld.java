/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeno.projects.animate;

import javax.swing.JOptionPane;

/**
 *
 * @author 89722
 */
public class GuiHelloWorld {
    public static void main(String[] args){
           //JFrame frame = new JFrame("Hello World");
           String name = JOptionPane.showInputDialog("Please Enter your Name.");
           String cat1 =JOptionPane.showInputDialog("CAT 1");
           String cat2 =JOptionPane.showInputDialog("CAT 2");
           String cat3 =JOptionPane.showInputDialog("CAT 3");
           int total = Integer.parseInt(cat1)+Integer.parseInt(cat2)+Integer.parseInt(cat3);
           double avg = total/3;
           JOptionPane.showMessageDialog(null,"Hello Mr "+name  +" your average is " + avg, "Hello world" ,JOptionPane.INFORMATION_MESSAGE);
           System.exit(0);
           
    }
}
