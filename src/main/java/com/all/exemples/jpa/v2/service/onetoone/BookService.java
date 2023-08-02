package com.all.exemples.jpa.v2.service.onetoone;

import com.all.exemples.jpa.v2.model.onetoone.v1.Book;
import org.springframework.stereotype.Component;

@Component
public interface BookService {

    public Book save(Book book);
    public Book findByBookId(Long id);
    
}
