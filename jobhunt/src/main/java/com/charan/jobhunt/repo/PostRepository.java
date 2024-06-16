package com.charan.jobhunt.repo;

import com.charan.jobhunt.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String> {
}
