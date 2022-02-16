package com.marcosschulz.workshopmongospring.domain.repositories;

import com.marcosschulz.workshopmongospring.domain.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
