package com.all.exemples.jpa.v2.repository.onetomany;

import com.all.exemples.jpa.v2.model.onetomany.v1.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "BookRepositoryOneToMany")
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
