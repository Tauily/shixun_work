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
	  this.setLayout(gridLayout);   //3�ֲ��ֹ�������
	  
	  JButton btnN=new JButton("north");
	  JButton btnS=new JButton("south");
	  JButton btnE=new JButton("east");
	  JButton btnW=new JButton("west");
	  JButton btnC=new JButton("center");
	  
					//	  
					//	//==== ����¼� ====
					//      btnN.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.BLUE);
					//          }
					//      });
					//    //==== ����¼� ====
					//      btnS.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.GRAY);
					//          }
					//      });
					//      //==== ����¼� ====
					//      btnE.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.GREEN);
					//          }
					//      });
					//      //==== ����¼� ====
					//      btnW.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.PINK);
					//          }
					//      });
					//      //==== ����¼� ====
					//      btnC.addActionListener(new ActionListener() {
					//          @Override
					//          public void actionPerformed(ActionEvent e) {
					//              JButton button = (JButton) e.getSource();
					//              button.setBackground(Color.YELLOW);
					//          }
					//      });
	     //�����¼������ʶ
	  btnN.setActionCommand("north");
      btnE.setActionCommand("east");
      btnW.setActionCommand("west");
      btnC.setActionCommand("center");
     
      // new һ���¼�����������ʵ�ֽӿ���ķ���
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
                   JOptionPane.showMessageDialog(Frame1.this,"��Һ�");
               } 
           }
       };
    //  ActionListenerImpl actionListener = new ActionListenerImpl();
      // ���¼�������������ӵ��¼�Դ(��ť)
      btnN.addActionListener(actionListener1);
	  btnS.addActionListener(actionListener1);
	  btnE.addActionListener(actionListener1);
	  btnW.addActionListener(actionListener1);
	  btnC.addActionListener(actionListener1);
	  // ����ť��ӵ���ǰ����
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
	  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������Ŀ�дΪ�κ�����
	  
	  
	  
      }
  
	  
  
  public static void main(String [] args) {
	   new Frame1();
  
  }
}
