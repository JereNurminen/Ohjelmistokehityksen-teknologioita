package com.jerenurminen.bookstore.web;

import com.jerenurminen.bookstore.domain.Book;
import com.jerenurminen.bookstore.util.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTController {

    @Autowired
    private BookRepository repository;

    @RequestMapping(value = "/api/books")
    public List<Book> listAll() {
        return (List)repository.findAll();
    }

    @RequestMapping(value = "/api/books/{id}")
    public Book getBookById(@PathVariable long id) {
        return repository.findOne(id);
    }

}
