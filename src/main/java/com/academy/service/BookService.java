package com.academy.service;

import com.academy.model.entity.Book;
import java.util.List;

public interface BookService {
  List<Book> getAll();

  Book getById(Integer id);

  void save(Book book);
}
