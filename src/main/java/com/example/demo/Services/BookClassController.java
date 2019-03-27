package com.example.demo.Services;

import com.example.demo.AdviceServices.BookNotFoundException;
import com.example.demo.BookRepo.BookRepository;
import com.example.demo.BooksEntity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookClassController {
    @Autowired
        private BookRepository bookRepository;

        @GetMapping
        public Iterable findAll() {
            return bookRepository.findAll();
        }

        @GetMapping("/title/{bookTitle}")
        public List findByTitle(@PathVariable String bookTitle) {
            Long id=0L;
            return bookRepository.findBooksByAuthorAndId(bookTitle,id);
        }

        @GetMapping("/{id}")
        public Books findOne(@PathVariable Long id) {
            return bookRepository.findById(id)
                    .orElseThrow(BookNotFoundException::new);
        }

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Books create(@RequestBody Books book) {
            return bookRepository.save(book);
        }

        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) {
            bookRepository.findById(id)
                    .orElseThrow(BookNotFoundException::new);
            bookRepository.deleteById(id);
        }

        @PutMapping("/{id}")
        public Books updateBook(@RequestBody Books book, @PathVariable Long id) {
            if (book.getId() != id) {
                throw new BookNotFoundException();
            }
            bookRepository.findById(id)
                    .orElseThrow(BookNotFoundException::new);
            return bookRepository.save(book);
        }
    }

