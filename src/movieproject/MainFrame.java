
package movieproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MainFrame extends JFrame{
    
   
    
    JButton button4;
    JPanel [] panel=new JPanel[3];
    JButton[] button=new JButton[3];
    ChoiceFrame f[]=new ChoiceFrame[3];
    adminframe ad=new adminframe();
    MainFrame()  {
         
       
         
         
        
         button4=new JButton("관리자");
       
        
                setLayout(null);
       
       
        for(int i=0;i<3;i++)
        {   panel[i]=new JPanel();
            panel[i].setBounds(30+(330*i),10,200,450);
            add(panel[i]);
            f[i]=new ChoiceFrame();
            
            button[i]=new JButton("영화"+(i+1));
            button[i].setBounds(80+270*i, 500, 100, 30);
            add(button[i]);
        }
        
        button4.setBounds(920, 470, 80, 80);
         button[0].addMouseListener(new MyMouseListener1());
        button[1].addMouseListener(new MyMouseListener2());
        button[2].addMouseListener(new MyMouseListener3());
        button4.addMouseListener(new MyMouseListener4());
        
         
         
       
         add(button4);
        
    
       
         setSize(1020,600);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLocationRelativeTo(null);
         
    }
    
 
  class MyMouseListener1 implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
      
      f[0].setVisible(true);
    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
}
  class MyMouseListener2 implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
    
      f[1].setVisible(true);
    }
    
     public void mousePressed1(java.awt.event.MouseEvent e) {
      ChoiceFrame f=new ChoiceFrame();
      f.setVisible(true);
    }
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

    

}
  class MyMouseListener3 implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
     
      f[2].setVisible(true);
    }
    
    
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

  }
  class MyMouseListener4 implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
     ad.setVisible(true);
    }
    
    
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }

  }

}
