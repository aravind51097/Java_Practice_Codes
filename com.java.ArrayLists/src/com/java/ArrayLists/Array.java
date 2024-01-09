package com.java.ArrayLists;

import java.util.ArrayList;

import java.text.*;

import java.util.Locale;
class Book{
		
	private String title;
	private String author;
	private String ISBN;
	
	private static ArrayList<Book> book_collection=new ArrayList<Book>();
	
	public  Book(String title,String author, String ISBN) {
		
		this .title=title;
		this.author =author;
		this.ISBN=ISBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	
	public static void add_book(Book book) {
		book_collection.add(book);
		
	}
	
	public static void remove_book(Book book) {
		book_collection.remove(book);
	}
	
	public static ArrayList<Book> collection() {
		return book_collection;
	}
	
}



public class Array {
	
	public static void main(String[] args) {
		
		Book book1=new Book("Rich dad ","Robert","847398432949");
		
		Book.add_book(book1);
		
		
		 
		NumberFormat currency= NumberFormat.getCurrencyInstance();
		System.out.println(currency);
		
		ArrayList<Book> collection_book=Book.collection();
		
//		for(Book arr:collection_book) {
//			System.out.println(arr.getTitle());
//			
//		}
//		
		
//		for(int i =0;i<collection_book.size();i++) {
//			System.out.println(collection_book.get(i));
//		}
//		
		
		
		
		
	}

}
