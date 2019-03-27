package com.example.demo.BookRepo;

import com.example.demo.BooksEntity.Books;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Books,Object>{
List<Books> findBooksByAuthorAndId(String author,Long id);

}
