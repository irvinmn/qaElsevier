package com.qa.models;



import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Book {
	
	@Id
	private int bookId;
	
	private String title;
	
	private String description;
	
	private String publisher;
	
	private String format;
	
	private String publishedDate;
	
	private int pageCount;
	
	public List<Author> getAuthors() {
		return authors;
	}

	@Autowired
	@ElementCollection
	private List<Author> authors;
	
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	private double price;
	
	private String paperISBN;
	
	private String eBookISBN;
	
	private String tableOfContents;
	
	
	private String bookImage;
	


	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}



	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPaperISBN() {
		return paperISBN;
	}

	public void setPaperISBN(String paperISBN) {
		this.paperISBN = paperISBN;
	}

	public String geteBookISBN() {
		return eBookISBN;
	}

	public void seteBookISBN(String eBookISBN) {
		this.eBookISBN = eBookISBN;
	}

	public String getTableOfContents() {
		return tableOfContents;
	}

	public void setTableOfContents(String tableOfContents) {
		this.tableOfContents = tableOfContents;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}
	
	
	
}
