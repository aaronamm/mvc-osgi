package com.test.web.jpa.client;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.jpa.model.Book;

/**
 * @author AritraChatterjee
 * 
 */
public interface BookInventory {

	@Transactional
	public void addBook(String bookName, String authorName);

	@Transactional(readOnly = true)
	public List<Book> viewBooks();

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public void addAuthor(String firstName, String lastName);
}
