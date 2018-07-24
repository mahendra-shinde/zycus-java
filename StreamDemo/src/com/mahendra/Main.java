package com.mahendra;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		BookDAO dao = new BookDAOImpl();
		dao.add(new Book(101,"Let Us C","Kanetkar",289F));
		dao.add(new Book(102,"Let Us C++","Kanetkar",320F));
		dao.add(new Book(103,"OOP using Java","Xyz",340F));
		dao.add(new Book(104,"Java Primer","Khalid",450F));
		
		Book book = dao.findOne((x)->x.getTitle().startsWith("Let Us"));
		System.out.println(book);
		
		List<Book> books = dao.findMany((x)->x.getAuthor().equalsIgnoreCase("kanetkar"));
		
		System.out.println("Kanetkar's books");
		for(Book x : books) {
			System.out.println(x);
		}
		

	}

}
