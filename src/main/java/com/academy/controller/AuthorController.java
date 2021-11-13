package com.academy.controller;

import com.academy.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthorController {

  @Autowired
  private AuthorService authorService;

  @GetMapping(value = "/authors")
  public String authors(Model model) {
    var authors = authorService.getAll();

    model.addAttribute("authors", authors);
    return "authors";
  }

  @GetMapping(value = "/author")
  public String author(@RequestParam(value = "id") Integer authorId, Model model) {
    var author = authorService.getById(authorId);

    model.addAttribute("author", author);
    return "authorDetails";
  }
}
