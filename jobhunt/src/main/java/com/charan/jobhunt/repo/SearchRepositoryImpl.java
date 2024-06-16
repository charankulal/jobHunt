package com.charan.jobhunt.repo;

import com.charan.jobhunt.model.Post;
import com.mongodb.client.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.bson.Document;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoClientURI;
import org.bson.conversions.Bson;
import com.mongodb.MongoClientURI;

import java.util.concurrent.TimeUnit;

import org.bson.Document;

@Component
public class SearchRepositoryImpl implements SearchRepository {
    MongoClient mongoClient;
    @Autowired
    MongoConverter mongoConverter;


    @Override
    public List<Post> findByText(String text) {

        mongoClient = MongoClients.create("mongodb+srv://root:1234@jobhunt.cwhhut4.mongodb.net/?retryWrites=true&w=majority&appName=jobhunt");
        final List<Post> posts = new ArrayList<>();
        MongoDatabase database = mongoClient.getDatabase("jobhunt");
        MongoCollection<Document> collection = database.getCollection("jobpost");
        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("index", "default").append("text", new Document("query", text)
                                .append("path", Arrays.asList("desc", "skill", "profile")))),
                        new Document("$sort",
                        new Document("exp", -1L)),
                        new Document("$limit", 5L)));

        result.forEach(doc->posts.add(mongoConverter.read(Post.class,doc)));

        return posts;
    }
}
