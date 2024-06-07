// PostRepository.java

package com.example.project.repository;

import com.example.project.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
