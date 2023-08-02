
package com.all.exemples.jpa.v1.repository.entitygraph;

import com.all.exemples.jpa.v1.model.entitygraph.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    
}
