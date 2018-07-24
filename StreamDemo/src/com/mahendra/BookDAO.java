package com.mahendra;

import java.util.List;
import java.util.function.Predicate;

public interface BookDAO {
	void add(Book book);
	Book findOne(Predicate<Book> condition);
	List<Book> findMany(Predicate<Book> condition);
}
