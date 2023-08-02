
package com.all.exemples.jpa.v1.service.entitygraph;

import com.all.exemples.jpa.v1.model.entitygraph.UserOne;
import com.all.exemples.jpa.v1.repository.entitygraph.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Transactional
    public UserOne salvar(UserOne user) {
        user = userRepository.save(user);
        return user;
    }
    
}
