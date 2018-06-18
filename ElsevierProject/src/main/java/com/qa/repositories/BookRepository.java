package com.qa.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
