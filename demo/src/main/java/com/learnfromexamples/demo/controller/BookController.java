package com.learnfromexamples.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnfromexamples.demo.repository.AuthorRepository;
import com.learnfromexamples.demo.repository.BookRepository;

@Controller
public class BookController {
	
	private final BookRepository bookRepo;
	
	private final AuthorRepository authorRepo;
	
	public BookController(BookRepository bookRepo,AuthorRepository authorRepo) {
		super();
		this.bookRepo = bookRepo;
		this.authorRepo = authorRepo;
	}

	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepo.findAll());
		return "list";
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepo.findAll());
		return "authors";
	}
}
