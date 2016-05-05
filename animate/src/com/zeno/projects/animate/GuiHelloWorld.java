/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeno.projects.animate;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 89722
 */
public class GuiHelloWorld {
    public static void main(String[] args){
           JFrame frame = new JFrame("Hello World");
           String name = JOptionPane.showInputDialog("Hello my name.");
           JOptionPane.showMessageDialog(frame,"Hello Mr"+name  +"");
           System.exit(0);
           
    }
}
