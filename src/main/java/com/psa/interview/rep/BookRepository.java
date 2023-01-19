package com.psa.interview.rep;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.psa.interview.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

	

}
