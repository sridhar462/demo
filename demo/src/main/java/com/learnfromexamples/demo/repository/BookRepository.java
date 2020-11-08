package com.learnfromexamples.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnfromexamples.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
