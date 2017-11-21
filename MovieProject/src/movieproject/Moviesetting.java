/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Moviesetting extends  JFrame{

    JPanel image=new JPanel();
    JButton set=new JButton("불러오기");
    JButton save=new JButton("저장");
    JButton cancel=new JButton("취소");
    JButton savebutton[]=new JButton[3];
    JLabel MovieInfo=new JLabel("영화 제목");
    JLabel Movietime=new JLabel("상영 시간");
    JLabel Movieday=new JLabel("개봉일"); 
    JTextField infotext=new JTextField();
    JTextField timetext=new JTextField();
    JTextField daytext=new JTextField();
    Moviedata data=new Moviedata();
    Moviesetting()
   {
       
       setLayout(null);
              image.setBackground(Color.black);
              image.setBounds(30,30,200,350);
              
              set.setBounds(60,400,130,30);
              
              MovieInfo.setBounds(240, 50, 80, 50);
              infotext.setBounds(240,100,100,25);
              
              Movietime.setBounds(240, 150, 80, 50);
              timetext.setBounds(240, 200, 100, 25);
              
              Movieday.setBounds(240, 250, 80, 50);
              daytext.setBounds(240, 300, 100, 25);
              
              save.setBounds(240, 400, 60, 25);
              cancel.setBounds(335, 400, 60, 25);
              
            data.Moviename=infotext.getText();
            data.Movietime=timetext.getText();
            data.Movieday=daytext.getText();

              
            for(int i=0;i<3;i++)
            {
                savebutton[i]=new JButton("저장");
                
                savebutton[i].setBounds(345, 100+100*i, 60, 25);
                add(savebutton[i]);
            }
            
            
              
              add(save);
              add(cancel);
              add(image);
              add(set);
              add(MovieInfo);
              add(Movietime);
              add(Movieday);
              
              add(infotext);
              add(timetext);
              add(daytext);
              
            
              
              
              setSize(430,500);
              setVisible(false);
   }
    public static void main(String args[])
    {
        new Moviesetting();
    }

}
