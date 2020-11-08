package com.learnfromexamples.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnfromexamples.demo.domain.Author;
import com.learnfromexamples.demo.domain.Book;
import com.learnfromexamples.demo.domain.Publisher;
import com.learnfromexamples.demo.repository.AuthorRepository;
import com.learnfromexamples.demo.repository.BookRepository;
import com.learnfromexamples.demo.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final AuthorRepository authorRepo;

	private final BookRepository bookRepo;
	
	private final PublisherRepository publisherRepo;

	public BootStrapData(AuthorRepository authorRepo, BookRepository bookRepo,PublisherRepository publisherRepo) {
		super();
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo = publisherRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Publisher publisher = new Publisher("Tata Mch", "Mumbai");
		publisherRepo.save(publisher);
		
		Author author = new Author("Sridharan", "Nithya");
		Book book = new Book("C++", "A1");
		author.getBooks().add(book);
		book.getAuthors().add(author);
		book.setPublisher(publisher);
		authorRepo.save(author);
		bookRepo.save(book);
		publisher.getBooks().add(book);
		publisherRepo.save(publisher);
		
		Author author1 = new Author("Sid", "Nivi");
		Book book1 = new Book("Java", "A2");
		author1.getBooks().add(book1);
		book1.getAuthors().add(author1);
		
		authorRepo.save(author1);
		bookRepo.save(book1);
		publisher.getBooks().add(book1);
		publisherRepo.save(publisher);
		System.out.println(authorRepo.count());
		System.out.println(bookRepo.count());
		System.out.println(publisher.getBooks().size());
	}

}
