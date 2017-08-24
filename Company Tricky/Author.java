package com.sjgm.pro.crick;

import java.util.List;

public class Author {
	private int authorId;
	private String authorName;
	private List<Book> books;

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Author(int authorId, String authorName, List<Book> books) {
		super();
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName
				+ ", books=" + books + "]";
	}

}
