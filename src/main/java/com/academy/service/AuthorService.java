package com.academy.service;

import com.academy.model.entity.Author;
import java.util.List;

public interface AuthorService {
  List<Author> getAll();

  Author getById(Integer id);
}
