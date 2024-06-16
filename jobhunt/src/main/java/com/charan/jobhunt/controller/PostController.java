package com.charan.jobhunt.controller;

import com.charan.jobhunt.model.Post;
import com.charan.jobhunt.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
      return postRepository.save(post);

    }
}
