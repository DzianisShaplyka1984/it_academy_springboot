package com.academy.controller;

import com.academy.service.AuthorService;
import com.academy.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
