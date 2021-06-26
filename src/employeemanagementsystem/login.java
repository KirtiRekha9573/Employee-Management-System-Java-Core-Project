//This is the login page//
package employeemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class login implements ActionListener 
{   
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;
    
    //Declaring a constructor//
    login()
    {
        f = new JFrame("Login");
        f.setBackground(Color.WHITE);
        f.setLayout(null);
        
        l1 = new JLabel("Username");
        l1.setBounds(40, 20, 100, 30);
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40, 70, 100, 30);
        f.add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150, 20, 150, 30);
        f.add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 30);
        f.add(t2);
        
        //Adding Images//
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/avatar.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350, 20, 150, 150);
        f.add(l3);
        
        //Adding Buttons into the frame //
        b1 = new JButton("Login");
        b1.setBounds(40, 140, 120, 30);
        b1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        b1.addActionListener(this);
        b1.setBackground(Color.black);
        b1.setForeground(Color.WHITE);
        f.add(b1);
        
        b2 = new JButton("Cancel");
        b2.setBounds(180, 140, 120, 30);
        b2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        f.add(b2);
        
        b2.addActionListener(this);
        f.getContentPane().setBackground(Color.WHITE);
        
        //For visibility//
        f.setVisible(true);
        f.setSize(600, 300);
        f.setLocation(400, 300);  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        try
        {
            conn cl = new conn();
            //Taking input from user//
            String u = t1.getText();
            String v = t1.getText();
            
            //SQL Query//
            String q = "select * from login where username= '"+u+"' and password='"+v+"'";
            
            ResultSet rs = cl.s.executeQuery(q);
            if(rs.next())
            {
                new details().f.setVisible(true);
                f.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Invalid Login");
                f.setVisible(false);
            }
        }
        catch(Exception ae)
        {
            ae.printStackTrace();
        }   
    }
    public static void main(String args[])
    {
        login l = new login();
    }
    
}
