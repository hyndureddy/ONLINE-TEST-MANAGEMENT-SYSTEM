/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.test.management.system1;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */ 
public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Online test management System");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,200);
        setVisible(true);
        
    }

    /**
     *
     * @param ae
     */
   
    public void actionPerformed(ActionEvent ae){
        //Object rules = null;
        if(ae.getSource()== rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()== back){
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new Login();
    }
    
}
