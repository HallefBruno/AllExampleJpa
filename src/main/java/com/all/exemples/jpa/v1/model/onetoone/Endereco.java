
package com.all.exemples.jpa.v1.model.onetoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Endereco {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @OneToOne(mappedBy = "endereco", orphanRemoval = true)
    private Usuario usuario;
    
    @Column
    private String logradouro;

    public Endereco() {
    }
    
    public Endereco(String logradouro) {
        this.logradouro = logradouro;
    }
}
