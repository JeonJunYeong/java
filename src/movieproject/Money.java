/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Money extends JFrame{

    int n=0;
    int totalmoney=0;
    JLabel moneyinfo=new JLabel();
    
    public Money(){
        
        setLayout(null);
        moneyinfo.setText(n+"관 매출은"+totalmoney+"입니다");
        moneyinfo.setBounds(80,0,150,100);
        
        add(moneyinfo);
        setSize(300,150);
        setVisible(false);
    }

   
}
