//For the front page, we have used Swing Concept//
/*Swing: Framework that is used whenever we need UI in Java Application.
awt is also used for the same purpose.Swing has some more advantage over awt,because swing has frame concepts.
event: When the project is going from one activity to another activity, event is used. 
For ex. Class ActionListener belongs to event.
*/
package employeemanagementsystem;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;


public class Front_Page implements ActionListener {
    //For the java frame, means another window opens. Frame is like a arraylist. We will be adding everything into that//
    JFrame f;
    //For the lables//
    JLabel id, label1;
    //For buttons that we will be using//
    JButton b;
    
    //Declaring a constructor//
    Front_Page()
    {
        //Setting the title of the frame//
      f = new JFrame("Employee Management System");
      f.setBackground(Color.GREEN);
      f.setLayout(null);
      
      ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
      //Setting the size of the image//
      Image i2 = ic.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
      //Copying image into another image//
      ImageIcon i3 = new ImageIcon(i2);
      JLabel label1 = new JLabel(i3);
      
      //Setting the coordinates.(int x, int y, int width, int height) //
      label1.setBounds(0, 150, 13600, 530);
      f.add(label1);
      
      //Setting the button//
      b = new JButton("Proceed");
      b.setBackground(Color.WHITE);
      b.setForeground(Color.black);
      
      //Setting the boundries of the button//
      b.setBounds(500, 500, 500, 100);
      /*On clicking the button, it should go on another page. Hence, we are adding action listener*/
      b.addActionListener(this);
      
      //Creating another object of the JLabel//
      id = new JLabel();
      id.setBounds(0, 0, 1300, 750);
      id.setLayout(null);
      
      //Setting the Heading for the Project//
      JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
      lid.setBounds(80, 50, 1500, 100);
      lid.setFont(new Font("Times New Roman", Font.ITALIC, 80));
      lid.setForeground(Color.BLACK);
      id.add(lid);
      
      id.add(b);
      f.add(id);
      
      f.getContentPane().setBackground(Color.WHITE);
      //To make the frame visible//
      f.setVisible(true);
      f.setSize(1350, 750);
      f.setLocation(200, 200);
      
      while(true)
      {
          lid.setVisible(false);
          try
          {
              Thread.sleep(500);
          }
          catch(Exception e)
          {
          }
          lid.setVisible(true);
          try
          {
              Thread.sleep(500);
          }
          catch(Exception e)
          {   }
      }
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b)
        {
            f.setVisible(false);
            new login();
        }
    }
      
    public static void main(String args[])
    {
        //Creating the object of the above class//
        Front_Page fp = new Front_Page();
        
    }
      
      
      
      
      
    }
    
    
  
