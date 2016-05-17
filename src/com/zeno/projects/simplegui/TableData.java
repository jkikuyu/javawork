package com.zeno.projects.simplegui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


public class TableData extends JFrame{


 //This Vector Of A String Vector will be used to hold data from
 // database table to display in JTable.
 static Vector<Vector<String>> data=new Vector<Vector<String>>();

 static JTable table;

 public TableData()
 {
  super("JTabe with MySql Database");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  JPanel topPanel=new JPanel();

  JLabel label1=new JLabel("MySQL Database Name  :   test");
  label1.setPreferredSize(new Dimension(200,30));

  JLabel label2=new JLabel("MySQL Table Name     :  One");
  label2.setPreferredSize(new Dimension(200,30));

  topPanel.add(label1);
  topPanel.add(label2);

  getContentPane().add(topPanel,BorderLayout.NORTH);


  Vector<String> headers=new Vector<String>();
   headers.add("id");
   headers.add("Name");


  getData();

  //this is the model which contain actual body of JTable
  DefaultTableModel model = new DefaultTableModel(data, headers);
  table=new JTable(model);
  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);


  header_size();

  JScrollPane scroll = new JScrollPane(table);

  scroll.setHorizontalScrollBarPolicy(
    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
  scroll.setVerticalScrollBarPolicy(
    JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

  getContentPane().add(scroll,BorderLayout.SOUTH);
  pack();
  setResizable(false);
  setVisible(true);
 }


 /**
 * Setting the particular Column Size in JTable
 */
 public static void header_size() {
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setPreferredWidth(100);


        column = table.getColumnModel().getColumn(1);
        column.setPreferredWidth(350);


     }


 /**
 * Fetching Data From MySql Database
 * and storing in a Vector of a Vector
 * to Display in JTable
 */
 private static void getData()
 {
  // Enter Your MySQL Database Table name in below Select Query.
  String str="select * from one";
  Connection cn;
  ResultSet rs;
  Statement st;

  try {
   // Change the database name, hosty name,
   // port and password as per MySQL installed in your PC.
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   cn=DriverManager.getConnection("jdbc:mysql://" +
     "localhost:3306/test","root","");
   st=cn.createStatement();

   rs=st.executeQuery(str);

   while(rs.next())
   {
    Vector <String> d=new Vector<String>();

    d.add(rs.getString("id"));
    d.add(rs.getString("name"));

    d.add("\n\n\n\n\n\n\n");
    data.add(d);
   }

  }     catch (InstantiationException ex) {
            Logger.getLogger(TableData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TableData.class.getName()).log(Level.SEVERE, null, ex);
        }     catch (ClassNotFoundException ex) {
            Logger.getLogger(TableData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {

   e.printStackTrace();
  }
 }

 public static void main(String[] args) {

  new TableData();
 }


}

