package com.nagarro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entities.Book;
import com.nagarro.service.BookService;

@RestController
@ResponseBody
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	@GetMapping
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@GetMapping(path="/book/{id}")
	public Book getBookById(@PathVariable int id) {
		return bookService.getBookById(id);
	}

	@PostMapping(path="/books")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		bookService.deleteBookById(id);
		return "Book Deleted Successfully ";
	}

	@PutMapping(path="/addBooks/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable int id) {
		bookService.updateBook(book, id);
	}
}
