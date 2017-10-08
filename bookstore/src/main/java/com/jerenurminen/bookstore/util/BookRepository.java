package com.jerenurminen.bookstore.util;

import com.jerenurminen.bookstore.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByIsbn(String isbn);
    List<Book> findByAuthor(String author);
    List<Book> findByTitle(String name);
    List<Book> findByYear(int year);

}
