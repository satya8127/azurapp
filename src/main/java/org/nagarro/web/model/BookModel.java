package org.nagarro.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookModel {

	@Id
	private int bookCode;
	private String bookName;
	private String bookAuthor;
	private String dateTime;
	
//	public BookModel() {
//
//	}

//	public BookModel(int bookCode, String bookName, String bookAuthor, String dateTime) {
//		this.bookCode = bookCode;
//		this.bookName = bookName;
//		this.bookAuthor = bookAuthor;
//		this.dateTime = dateTime;
//	}
//
//	public int getBookCode() {
//		return bookCode;
//	}
//
//	public void setBookCode(int bookCode) {
//		this.bookCode = bookCode;
//	}
//
//	public String getBookName() {
//		return bookName;
//	}
//
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//
//	public String getBookAuthor() {
//		return bookAuthor;
//	}
//
//	public void setBookAuthor(String bookAuthor) {
//		this.bookAuthor = bookAuthor;
//	}
//
//	public String getDateTime() {
//		return dateTime;
//	}
//
//	public void setDateTime(String dateTime) {
//		this.dateTime = dateTime;
//	}
//
//	@Override
//	public String toString() {
//		return "BookModel [bookCode=" + bookCode + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
//				+ ", dateTime=" + dateTime + "]";
//	}
//
}