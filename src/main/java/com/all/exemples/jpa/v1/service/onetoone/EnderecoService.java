package com.all.exemples.jpa.v1.service.onetoone;

import com.all.exemples.jpa.v1.model.onetoone.Endereco;
import com.all.exemples.jpa.v1.repository.onetoone.EnderecoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Transactional
    public void salvar(Endereco endereco) {
        enderecoRepository.save(endereco);
    }
    
    public List<Endereco> enderecos() {
        return enderecoRepository.findAll();
    }

}
