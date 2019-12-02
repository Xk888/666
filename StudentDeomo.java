package h;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
class Teacher{
	String name;
	static int age,age1,w;
	public Teacher(){}
	public Teacher(String name,int age) {this.name=name;this.age=age;}
	

	//////////////////////////////////////////////////////////////////

public void WriteData() {

	DataOutputStream s=null;

	try {

	s=new DataOutputStream(
			new FileOutputStream("c:\\javadata\\a1.txt",true));	
	}catch(FileNotFoundException e) {}
try {

	if(s!=null) {
	s.writeInt(age);
	}}catch(IOException e) {}
	finally {
	if(s!=null)
		try {
		s.close();
		}catch(IOException e) {}
	}
	}
	//////////////////////////////////////////////////////////////////
public void readData() throws IOException{
	
	DataInputStream s=null;
	try {
		s=new DataInputStream(
				new FileInputStream("c:\\javadata\\a2.txt"));
	}catch(FileNotFoundException e) {
	}
	try {

		while(true) {

			//name=s.readUTF();

			age1=s.readInt();

			//showdata();

		
		}

	}catch(EOFException e) {}
	finally {
	if(s!=null)
		try {
			s.close();
		}catch(IOException e) {}
	}
	}
	////////////////////////////////////////////////////////////
public void showdata() {
	System.out.print("用户信息为\n");
	System.out.print("账号为：  "+name+         "密码为：   "+age);
}
public void showdata1() {
	 System.out.print("        万达影城登陆系统 \n");
		System.out.print("1:查看用户信息                  2:选择最近的电影  \n");
		System.out.print("3:优惠券免费领       4:新人入住      0:退出        \n");
		System.out.print("************************* \n");
			System.out.println("请输入数字");
}
public void ck() {
	Scanner in=new Scanner(System.in);
	System.out.print("请输入数字");
	 w=in.nextInt();
}
////////////////////////////////////////////////////////////////
public void sr() {
	Scanner in=new Scanner(System.in);
	System.out.print("请输入账号");
	name=in.nextLine();
	System.out.print("请输入密码");
	age=in.nextInt();
	System.out.print("登陆成功");
}}
public class StudentDeomo {
	   public static void main(String args[]) throws IOException{
		   Teacher t=new Teacher();
		   t.sr();
			t.WriteData();
			t.readData();
		  t.showdata1();
		  do {
	  			Scanner in=new Scanner(System.in);
	  			int i=in.nextInt();
	      switch(i){
	         case 0:
	        	 break;
	         case 1:
	        	 t.showdata();
	          break;

	         case 2:

	        		System.out.print("        万达影城影片合集 \n");

	    			System.out.print("1:天气之子                  2:终结者6  \n");

	    			System.out.print("3:冰雪奇缘2      4:猫和老鼠      0:退出        \n");

	    			System.out.print("************************* \n");
		        	   t.ck();
		        	 if(t.w==1)
		        		  t.showdata1();
	            System.out.println(""); break;
	         case 3:
	            System.out.println("优惠券已经被领完");break;
	         case 4:
		            System.out.println("欢迎您的到来"); break;
	         default:
	            System.out.println("default"); break;
	      } 
	      System.out.print("输入数字1，即可继续，输入除1的任意数就退出");
	      t.showdata1();
	      t.ck();

	   } while(t.w==1);
		  System.out.println("一路顺风");
			}}

	

	



	

	



	

	

	

	





	











		

	 