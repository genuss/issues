package com.example.jdbc;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.repository.ListCrudRepository;

public interface SomeRepository
    extends ListCrudRepository<SomeRepository.SomeEntity, Long> {

  List<SomeRepository.SomeEntity> findAllByName(String name);

  record SomeEntity(@Id Long id, String name) {
  }
}
