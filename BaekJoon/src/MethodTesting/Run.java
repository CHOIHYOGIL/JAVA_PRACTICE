package MethodTesting;

import java.util.ArrayList;
import java.util.Collections;

public class Run {

	public static void main(String[] args) {
		  ArrayList<Book> bookList = new ArrayList<Book>();
	        bookList.add(new Book("자바의정석", 9000));
	        bookList.add(new Book("홍길동전", 6000));
	        bookList.add(new Book("김소월 시집", 8000));
	        bookList.add(new Book("dfad",123123));
	        Collections.sort(bookList);
	        
	        for (Book book : bookList) {
	            System.out.println(book.getName()+":"+book.getPrice());
	            //출력결과 (가격의 오름차순 정렬)
	            //홍길동전:6000
	            //김소월 시집:8000
	            //자바의정석:9000
	        }
	}

}
