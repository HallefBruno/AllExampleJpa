package com.all.exemples.jpa.v1.model.entitygraph;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String reply;

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private UserOne usuario;

    public Comment() {
    }

    public Comment(String reply, Post post, UserOne usuario) {
        this.reply = reply;
        this.post = post;
        this.usuario = usuario;
    }

    
    
}
