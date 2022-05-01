package com.apicretion.entities;

import com.fasterxml.jackson.databind.util.Named;

public class book {

	
private int idl;
private String title;
private String author;
public book() {
	super();
	// TODO Auto-generated constructor stub
}
public book(int idl, String title, String author) {
	super();
	this.idl = idl;
	this.title = title;
	this.author = author;
}
public int getIdl() {
	return idl;
}                                                
public void setIdl(int idl) {
	this.idl = idl;
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



}
