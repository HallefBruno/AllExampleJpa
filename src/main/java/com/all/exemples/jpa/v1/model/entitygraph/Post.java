package com.all.exemples.jpa.v1.model.entitygraph;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.NamedAttributeNode;
//import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
//@NamedEntityGraph(
//  name = "post-entity-graph",
//  attributeNodes = {
//    @NamedAttributeNode("subject"),
//    @NamedAttributeNode("usuario"),
//    @NamedAttributeNode("comments"),
//  }
//)
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String subject;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "post", fetch = FetchType.EAGER)
    private List<Comment> comments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    private UserOne userOne;

    public Post() {
    }

    public Post(String subject, UserOne userOne) {
        this.subject = subject;
        this.userOne = userOne;
    }

    
}
