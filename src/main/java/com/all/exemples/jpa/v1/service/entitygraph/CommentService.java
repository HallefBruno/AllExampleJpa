
package com.all.exemples.jpa.v1.service.entitygraph;

import com.all.exemples.jpa.v1.model.entitygraph.Comment;
import com.all.exemples.jpa.v1.repository.entitygraph.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    @Transactional
    public void salvar(Comment comment) {
        commentRepository.save(comment);
    }
    
}
