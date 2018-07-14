package com.ui.project;
//import java.awt.*;
import javax.swing.*;
//import javax.swing.JFrame;

public class frame {  

	public static void main(String[] args) {
		
			JFrame frame=new JFrame();  // 创建窗体
			frame.setTitle("FRAME"); // 同上面一样的效果（添加标题栏的标题）
			frame.setSize(300, 200);//窗体的大小width,height,同下
			frame.setBounds(500,220,400,300);//窗体的位置（x,y位置,width,height）
			frame.setVisible(true);  //设置窗体的可见性为是
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //括号里的可写为任何数字
	
	
	}

}
