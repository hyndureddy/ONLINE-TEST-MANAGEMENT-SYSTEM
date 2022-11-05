/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.test.management.system1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image); 
        
        JLabel heading = new JLabel("Thankyou " + name + " for writing otms");
        heading.setBounds(43,30,700,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(heading);
        
        JLabel hscore = new JLabel("Your score is " + score);
        hscore.setBounds(350,200,300,30);
        hscore.setFont(new Font("Tahoma",Font.PLAIN,26));
        add(hscore);
        
        JButton submit = new JButton("Start again");
        submit.setBounds(400,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]){
        new Score("User",0);
    }
}

