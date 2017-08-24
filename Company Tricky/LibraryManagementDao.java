package com.sjgm.pro.crick;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementDao {

	public static List<Author> getInfo() {
		List<Author> authors = new ArrayList<Author>();
		List<Book> books1 = new ArrayList<>();
		Author author = new Author();
		author.setAuthorId(54374);
		author.setAuthorName("XYZ");
		books1.add(new Book(11, 246, "abc", author.getAuthorId()));
		books1.add(new Book(17, 999, "jph", author.getAuthorId()));
		author.setBooks(books1);
		authors.add(author);
		Author author1 = new Author();
		List<Book> books2 = new ArrayList<>();
		author1.setAuthorId(989078);
		author1.setAuthorName("PQR");
		books2.add(new Book(101, 156, "MBD", author1.getAuthorId()));
		books2.add(new Book(109, 432, "TBW", author1.getAuthorId()));
		author1.setBooks(books2);
		authors.add(author1);
		return authors;
	}
}
