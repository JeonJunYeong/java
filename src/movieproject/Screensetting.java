/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Screensetting extends JFrame{  
        
    JPanel screen=new JPanel();
    
    JLabel time1=new JLabel("첫번째 상영시간");
    JLabel time2=new JLabel("두번째 상영시간");
    JLabel time3=new JLabel("세번째 상영시간");
    JTextField timesetting1=new JTextField();
    JTextField timesetting2=new JTextField();
    JTextField timesetting3=new JTextField();
    JButton btnsetting1=new JButton("설정");
    JButton btnsetting2=new JButton("설정");
    JButton btnsetting3=new JButton("설정");
    
    Screensetting()
    {
        setLayout(null);
         
        screen.setBounds(100, 30, 300, 250);
        screen.setBackground(Color.black);
        
       time1.setBounds(30, 330, 150, 30);
       time2.setBounds(200,330,150,30);
       time3.setBounds(370, 330, 150, 30);
       
       timesetting1.setBounds(30, 370, 60, 27);
       timesetting2.setBounds(200,370,60,27);
       timesetting3.setBounds(370, 370, 60, 27);
       
       btnsetting1.setBounds(93,370,60,25);
       btnsetting2.setBounds(263, 370, 60, 25);
       btnsetting3.setBounds(433, 370, 60, 25);
       
       add(btnsetting1);
       add(btnsetting2);
        add(btnsetting3);
       add(timesetting1);
       add(timesetting2);
       add(timesetting3);
       add(screen);
       add(time1);
       add(time2);
       add(time3);
       
        setSize(550,500);
        setVisible(false);
    }
    
    public static void main(String []args)
    {
        new Screensetting();
               
    }
}
