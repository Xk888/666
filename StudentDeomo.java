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
	System.out.print("�û���ϢΪ\n");
	System.out.print("�˺�Ϊ��  "+name+         "����Ϊ��   "+age);
}
public void showdata1() {
	 System.out.print("        ���Ӱ�ǵ�½ϵͳ \n");
		System.out.print("1:�鿴�û���Ϣ                  2:ѡ������ĵ�Ӱ  \n");
		System.out.print("3:�Ż�ȯ�����       4:������ס      0:�˳�        \n");
		System.out.print("************************* \n");
			System.out.println("����������");
}
public void ck() {
	Scanner in=new Scanner(System.in);
	System.out.print("����������");
	 w=in.nextInt();
}
////////////////////////////////////////////////////////////////
public void sr() {
	Scanner in=new Scanner(System.in);
	System.out.print("�������˺�");
	name=in.nextLine();
	System.out.print("����������");
	age=in.nextInt();
	System.out.print("��½�ɹ�");
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

	        		System.out.print("        ���Ӱ��ӰƬ�ϼ� \n");

	    			System.out.print("1:����֮��                  2:�ս���6  \n");

	    			System.out.print("3:��ѩ��Ե2      4:è������      0:�˳�        \n");

	    			System.out.print("************************* \n");
		        	   t.ck();
		        	 if(t.w==1)
		        		  t.showdata1();
	            System.out.println(""); break;
	         case 3:
	            System.out.println("�Ż�ȯ�Ѿ�������");break;
	         case 4:
		            System.out.println("��ӭ���ĵ���"); break;
	         default:
	            System.out.println("default"); break;
	      } 
	      System.out.print("��������1�����ɼ����������1�����������˳�");
	      t.showdata1();
	      t.ck();

	   } while(t.w==1);
		  System.out.println("һ·˳��");
			}}

	

	



	

	



	

	

	

	





	











		

	 