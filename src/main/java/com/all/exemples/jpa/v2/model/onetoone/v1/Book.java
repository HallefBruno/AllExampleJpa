package com.all.exemples.jpa.v2.model.onetoone.v1;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "book_onetoone")
@Table(name = "book_onetoone")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private String bookName;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
    @JsonManagedReference
    private Story story;

    public Book() {
    }

    public Book(String bookName, Story story) {
        this.bookName = bookName;
        this.story = story;
    }
    
    
    
}
