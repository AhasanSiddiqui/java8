package com.ahasan.java8.beans;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private String name;
	private Set<String> book;

	public Student(String name, Set<String> book) {
		super();
		this.name = name;
		this.book = book;
	}

	public void addBook(String book) {
		if(this.book==null)
			this.book=new HashSet<String>();
		this.book.add(book);
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getBook() {
		return book;
	}

	public void setBook(Set<String> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", book=" + book + "]";
	}
}
