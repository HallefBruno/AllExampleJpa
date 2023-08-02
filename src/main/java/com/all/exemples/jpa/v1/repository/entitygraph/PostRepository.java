
package com.all.exemples.jpa.v1.repository.entitygraph;

import com.all.exemples.jpa.v1.model.entitygraph.Post;
import com.all.exemples.jpa.v1.repository.entitygraph.impl.PostRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {
    
}
