package com.academy.service.impl;

import com.academy.model.dao.AuthorRepository;
import com.academy.model.entity.Author;
import com.academy.service.AuthorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

  @Autowired
  private AuthorRepository authorRepository;
  @Override
  public List<Author> getAll() {
    return authorRepository.findAll();
  }

  @Override
  public Author getById(Integer id) {

    return authorRepository.findById(id).orElse(new Author());
  }
}
