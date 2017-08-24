package com.sjgm.pro.crick;

public class LibraryManagementSystem {
	public static void main(String[] args) {
		LibraryManagementService service = new LibraryManagementServiceImpl();
		System.out.println(service.getBookByISBN(999));
		System.out.println(service.getByName("jph"));
		System.out.println(service.getByAuthorName("PQR"));
		System.out.println(service.getByBookName("jph"));

	}
}
