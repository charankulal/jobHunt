package com.charan.jobhunt.controller;

import com.charan.jobhunt.model.Post;
import com.charan.jobhunt.repo.PostRepository;
import com.charan.jobhunt.repo.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;
    @Autowired
    SearchRepository searchRepository;

    @GetMapping("/allPosts")
    public List<Post> getAllPosts()
    {
        return postRepository.findAll();
    }

    @GetMapping("/posts/{query}")
    public List<Post> searchPosts(@PathVariable String query)
    {
        return searchRepository.findByText(query);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post)
    {
      return postRepository.save(post);

    }
}
