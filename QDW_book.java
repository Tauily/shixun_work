package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QDW_book {

//连接
private Connection getConnection() {
	//加载驱动
	try {
		Class.forName("com.mysql.jdbc.Driver");
		//创建数据库连接字符串
		String dbURL="jdbc:mysql://localhost:3306/exam";
		//建立数据库连接
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


//添加
 private  void insertData(String book_name,String book_publishers,String book_author) {
        Connection connection=null;//创建数据库链接
        Statement statement=null;
        try {
            connection=getConnection();
            String sql = "insert into book(book_name,book_publishers,book_author) values ('"+book_name+"','"+book_publishers+"','"+book_author+"')";
            statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            System.out.println("已成功添加：" + rows+"记录");
        } catch (SQLException e) {
            e.printStackTrace();
        }
}
	
 //修改
private void updateData(String book_name,String book_author){
    //
    Connection connection=null;
    Statement statement=null;
    try {
        connection=getConnection();
        String sql ="update account set book_name='"+book_name+"'  where book_author='"+book_author+"'";
        statement=connection.createStatement();
        int rows = statement.executeUpdate(sql);
        System.out.println("你已成功修改：" + rows+"条记录");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
	
//删除
private void deleteData(String book_name){
   Connection connection=null;
   Statement statement=null;
   try {
       connection=getConnection();
       String sql ="delete from book where book_name='"+book_name+"'";
       statement=connection.createStatement();
       int rows = statement.executeUpdate(sql);
       System.out.println("你已成功删除：" + rows+"条记录");
   } catch (SQLException e) {
       e.printStackTrace();
   }
}


//查询
private void selectData(){
 Connection connection=null;
 Statement statement=null;
 try {
     connection=getConnection();
     String sql ="select * from book";
     statement=connection.createStatement();
     int rows = statement.executeUpdate(sql);
     System.out.println("你已成功查询：" + rows+"条记录");
 } catch (SQLException e) {
     e.printStackTrace();
 }
}

//模糊查询



public static void main(String[] args) {
	// TODO Auto-generated method stub
	QDW_book qdw=new QDW_book();
      qdw.getConnection();
      Scanner scanner=new Scanner(System.in);
  	while (true) {
  		System.out.println("          -----------秦东文的书籍系统---------");
  		System.out.println("                                           ");
  		System.out.println("          |----------------------------------|");
  		System.out.println("         |-----------1.添加书籍---------------|");
  		System.out.println("         |-----------2.修改数据---------------|");
  		System.out.println("         |-----------3.删除数据---------------|");
  		System.out.println("         |-----------4.查询所有书籍-----------|");
  		System.out.println("         |-----------5.模糊查询---------------|");
  		System.out.println("         |-----------6.退出系统---------------|");
  		System.out.println("          |----------------------------------|");
  		System.out.println("                         ");
  		System.out.println("                         ");
  		System.out.println("                         ");
  		System.out.println("-------------请输入你的选择---------------");
  		int select=0;//初始化用户选项
  		select=scanner.nextInt();//用户的选项
  		while(select<1 || select>6) {
  			System.out.println("输入有误，请重新输入");
  			select=scanner.nextInt();
  		}
  		String value=null;
  		QDW_book qdw1=new QDW_book();
	  		if(select==1) {
	  			System.out.println("请输入要添加的书籍名称，出版商，书籍作者（用逗号分隔）");
	  			value=scanner.next();
	  			String[] values=value.split(",");                                                                          
	  			qdw1.insertData(values[0],values[1], values[2]);
	  		}else if(select==2) {
	  			System.out.println("请输入要修改的书名，条件是作者（书名【更新】，作者【条件】）");
	  			value = scanner.next();
	  		    String[] values = value.split(",");
	  		    qdw1.updateData(values[0], values[1]);
	  		}else if(select==3) {
	  			System.out.println("请输入要删除的书名");
	  			value = scanner.next();
	  		    qdw1.deleteData(value);
	  		}else if(select==4) {
	  			System.out.println("正在查询所有的书籍");
	  		   qdw1.selectData();
	  		}else if(select==5) {
	  			System.out.println("模糊查询");
	  			
	  		}else if(select==6) {
	  			System.out.println("退出系统");
	  			System.exit(-1);
	  		}
  	}
}

}
