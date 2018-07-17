package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QDW_book {

//����
private Connection getConnection() {
	//��������
	try {
		Class.forName("com.mysql.jdbc.Driver");
		//�������ݿ������ַ���
		String dbURL="jdbc:mysql://localhost:3306/exam";
		//�������ݿ�����
		try {
			Connection connection=DriverManager.getConnection(dbURL,"root","123456");
			return connection;
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	return null;
}


//���
 private  void insertData(String book_name,String book_publishers,String book_author) {
        Connection connection=null;//�������ݿ�����
        Statement statement=null;
        try {
            connection=getConnection();
            String sql = "insert into book(book_name,book_publishers,book_author) values ('"+book_name+"','"+book_publishers+"','"+book_author+"')";
            statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println("�ѳɹ���ӣ�" + rows+"��¼");
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
	
 //�޸�
private void updateData(String book_name,String book_author){
    //
    Connection connection=null;
    Statement statement=null;
    try {
        connection=getConnection();
        String sql ="update account set book_name='"+book_name+"'  where book_author='"+book_author+"'";
        statement=connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println("���ѳɹ��޸ģ�" + rows+"����¼");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
	
//ɾ��
private void deleteData(String book_name){
   Connection connection=null;
   Statement statement=null;
   try {
       connection=getConnection();
       String sql ="delete from book where book_name='"+book_name+"'";
       statement=connection.createStatement();
       int rows = statement.executeUpdate(sql);
       System.out.println("���ѳɹ�ɾ����" + rows+"����¼");
   } catch (SQLException e) {
       e.printStackTrace();
   }
}


//��ѯ
private void selectData(){
 Connection connection=null;
 Statement statement=null;
 try {
     connection=getConnection();
     String sql ="select * from book";
     statement=connection.createStatement();
     int rows = statement.executeUpdate(sql);
     System.out.println("���ѳɹ���ѯ��" + rows+"����¼");
 } catch (SQLException e) {
     e.printStackTrace();
 }
}

//ģ����ѯ



public static void main(String[] args) {
	// TODO Auto-generated method stub
	QDW_book qdw=new QDW_book();
      qdw.getConnection();
      Scanner scanner=new Scanner(System.in);
  	while (true) {
  		System.out.println("          -----------�ض��ĵ��鼮ϵͳ---------");
  		System.out.println("                                           ");
  		System.out.println("          |----------------------------------|");
  		System.out.println("         |-----------1.����鼮---------------|");
  		System.out.println("         |-----------2.�޸�����---------------|");
  		System.out.println("         |-----------3.ɾ������---------------|");
  		System.out.println("         |-----------4.��ѯ�����鼮-----------|");
  		System.out.println("         |-----------5.ģ����ѯ---------------|");
  		System.out.println("         |-----------6.�˳�ϵͳ---------------|");
  		System.out.println("          |----------------------------------|");
  		System.out.println("                         ");
  		System.out.println("                         ");
  		System.out.println("                         ");
  		System.out.println("-------------���������ѡ��---------------");
  		int select=0;//��ʼ���û�ѡ��
  		select=scanner.nextInt();//�û���ѡ��
  		while(select<1 || select>6) {
  			System.out.println("������������������");
  			select=scanner.nextInt();
  		}
  		String value=null;
  		QDW_book qdw1=new QDW_book();
	  		if(select==1) {
	  			System.out.println("������Ҫ��ӵ��鼮���ƣ������̣��鼮���ߣ��ö��ŷָ���");
	  			value=scanner.next();
	  			String[] values=value.split(",");                                                                          
	  			qdw1.insertData(values[0],values[1], values[2]);
	  		}else if(select==2) {
	  			System.out.println("������Ҫ�޸ĵ����������������ߣ����������¡������ߡ���������");
	  			value = scanner.next();
	  		    String[] values = value.split(",");
	  		    qdw1.updateData(values[0], values[1]);
	  		}else if(select==3) {
	  			System.out.println("������Ҫɾ��������");
	  			value = scanner.next();
	  		    qdw1.deleteData(value);
	  		}else if(select==4) {
	  			System.out.println("���ڲ�ѯ���е��鼮");
	  		   qdw1.selectData();
	  		}else if(select==5) {
	  			System.out.println("ģ����ѯ");
	  			
	  		}else if(select==6) {
	  			System.out.println("�˳�ϵͳ");
	  			System.exit(-1);
	  		}
  	}
}

}
