package MethodTesting;

import java.util.ArrayList;
import java.util.Collections;

public class Run {

	public static void main(String[] args) {
		  ArrayList<Book> bookList = new ArrayList<Book>();
	        bookList.add(new Book("�ڹ�������", 9000));
	        bookList.add(new Book("ȫ�浿��", 6000));
	        bookList.add(new Book("��ҿ� ����", 8000));
	        bookList.add(new Book("dfad",123123));
	        Collections.sort(bookList);
	        
	        for (Book book : bookList) {
	            System.out.println(book.getName()+":"+book.getPrice());
	            //��°�� (������ �������� ����)
	            //ȫ�浿��:6000
	            //��ҿ� ����:8000
	            //�ڹ�������:9000
	        }
	}

}
