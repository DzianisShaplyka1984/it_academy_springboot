package com.academy.service.impl;

import com.academy.model.repository.BookRepository;
import com.academy.model.entity.Book;
import com.academy.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

  @Autowired
  private BookRepository bookRepository;
  @Override
  public List<Book> getAll() {
    return bookRepository.findAll();
  }

  @Override
  public Book getById(Integer id) {
    return bookRepository.getById(id);
  }

  @Override
  public void save(Book book) {
    bookRepository.saveAndFlush(book);
  }
}
