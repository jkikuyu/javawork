
import com.zeno.projects.simplegui.SimpleGui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 89722
 */
public class Login extends JDialog implements ActionListener  {
    
    private JButton btnOk, btnCancel;
    private JLabel lblUserName, lblPassword;
    private JTextField txtUserName;
    private JPasswordField txtPassword;
    private JPanel panel;
    private JFrame parent;
    private static String OK = "ok";
    private static String CANCEL = "cancel";
    private int cnt; // keep login counter
    private boolean loginSuccess;
    public Login () {
        initComponents();
    }
    private void initComponents() {
        cnt = 0;
        lblUserName = new JLabel();
        lblPassword = new JLabel();
        txtUserName = new JTextField(20);
        txtPassword = new JPasswordField(20);
        btnOk = new JButton();
        btnCancel = new JButton();
        panel = new JPanel();
        loginSuccess = false;
        //frame= new JFrame();
        panel.setName("panel");

        // label set up
        lblUserName.setText("User Name");
        lblUserName.setName("lblUsername");
        lblPassword.setText("Password");
        lblPassword.setName("lblPassword");
        // text field setup

        txtUserName.setText("");
        txtUserName.setName("txtUsername");

        txtPassword.setText("");
        txtPassword.setName("txtPassword");
        txtPassword.setActionCommand(OK);
        txtPassword.addActionListener(this);
         // button set up

        btnOk.setText("Ok"); 
        btnOk.setName("btnOk");
        btnOk.setActionCommand(OK);
        btnOk.addActionListener(this);
        btnCancel.setText("Cancel"); 
        btnCancel.setName("btnCancel");
        btnCancel.setActionCommand(CANCEL);
        btnCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
               String cmd = e.getActionCommand();

        if (OK.equals(cmd)) { //Process the password.
            String userName = txtUserName.getText();
            JOptionPane.showMessageDialog(this, "Welcome Mr" + userName + '!' );

            } else {
                JOptionPane.showMessageDialog(this,"Invalid password. " +
                "Try again.","Error Message",JOptionPane.ERROR_MESSAGE);
            }
    }
        public void createAndShowWindow(JFrame c){
        c.setTitle("Task 3");
        c.pack();
        c.setVisible(true);

    }

        public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this Simple GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Login login = new Login();
                login.createAndShowWindow(login);
            }
        });
    }

}