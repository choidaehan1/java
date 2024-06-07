// PostService.java

package com.example.project.service;

import com.example.project.dto.PostDto;
import com.example.project.entity.Post;

import java.util.List;

public interface PostService {
    Post save(PostDto postDto);
    List<Post> getAllPosts();
    Post getPostById(Long id);
    void deletePostById(Long id);
}
