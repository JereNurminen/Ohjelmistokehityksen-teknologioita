package com.jerenurminen.bookstore;

import com.jerenurminen.bookstore.domain.Book;
import com.jerenurminen.bookstore.util.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

@EnableJpaRepositories("com.jerenurminen.bookstore.util")
@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
}
