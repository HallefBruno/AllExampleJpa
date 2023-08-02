package com.all.exemples.jpa.v1.service.associative;

import com.all.exemples.jpa.v1.model.associative.ArquivoCadastro;
import com.all.exemples.jpa.v1.repository.associative.ArquivoCadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArquivoCadastroService {
    
    @Autowired
    private ArquivoCadastroRepository arquivoCadastroRepository;
    
    
    public void salvar(ArquivoCadastro arquivoCadastro) {
        arquivoCadastroRepository.save(arquivoCadastro);
    }
    
}
