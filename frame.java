package com.ui.project;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.JFrame;

public class frame {  

	public static void main(String[] args) {
		
			JFrame frame=new JFrame();  // ��������
			frame.setTitle("FRAME"); // ͬ����һ����Ч������ӱ������ı��⣩
			frame.setSize(300, 200);//����Ĵ�Сwidth,height,ͬ��
			frame.setBounds(500,220,400,300);//�����λ�ã�x,yλ��,width,height��
			frame.setVisible(true);  //���ô���Ŀɼ���Ϊ��
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������Ŀ�дΪ�κ�����
	
	
	}

}
