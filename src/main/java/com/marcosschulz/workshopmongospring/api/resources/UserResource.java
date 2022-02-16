package com.marcosschulz.workshopmongospring.api.resources;

import com.marcosschulz.workshopmongospring.domain.models.User;
import com.marcosschulz.workshopmongospring.domain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> userList = service.findAll();
        return ResponseEntity.ok().body(userList);
    }
}
