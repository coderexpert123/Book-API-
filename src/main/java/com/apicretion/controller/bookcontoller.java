package com.apicretion.controller;
 

import java.util.List;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apicretion.entities.book;
import com.apicretion.services.BookServices;

@RestController
public class bookcontoller {

	@Autowired
	private BookServices bookServices;
	
	// Get Request 
	@GetMapping("/books")
 
	public List<book> getBook() {
		
	return this.bookServices.getallbook();
		
	}
	
	// Get Request by ID
	 @GetMapping("/books/{id}")
	public book getbookbyid(@PathVariable("id") int id) {
		 return this.bookServices.getbookbyid(id);	 
	}
	
	 // create book
	 @PostMapping("/books")
	 public book updatebbok(@RequestBody book book) {
	  	book b = this.bookServices.addbook(book);
		return b;
		
	 }
	 
	 // Delete book
	 @DeleteMapping("/books/{id}")
	 public void deletebook(@PathVariable("id") int id) {
		 
		 
		this.bookServices.delebook(id);
		
	 }
	 
	 //update book
	 @PutMapping("/books/{id}")
	 public book updatebook(@RequestBody book book,
			 @PathVariable("id") int id) {
		 
		 this.bookServices.updatebook(book,id);
		 return book;
		 
		 
	 }
}
