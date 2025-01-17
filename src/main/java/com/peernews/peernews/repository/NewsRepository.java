package com.peernews.peernews.repository;

import com.peernews.peernews.model.News;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<News, Long>{
    
}
