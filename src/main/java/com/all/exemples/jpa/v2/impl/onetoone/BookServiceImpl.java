package com.all.exemples.jpa.v2.impl.onetoone;

import com.all.exemples.jpa.v2.model.onetoone.v1.Book;
import com.all.exemples.jpa.v2.repository.onetoone.BookRepository;
import com.all.exemples.jpa.v2.service.onetoone.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "BookServiceImplOneToOne")
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
