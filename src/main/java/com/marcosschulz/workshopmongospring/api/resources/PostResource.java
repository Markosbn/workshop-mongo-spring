package com.marcosschulz.workshopmongospring.api.resources;

import com.marcosschulz.workshopmongospring.domain.dto.UserDTO;
import com.marcosschulz.workshopmongospring.domain.models.Post;
import com.marcosschulz.workshopmongospring.domain.models.User;
import com.marcosschulz.workshopmongospring.domain.services.PostService;
import com.marcosschulz.workshopmongospring.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    PostService service;

    @GetMapping
    public ResponseEntity<List<Post>> findAll(){
        List<Post> postList = service.findAll();
        return ResponseEntity.ok().body(postList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
