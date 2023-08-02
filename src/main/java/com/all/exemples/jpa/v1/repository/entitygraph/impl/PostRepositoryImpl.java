package com.all.exemples.jpa.v1.repository.entitygraph.impl;

import com.all.exemples.jpa.v1.model.entitygraph.Post;
import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

public class PostRepositoryImpl implements PostRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Post> findByPosts() {
        EntityGraph<Post> entityGraph = entityManager.createEntityGraph(Post.class);
        entityGraph.addAttributeNodes("userOne");
        entityGraph.addAttributeNodes("comments");

        List<Post> post = entityManager.createQuery("select p from Post p", Post.class)
        .setHint("jakarta.persistence.fetchgraph", entityGraph)
        .getResultList();
        
        return post;
    }
}
