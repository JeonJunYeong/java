/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieproject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.*;
import java.io.*;
import javax.swing.plaf.ColorUIResource;
import sun.java2d.pipe.DrawImage;

public class adminsetting extends JFrame{

     
  
  
  class screensetting extends JFrame{
      
  }
  
  class moneyinfo extends JFrame{
      
  }
   
public static void main(String[] args)
{
    new moviesetting();
}
}
class moviesetting extends JFrame
{
       static int size=256;
      
      static int[][] inImage=new int[size][size];
      static int[][] outImage=new int[size][size];
      
       moviesetting() 
       {
          
           JPanel panel=new JPanel();
          JButton j=new JButton("dd");
           j.addMouseListener(new moviesettingbutton());
           setLayout(null);
           add(j);
           j.setBounds(30,600,30,30);
           setSize(500, 700);
           setVisible(true);
           panel.setBounds(30, 30, 300, 500);
       }
       void load()
           {
               JFileChooser fileChooser=new JFileChooser();
           fileChooser.setDialogTitle("포스터 불러오기");
           fileChooser.setFileFilter(new FileNameExtensionFilter("PNG File","png"));
           fileChooser.setMultiSelectionEnabled(false);
           
           int returnVa1=fileChooser.showOpenDialog(this);
           if(returnVa1==JFileChooser.APPROVE_OPTION)
           {
               try{
                   loadImage(fileChooser.getSelectedFile().toString());
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
           }
           DrawImage n=new DrawImage();
           }
     void loadImage(String path) throws Exception
           {
               File inFile=new File(path);
               
               FileInputStream inFileStream=new FileInputStream(inFile.getPath());
               
               for(int i=0;i<size;i++)
               {
                   for(int j=0;j<size;j++)
                   {
                       inImage[i][j]=inFileStream.read();
                       outImage[i][j]=inImage[i][j];
                   }
               }
               inFileStream.close();
              
             
           }
     class DrawImage extends JPanel
     {
         public void paintComponent(Graphics g)
         {
             super.paintComponent(g);
             int R,G,B;
             
             for(int i=0;i<size;i++)
             {
                 for(int j=0; j<size;j++)
                 {
                     R=G=B=(int)outImage[i][j];
                     
                     g.setColor(new Color(R,G,B));
                     g.drawRect(i, j,1, 1);
                 }
             }
         }
     }
      class moviesettingbutton implements MouseListener{
  
  

    
    public void mouseClicked(java.awt.event.MouseEvent e) {
       
    }

    
    public void mousePressed(java.awt.event.MouseEvent e) {
     load();
     
    }
    
   
  
    public void mouseReleased(java.awt.event.MouseEvent e) {
       
    }

   
    public void mouseEntered(java.awt.event.MouseEvent e) {
    }

    
    public void mouseExited(java.awt.event.MouseEvent e) {
    
    }
}
           
  }