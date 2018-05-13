package com.sda.spring.demo;

import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	public BookRepository bookRespository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
/*
		Set<Author> authors = new HashSet<Author>();
		authors.add(new Author("Jan", "Kowalski"));
		authors.add(new Author("Zbigniew", "Nowak"));
		Category category = new Category("Lektury szkolne");

		Book book = new Book("Przygoda", "987-123-123-1", authors, category);
		bookRespository.save(book);

		authors.clear();
		authors.add(new Author("Adam", "Mickiewicz"));
*/

/*
		//category = new Category("Lektury szkolne");

		book = new Book("Pan Tadeusz", "987-123-546-1", authors, category);
		bookRespository.save(book);
*/
	}
}
