package com.nagarro.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.entities.Book;
import com.nagarro.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		repository.findAll().forEach(books::add);
		return books;
	}
	
	public Book addBook(Book book) {
		return repository.save(book);
	}

	public void deleteBookById(int id) {
		repository.deleteById(id);
	}

	public Book updateBook(Book book, int id) {
		Book updatedBook = repository.save(book);
		return updatedBook;
	}

	public Book getBookById(int id) {
		Optional<Book> book = repository.findById(id);
		return book.get();
	}

}
