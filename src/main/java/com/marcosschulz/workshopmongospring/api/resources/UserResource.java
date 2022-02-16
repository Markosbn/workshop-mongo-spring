package com.marcosschulz.workshopmongospring.api.resources;

import com.marcosschulz.workshopmongospring.domain.models.User;
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

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> userList = new ArrayList<>();
        User maria = new User("1", "Maria", "maria@gmail.com");
        User joao = new User("2", "Joao", "joao@gmail.com");

        userList.addAll(Arrays.asList(maria, joao));
        return ResponseEntity.ok().body(userList);
    }
}
