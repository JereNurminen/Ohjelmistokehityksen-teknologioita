package com.jerenurminen.bookstore.web;

import com.jerenurminen.bookstore.domain.Book;
import com.jerenurminen.bookstore.util.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

    @Autowired
    private BookRepository repository;

    @RequestMapping(value = "/")
    public String index(Model model) {
        return "";
    }

    @RequestMapping(value = "/booklist")
    public String booklist(Model model, Book newBook) {
        model.addAttribute("books", repository.findAll());
        model.addAttribute("newBook", new Book());
        return "booklist";
    }

    @RequestMapping(value = "/booklist/delete/{id}")
    public String delete(@PathVariable long id) {
        repository.delete(id);
        return "redirect:/booklist";
    }

    @RequestMapping(value = "/booklist/add", method = RequestMethod.POST)
    public String add(Book newBook) {
        repository.save(newBook);
        return "redirect:/booklist";
    }

}
