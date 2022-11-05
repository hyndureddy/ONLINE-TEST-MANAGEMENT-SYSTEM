/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.test.management.system1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author hp
 */
public class Quiz extends JFrame implements ActionListener{
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno,question;
    ButtonGroup groupoptions;
    JButton next,help,submit;
    
    JRadioButton opt1,opt2,opt3,opt4;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name){
        this.name = name;
        setBounds(50,0,1440,850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1440,392);
        add(image); 
        
        qno = new JLabel();
        qno.setBounds(100,450,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150,450,900,30);
        question.setFont(new Font("Tahoma",Font.PLAIN,24));
        add(question);
        
        questions[0][0] = "What is your project name?";
        questions[0][1] = "exams conducting portal";
        questions[0][2] = "online test management system";
        questions[0][3] = "online exam";
        questions[0][4] = "exams";

        questions[1][0] = "Where your college is located?";
        questions[1][1] = "Chennai";
        questions[1][2] = "Hyderabad";
        questions[1][3] = "Delhi";
        questions[1][4] = "Banglore";

        questions[2][0] = "Which Year you are from?";
        questions[2][1] = "3rd year";
        questions[2][2] = "4th year";
        questions[2][3] = "2nd year";
        questions[2][4] = "1st year";

        questions[3][0] = "Which department your are from?";
        questions[3][1] = "IT";
        questions[3][2] = "MECH";
        questions[3][3] = "CSE";
        questions[3][4] = "ECE";

        questions[4][0] = "Right now which semester is going on?";
        questions[4][1] = "2nd sem";
        questions[4][2] = "3rd sem";
        questions[4][3] = "4th sem";
        questions[4][4] = "5th sem";

        questions[5][0] = "Where is hyndhavi living in chennai?";
        questions[5][1] = "pg";
        questions[5][2] = "hostel";
        questions[5][3] = "rented room";
        questions[5][4] = "with family";

        questions[6][0] = "Which mobile hyndhavi is using?";
        questions[6][1] = "Samsung";
        questions[6][2] = "OnePlus";
        questions[6][3] = "redmi";
        questions[6][4] = "realme";

        questions[7][0] = "Hyndhavi's native place?";
        questions[7][1] = "Kadapa";
        questions[7][2] = "Proddatur";
        questions[7][3] = "Chennai";
        questions[7][4] = "Banglore";

        questions[8][0] = "Which school did hyndhavi studied?";
        questions[8][1] = "Sri Chaitanya school";
        questions[8][2] = "Queen mary's school";
        questions[8][3] = "Ravindra bharathi";
        questions[8][4] = "girls high school";

        questions[9][0] = "What kind of person hyndhavi is?";
        questions[9][1] = "All the above";
        questions[9][2] = "Saddist,uncared";
        questions[9][3] = "Lazy,waste fellow";
        questions[9][4] = "Betrayal,selfish";
        
        answers[0][1] = "online test management system";
        answers[1][1] = "Chennai";
        answers[2][1] = "3rd year";
        answers[3][1] = "CSE";
        answers[4][1] = "5th sem";
        answers[5][1] = "hostel";
        answers[6][1] = "Samsung";
        answers[7][1] = "Proddatur";
        answers[8][1] = "Sri Chaitanya school";
        answers[9][1] = "All the above";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170,520,700,30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170,560,700,30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170,600,700,30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170,640,700,30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200,40);
        next.setFont(new Font("Tahoma",Font.PLAIN,22));
        next.setBackground(new Color(30,144,255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        help = new JButton("50% help");
        help.setBounds(1100,630,200,40);
        help.setFont(new Font("Tahoma",Font.PLAIN,22));
        help.setBackground(new Color(30,144,255));
        help.setForeground(Color.WHITE);
        help.addActionListener(this);
        add(help);
        
        submit = new JButton("Submit");
        submit.setBounds(1100,710,200,40);
        submit.setFont(new Font("Tahoma",Font.PLAIN,22));
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);
        
        start(count);
       
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
           
            ans_given = 1;
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            }else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
                
            }
            count++;
            start(count);
        }else if(ae.getSource() == help){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else{
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            help.setEnabled(false);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(groupoptions.getSelection() == null){
                useranswers[count][0] = "";
            }else{
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            for(int i=0;i<useranswers.length;i++){
                if(useranswers[i][0].equals(answers[i][1])){
                    score +=10;
                }else{
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        
        String time = "Time left "+ timer + " seconds";
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        
        if(timer>0){
            g.drawString(time,1100,500);
        }else{
            g.drawString("Times up!!",1100,500);
        }
        
        timer--;
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer<0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
                
            }
            if(count == 9){
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                }else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                for(int i=0;i<useranswers.length;i++){
                    if(useranswers[i][0].equals(answers[i][1])){
                        score +=10;
                    }else{
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name,score);
            }else{
                
                if(groupoptions.getSelection() == null){
                    useranswers[count][0] = "";
                }else{
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
        
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) +". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String args[]){
        new Quiz("User");
    }
}
