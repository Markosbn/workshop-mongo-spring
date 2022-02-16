package com.marcosschulz.workshopmongospring.domain.services;

import com.marcosschulz.workshopmongospring.domain.models.User;
import com.marcosschulz.workshopmongospring.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }


}
