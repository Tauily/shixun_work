package com.ui.project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jiaohu extends JFrame{
	
    private JPanel panel = new JPanel();   //���panel
   
    
    
    private JLabel labAcount=new JLabel("�˺�");
    private JLabel labPassword=new JLabel("����");
    
    private JTextField txtAcount=new JTextField();
    private JTextField txtPassword=new JTextField();
    
    private JButton btnReturn=new JButton("return");
    
	 public jiaohu(){
		 
		  this.setSize(500,350);
	        this.setTitle("LOGIN");
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setVisible(true);
	      

	        this.setContentPane(panel);
	        //��ʼ�����
	     

	     

	       
	        //��ʼ��panel������
	        panel.setLayout(new GridLayout(3,2));
	        panel.add(labAcount);
	        panel.add(txtAcount);
	        panel.add(labPassword);
	        panel.add(txtPassword);
	        
	        panel.add(btnReturn);
	        
	        setVisible(true);
	        
	        
	        btnReturn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
//	            	jiaohu.this.panel.remove(panel);
	                btnReturn.setVisible(true);
	                //�������������ʾ���������ı�����
	                JOptionPane.showMessageDialog(jiaohu.this,txtAcount.getText()+";"+txtPassword.getText());
	                jiaohu.this.panel.setVisible(false);
	                jiaohu.this.panel.setVisible(true);
	            }
	        });
      
	 }
	
	
	
	
	
	
	  public static void main(String[] args){
	        new jiaohu();

	    }	
}
