package com.ui.project;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;

public class Frame1 extends JFrame {
  public Frame1() {
	
	 // this.setSize(400,300);
	  this.setBounds(500,220,400,300);
	  this.setTitle("FRAME");
	  
	 // FlowLayout FlowLayout=new FlowLayout();
	  GridLayout gridLayout=new GridLayout(3,2);
	  this.setLayout(gridLayout);   //3种布局管理器·
	  
	  JButton btnN=new JButton("north");
	  JButton btnS=new JButton("south");
	  JButton btnE=new JButton("east");
	  JButton btnW=new JButton("west");
	  JButton btnC=new JButton("center");
	  
					//	  
					//	//==== 添加事件 ====
					//      btnN.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.BLUE);
					//          }
					//      });
					//    //==== 添加事件 ====
					//      btnS.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.GRAY);
					//          }
					//      });
					//      //==== 添加事件 ====
					//      btnE.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.GREEN);
					//          }
					//      });
					//      //==== 添加事件 ====
					//      btnW.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.PINK);
					//          }
					//      });
					//      //==== 添加事件 ====
					//      btnC.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.YELLOW);
					//          }
					//      });
	     //设置事件命令标识
	  btnN.setActionCommand("north");
      btnE.setActionCommand("east");
      btnW.setActionCommand("west");
      btnC.setActionCommand("center");
     
      // new 一个事件监听器对象。实现接口里的方法
      ActionListener actionListener1 = new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String command = e.getActionCommand();
               JButton button = (JButton) e.getSource();
               if(command.equals("north")) {
            	   button.setBackground(Color.ORANGE);
               } else if(command.equals("south")) {
                   button.setBackground(Color.pink); 
               } else if(command.equals("east")) {
                   button.setBackground(Color.BLUE);
               } else if(command.equals("west")) {
                   button.setForeground(Color.red);
               } else if(command.equals("center")) {
                   JOptionPane.showMessageDialog(Frame1.this,"大家好");
               } 
           }
       };
    //  ActionListenerImpl actionListener = new ActionListenerImpl();
      // 将事件监听器对象添加到事件源(按钮)
      btnN.addActionListener(actionListener1);
	  btnS.addActionListener(actionListener1);
	  btnE.addActionListener(actionListener1);
	  btnW.addActionListener(actionListener1);
	  btnC.addActionListener(actionListener1);
	  // 将按钮添加到当前窗体
      this.add(btnN);
      this.add(btnS);
      this.add(btnE);
      this.add(btnW);
      this.add(btnC);
      
//	  this.add(btnN,BorderLayout.NORTH);
//	  this.add(btnS,BorderLayout.SOUTH);
//	  this.add(btnE,BorderLayout.EAST);
//	  this.add(btnW,BorderLayout.WEST);
//	  this.add(btnC,BorderLayout.CENTER);
//	  
	  setVisible(true);
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //括号里的可写为任何数字
	  
	  
	  
      }
  
	  
  
  public static void main(String [] args) {
	   new Frame1();
  
  }
}
