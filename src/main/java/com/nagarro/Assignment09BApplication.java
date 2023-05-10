package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import com.nagarro.entities.Book;
import com.nagarro.repository.BookRepository;

@SpringBootApplication
public class Assignment09BApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Assignment09BApplication.class, args);
		@SuppressWarnings("unused")
		BookRepository repository = context.getBean(BookRepository.class);

	}

}
