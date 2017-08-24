package com.sjgm.pro.crick;

import java.util.List;

public interface LibraryManagementService {

	public Book getBookByISBN(int ISBN);

	public Book getByName(String name);

	public List<Book> getByAuthorName(String authorName);

	public Author getByBookName(String bookName);

}
