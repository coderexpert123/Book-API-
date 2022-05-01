package com.apicretion.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.apicretion.entities.book;

@Component
public class BookServices {

	private static List<book> list=new ArrayList<>();
	
	
	static {
		
		list.add( new book(11,"Java","Complete Gyan"));
		
		list.add( new book(12,"Solodity","Complete Gyan Solidity"));
		list.add( new book(13,"Rust","Complete Gyan Rust "));

	}
	
	//get book
	public List<book> getallbook(){
		
		
		return list;
		
	}
	
	public book getbookbyid(int id) {
		
		book bookssBook=null;
		bookssBook=list.stream().filter(e->e.getIdl()==id).findFirst().get();	
		return bookssBook;
		
	}
	
	public book addbook(book b) {
		
		list.add(b);
		return b;
		
	}
	
	public void delebook(int bid) {
		
		list=list.stream().filter(book->book.getIdl()!=bid)
		.collect(Collectors.toList());
	
	}
	
	
	public void updatebook(book book, int id) {
		
		
		list=list.stream().map(b->{
			
			if (b.getIdl()==id) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
				
				
			}
			return b;
			
			
		}).collect(Collectors.toList());
	}
 
}
