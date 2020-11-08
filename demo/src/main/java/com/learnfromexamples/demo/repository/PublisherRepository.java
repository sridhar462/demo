package com.learnfromexamples.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.learnfromexamples.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}
