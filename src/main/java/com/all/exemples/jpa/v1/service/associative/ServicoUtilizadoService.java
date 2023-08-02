
package com.all.exemples.jpa.v1.service.associative;

import com.all.exemples.jpa.v1.model.associative.ServicoUtilizado;
import com.all.exemples.jpa.v1.repository.associative.ServicoUtilizadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicoUtilizadoService {
    
    @Autowired
    private ServicoUtilizadoRepository servicoUtilizadoRepository;
    
    public void salvar(ServicoUtilizado servicoUtilizado) {
        servicoUtilizadoRepository.save(servicoUtilizado);
    }
    
    @Transactional
    public void salvar(List<ServicoUtilizado> list) {
        servicoUtilizadoRepository.saveAll(list);
    }
    
}
