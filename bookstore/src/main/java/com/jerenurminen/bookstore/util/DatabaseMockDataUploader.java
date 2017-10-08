package com.jerenurminen.bookstore.util;

import com.jerenurminen.bookstore.domain.Book;
import com.jerenurminen.bookstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseMockDataUploader implements CommandLineRunner{


    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        List<Book> books = new ArrayList<>();
        books.add(new Book("Yksi", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Kaksi", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Kolme", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        books.add(new Book("Neljä", "Kirjailija", "978-951-98548-9-2978-951-98548-9-2", 19.90, 1937));
        bookRepository.save(books);

        List<User> users = new ArrayList<>();
        users.add(new User("Admin", "admin@email.com", encoder.encode("adminpass"), "ADMIN"));
        users.add(new User("User1", "user.one@email.com", encoder.encode("user1pass"), "USER"));
        users.add(new User("User2", "user.two@email.com", encoder.encode("user2pass"), "USER"));
        users.add(new User("User3", "user.three@email.com", encoder.encode("user3pass"), "USER"));
        userRepository.save(users);

    }

}
