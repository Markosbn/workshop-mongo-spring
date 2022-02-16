package com.marcosschulz.workshopmongospring.domain.repositories;

import com.marcosschulz.workshopmongospring.domain.models.Post;
import com.marcosschulz.workshopmongospring.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
