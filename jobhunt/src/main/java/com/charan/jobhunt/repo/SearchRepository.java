package com.charan.jobhunt.repo;

import com.charan.jobhunt.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
