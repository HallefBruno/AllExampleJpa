
package com.all.exemples.jpa.v1.repository.associative;

import com.all.exemples.jpa.v1.model.associative.ArquivoCadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArquivoCadastroRepository extends JpaRepository<ArquivoCadastro, Long> {
    
    
    
}
