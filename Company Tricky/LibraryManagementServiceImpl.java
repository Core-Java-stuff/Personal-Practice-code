package com.sjgm.pro.crick;

import java.util.List;

public class LibraryManagementServiceImpl implements LibraryManagementService {

	private List<Author> authors = LibraryManagementDao.getInfo();

	@Override
	public Book getBookByISBN(int ISBN) {
		Book book1 = null;

		for (Author author : authors) {
			List<Book> books = author.getBooks();
			for (Book book : books) {
				if (book.getISBN() == ISBN) {
					book1 = book;
				}
			}
		}
		return book1;
	}

	@Override
	public Book getByName(String name) {
		Book book1 = null;
		for (Author author : authors) {
			List<Book> books = author.getBooks();
			for (Book book : books) {
				if (book.getBookName().equalsIgnoreCase(name)) {
					book1 = book;
				}
			}
		}
		return book1;
	}

	@Override
	public List<Book> getByAuthorName(String authorName) {
		List<Book> books = null;
		for (Author author : authors) {
			books = author.getAuthorName().equalsIgnoreCase(authorName) ? author
					.getBooks() : null;
		}
		return books;

	}

	@Override
	public Author getByBookName(String bookName) {
		Author author1 = null;
		for (Author author : authors) {
			List<Book> books = author.getBooks();
			for (Book book : books) {
				if (bookName.equalsIgnoreCase(book.getBookName())) {
					int authorId = book.getAuthorId();
					if (author.getAuthorId() == authorId) {
						author1 = author;
					}
				}
			}
		}
		return author1;
	}

}
