package com.psa.interview.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.psa.interview.model.Book;
import com.psa.interview.rep.BookRepository;

@RestController
public class BookController {
	@Autowired
	private BookRepository bookre;
	@PostMapping("/addBook")
	public String savebook(@RequestBody Book book) {
		bookre.save(book);
		return "added book with id :"+ book.getId();
		
		
	}
	@GetMapping("/findbook")
	public List<Book>getBook(){
		return bookre.findAll();
		
		
		
	}
	@GetMapping("/findbook/{id}")
	public Optional<Book>getBook(@PathVariable int id){
		return bookre.findById(id);
		
	}
	@DeleteMapping("/delet/{id}")
	public String deletBook(@PathVariable int id) {
		bookre.deleteById(id);
		return "book delete";
	}
	

}
