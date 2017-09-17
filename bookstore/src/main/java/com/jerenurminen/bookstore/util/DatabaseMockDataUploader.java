package com.jerenurminen.bookstore.util;

import com.jerenurminen.bookstore.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseMockDataUploader implements CommandLineRunner{


    @Autowired
    private BookRepository repository;

    @Override
    public void run(String... strings) throws Exception {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Yksi", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Kaksi", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Kolme", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Neljä", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        repository.save(books);

    }

}
