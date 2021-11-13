package com.academy.controller;

import com.academy.dto.BookDto;
import com.academy.model.entity.Book;
import com.academy.service.AuthorService;
import com.academy.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class BookController {

  private final BookService bookService;
  private final AuthorService authorService;

  @GetMapping(value = "/books")
  public String books(Model model) {
    var books = bookService.getAll();
    var authors = authorService.getAll();

    model.addAttribute("books", books);
    return "books";
  }

  @GetMapping(value = "/book")
  public String book(@RequestParam Integer id, Model model) {
    var book = bookService.getById(id);

    model.addAttribute("book", book);
    return "bookDetails";
  }

  @GetMapping(value="/showCreateBook")
  public String showCreateBook(Model model) {

    model.addAttribute("book", new BookDto());
    return "createBook";
  }

  @GetMapping(value="/createBook")
  public String createBook(@RequestParam String title, @RequestParam Integer year, Model model) {
    var book = Book.builder().title(title).year(year).build();

    bookService.save(book);

    var books = bookService.getAll();

    model.addAttribute("books", books);
    return "books";
  }

  @PostMapping(value="/createBook")
  public String createBookObject(@ModelAttribute("book") BookDto bookDto, Model model) {
    var book = Book.builder().title(bookDto.getTitle()).year(bookDto.getYear()).build();

    bookService.save(book);

    var books = bookService.getAll();

    model.addAttribute("books", books);
    return "books";
  }

  @PostMapping(value="/{id}/createBook")
  public String createBookRequestBody(@PathVariable Integer id, @RequestBody BookDto bookDto, Model model) {
    var book = Book.builder().title(bookDto.getTitle()).year(bookDto.getYear()).build();

    bookService.save(book);

    var books = bookService.getAll();

    model.addAttribute("books", books);
    return "books";
  }
}
