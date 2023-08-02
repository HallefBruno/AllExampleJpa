package com.all.exemples.jpa.v1.service.onetoone;

import com.all.exemples.jpa.v1.model.onetoone.Usuario;
import com.all.exemples.jpa.v1.repository.onetoone.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Transactional
    public void salvar(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
    
    public List<Usuario> usuarios () {
        return usuarioRepository.findAll();
    }
    
}
