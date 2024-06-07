// BoardController.java

package com.example.project.controller;

import com.example.project.dto.PostDto;
import com.example.project.entity.Post;
import com.example.project.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final PostService postService;

    @GetMapping("/board")
    public String board(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "board";
    }

    @GetMapping("/board/create")
    public String createPostPage(Model model) {
        model.addAttribute("postDto", new PostDto());
        return "create";
    }

    @PostMapping("/board/create")
    public String createPost(PostDto postDto) {
        postService.save(postDto);
        return "redirect:/board";
    }

    @GetMapping("/board/{postId}")            //board포
    public String viewPost(@PathVariable Long postId, Model model) {
        Post post = postService.getPostById(postId);
        model.addAttribute("post", post);
        return "viewpost";
    }

}
