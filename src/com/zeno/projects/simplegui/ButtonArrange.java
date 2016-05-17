/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zeno.projects.simplegui;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jude
 */
public class ButtonArrange extends JFrame{
    public ButtonArrange(){
        initComponents();

    }
    public void initComponents(){
        Container cp= getContentPane();

        //GridBagLayout gl = new GridBagLayout();
        JButton button1 =new JButton("North");
        JButton button2 =new JButton("East");
        JButton button3 = new JButton("South");
        JButton button4 =new JButton("West");
        JButton button5 = new JButton("Center");
        //JPanel panel = new JPanel();
        //panel.setLayout(gl);
        cp.add(button1, BorderLayout.NORTH);
        cp.add(button2, BorderLayout.EAST);
        cp.add(button3, BorderLayout.SOUTH);
        cp.add(button4, BorderLayout.WEST);
        cp.add(button5, BorderLayout.CENTER);


        //add(panel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createAndShowGui(ButtonArrange ba){
        ba.setTitle("Button Arrangement");
        ba.pack();
        ba.setVisible(true);

    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                ButtonArrange b = new ButtonArrange();
                b.createAndShowGui(b);
            }
        });
    }
}
