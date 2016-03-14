/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeno.projects.stocks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 89722
 */
public class Connector {
    public Connection con;

    public Connector() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/dbt1201","root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch(java.lang.ClassNotFoundException e) {
        System.err.print("ClassNotFoundException: ");
        System.err.println(e.getMessage());
 }

    }
    public static void main(String args[]){
        Connector c = new Connector();
        c.getSysDate();
    }    

    public void  getSysDate(){
       try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            while(rs.next()) {
                System.out.println(rs.getObject("fname"));
                //System.out.println(rs.getObject("age"));
            }
           stmt.close();
            
    }   catch (SQLException ex) { 
            Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(Connector.class.getName()).log(Level.SEVERE, null, ex);
           }
        }

    }
}