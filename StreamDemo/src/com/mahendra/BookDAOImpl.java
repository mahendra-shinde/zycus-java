package com.mahendra;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BookDAOImpl implements BookDAO {
private LinkedList<Book> bookList=new LinkedList<>();
	@Override
	public void add(Book book) {
		bookList.add(book);
	}

	@Override
	public Book findOne(Predicate<Book> condition) {
		return bookList.stream().filter(condition).findFirst().get();
	}

	@Override
	public List<Book> findMany(Predicate<Book> condition) {
		return bookList.stream().filter(condition).collect(Collectors.toList());
	}

}
