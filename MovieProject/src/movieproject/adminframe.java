/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class adminframe extends JFrame {

    JLabel label[]=new JLabel[3];
    
    JButton movie[]=new JButton[3];
    JButton money[]=new JButton[3];
    JButton screen[]=new JButton[3];
    
    
    
    Moviesetting Movie_setting[]=new Moviesetting[3];
    Screensetting Screen_stting[]=new Screensetting[3];
    Money infomoney[]=new Money[3];
    
     adminframe() {
        
         setLayout(null);
         
         for(int i=0;i<3;i++)
         {
             label[i]=new JLabel((i+1)+"관");
             label[i].setBounds(90+180*i, 10, 130, 130);
             add(label[i]);
             
             movie[i]=new JButton("영화 정보");
             movie[i].setBounds(50+i*180, 100, 110, 110);
             add(movie[i]);
             
             screen[i]=new JButton("상영관 정보");
             screen[i].setBounds(50+i*180, 250, 110, 110);
             add(screen[i]);
             
             money[i]=new JButton("매출 정보");
             money[i].setBounds(50+i*180, 390, 110, 110);
             add(money[i]);
             
             Movie_setting[i]=new Moviesetting();
             Screen_stting[i]=new Screensetting();
             infomoney[i]=new Money();
         }
     
        movie[0].addMouseListener(new moviebutton0());
        movie[1].addMouseListener(new moviebutton1());
        movie[2].addMouseListener(new moviebutton2());
         
        screen[0].addMouseListener(new screenbutton0());
        screen[1].addMouseListener(new screenbutton1());
        screen[2].addMouseListener(new screenbutton2());
        
        money[0].addMouseListener(new moneybutton0());
        money[1].addMouseListener(new moneybutton1());
        money[2].addMouseListener(new moneybutton2());
         setSize(600,600);
         setVisible(false);
           setLocationRelativeTo(null);
         
         
    }
              
      class moviebutton0 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Movie_setting[0].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
   
   

     

}

       class moviebutton1 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Movie_setting[1].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
}
       
       class moviebutton2 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Movie_setting[2].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }


        }
        
       class screenbutton0 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Screen_stting[0].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
       
       class screenbutton1 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Screen_stting[1].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
         
       class screenbutton2 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   Screen_stting[2].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
               
       class moneybutton0 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
   infomoney[0].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
           class moneybutton1 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
  infomoney[1].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
             class moneybutton2 implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
  infomoney[2].setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

         }
        public static void main(String args[])
        {
            new adminframe();
        }
}