package com.mphasis.controller;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.mphasis.domain.Book;
import com.mphasis.service.BookService;



@RestController

public class BookConsumerController {
	
	@Autowired
	private BookService bookService;
	

	
	private static final Logger log = LoggerFactory.getLogger(BookConsumerController.class);
	
	@GetMapping("/get-books/{id}")
	public Book getBookById(@PathVariable Long id) {
		
		log.debug("In getBookById with id"+id);
		
		Book book = bookService.getBookById(id);
		return book;
	}
	

}
