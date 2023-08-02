package com.all.exemples.jpa.v1.model.entitygraph;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class UserOne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String email;

    public UserOne() {
    }

    public UserOne(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
}
