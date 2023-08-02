package com.all.exemples.jpa.v2.repository.onetoone;

import com.all.exemples.jpa.v2.model.onetoone.v1.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "BookRepositoryOneToOne")
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
