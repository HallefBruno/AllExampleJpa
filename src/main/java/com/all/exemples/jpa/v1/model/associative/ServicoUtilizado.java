
package com.all.exemples.jpa.v1.model.associative;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
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
public class ServicoUtilizado {
    
    @Id
    @GeneratedValue
    private Long id;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arquivo_cadastro_id", referencedColumnName = "id")
    private ArquivoCadastro arquivoCadastro;

    @Column
    private String tipoServico;
    
}
