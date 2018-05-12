package com.sda.spring.demo;

import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	public BookRepository bookRespository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		Author author = new Author("Jan", "Kowalski");
		Category category = new Category("Lektury szkolne");

		Book book = new Book("Przygoda", author, category);
		bookRespository.save(book);

		author = new Author("Adam", "Mickiewicz");
		category = new Category("Lektury szkolne");

		book = new Book("Pan Tadeusz", author, category);
		bookRespository.save(book);
	}
}
