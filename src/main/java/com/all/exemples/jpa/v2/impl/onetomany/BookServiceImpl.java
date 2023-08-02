package com.all.exemples.jpa.v2.impl.onetomany;

import com.all.exemples.jpa.v2.model.onetomany.v1.Book;
import com.all.exemples.jpa.v2.repository.onetomany.BookRepository;
import com.all.exemples.jpa.v2.service.onetomany.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "BookServiceImplOneToMany")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findByBookId(Long id) {
        return bookRepository.getReferenceById(id);
    }

}
