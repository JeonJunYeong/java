
package movieproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

         

public class ChoiceFrame extends JFrame{
    Data d=new Data();
    JButton []ChoiceTime=new JButton[3];
    JLabel []time=new JLabel[3];
    JButton [][]seat=new JButton[5][2];
    
    JButton next=new JButton();
    
    
    
    JPanel arrow;//순서 화살표
    JPanel screen;//극장 스크린 

    total t=new total();
    
    ChoiceFrame() 
    {
        arrow=new JPanel();
        screen=new JPanel();
        
        setLayout(null);
        
        for(int i=0;i<3; i++)
        {
            ChoiceTime[i]=new JButton();
            ChoiceTime[i].setBounds(30+(i*140), 50, 90, 25);
            
            
            time[i]=new JLabel();
            time[i].setBounds(60+140*i, 80, 90, 25);
            time[i].setText("영화"+(i+1));
            add(ChoiceTime[i]);
            add(time[i]);
        }
        
      for(int i=0;i<5;i++)
      {
          for(int j=0;j<2;j++)
          {
              seat[i][j]=new JButton();
              seat[i][j].setBounds(55+i*70, 390+j*60, 35, 35);
              add(seat[i][j]);
              seat[i][j].addMouseListener(new Moneymouse());
          }
      }
       
       arrow.setBounds(170, 120, 90, 60);
       arrow.setBackground(Color.red);
        
       screen.setBounds(70, 210, 300, 150);
       screen.setBackground(Color.black);
        
       next.setBounds(160, 500, 100, 30);
     
       
        next.addMouseListener(new Moneymouse());
      add(next);
       add(arrow);
       add(screen);
       
        setTitle("영화 선택");
        setSize(450,600);
        setVisible(false);
   
        
    }
      class Moneymouse implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
    

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
}
      class Seatmouse implements MouseListener
      {
          
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
    t.setVisible(true);

    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
}
      
     
    
    class total extends JDialog
    {
        int n=0;
        JLabel basic=new JLabel("기본 :"+n);
        JLabel sale=new JLabel("할인 :"+n);
        JLabel total=new JLabel("합계 :"+n);
        public total()
        {
            
            setLayout(null);
            
            basic.setBounds(20, 20, 50, 50);
            sale.setBounds(20, 120, 50, 50);
            total.setBounds(20, 220, 50, 50);
            
            add(basic);
            add(sale);
            add(total);
            
            setSize(200,300);
            this.setModal(true);
            this.setVisible(false);
        }
    }

}

    

