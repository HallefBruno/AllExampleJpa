
package com.all.exemples.jpa.v1.model.associative;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class ArquivoCadastro {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Column
    private String cpfCnpj;

    @Column
    private String documento;
    
    @OneToMany(cascade = {}, fetch = FetchType.LAZY, mappedBy = "arquivoCadastro")
    @JsonManagedReference
    private List<ServicoUtilizado> servicosUtilizados;
    
}
