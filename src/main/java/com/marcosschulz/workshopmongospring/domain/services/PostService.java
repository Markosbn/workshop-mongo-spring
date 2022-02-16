package com.marcosschulz.workshopmongospring.domain.services;

import com.marcosschulz.workshopmongospring.domain.dto.UserDTO;
import com.marcosschulz.workshopmongospring.domain.models.Post;
import com.marcosschulz.workshopmongospring.domain.models.User;
import com.marcosschulz.workshopmongospring.domain.repositories.PostRepository;
import com.marcosschulz.workshopmongospring.domain.repositories.UserRepository;
import com.marcosschulz.workshopmongospring.domain.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    PostRepository repository;

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
