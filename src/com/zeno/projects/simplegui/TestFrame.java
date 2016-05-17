/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zeno.projects.simplegui;

import java.awt.*;
import javax.swing.*;

public class TestFrame extends JFrame {

    private PassWordDialog passDialog;

    public TestFrame() {
        passDialog = new PassWordDialog(this, true);
        passDialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new TestFrame();
                frame.getContentPane().setBackground(Color.BLACK);
                frame.setTitle("Logged In");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }
}

