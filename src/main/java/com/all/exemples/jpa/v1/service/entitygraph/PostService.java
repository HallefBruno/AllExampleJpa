
package com.all.exemples.jpa.v1.service.entitygraph;

import com.all.exemples.jpa.v1.model.entitygraph.Post;
import com.all.exemples.jpa.v1.repository.entitygraph.PostRepository;
import com.all.exemples.jpa.v1.repository.entitygraph.impl.PostRepositoryImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostService {
    
    @Autowired
    private PostRepository postRepository;
    
    @Autowired
    private PostRepositoryImpl postCustomImpl;
    
    @Transactional
    public void salvar(Post post) {
        postRepository.save(post);
    }
    
    public List<Post> todos() {
        return postCustomImpl.findByPosts();
    }
    
}
