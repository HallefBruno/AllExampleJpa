package com.all.exemples.jpa.v1.repository.onetoone;

import com.all.exemples.jpa.v1.model.onetoone.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
