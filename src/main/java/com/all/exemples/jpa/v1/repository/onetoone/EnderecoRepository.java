package com.all.exemples.jpa.v1.repository.onetoone;

import com.all.exemples.jpa.v1.model.onetoone.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
