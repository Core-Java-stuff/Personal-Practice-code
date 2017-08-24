package com.sjgm.pro.crick;

public class Book {
	private int bookId;
	private int ISBN;
	private String bookName;
	private int authorId;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, int iSBN, String bookName, int authorId) {
		super();
		this.bookId = bookId;
		ISBN = iSBN;
		this.bookName = bookName;
		this.authorId = authorId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", ISBN=" + ISBN + ", bookName="
				+ bookName + ", authorId=" + authorId + "]";
	}

}
