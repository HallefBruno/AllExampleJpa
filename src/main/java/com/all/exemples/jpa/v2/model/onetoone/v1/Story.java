package com.all.exemples.jpa.v2.model.onetoone.v1;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "story_onetoone")
@Table(name = "story_onetoone")
@Getter
@Setter
public class Story {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String storyName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    @JsonBackReference
    private Book book;

    public Story() {
    }

    public Story(String storyName) {
        this.storyName = storyName;
    }

    public Story(String storyName, Book book) {
        this.storyName = storyName;
        this.book = book;
    }
    
}
