package com.learnfromexamples.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnfromexamples.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long>{

}
