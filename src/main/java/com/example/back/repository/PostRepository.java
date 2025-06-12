package com.example.back.repository;

import com.example.back.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // No additional methods are needed as JpaRepository provides basic CRUD operations
}
