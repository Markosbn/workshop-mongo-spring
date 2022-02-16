package com.marcosschulz.workshopmongospring.domain.dto;

import com.marcosschulz.workshopmongospring.domain.models.User;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    //define os campos que permite o acesso pelo dto
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    //passa para os campos os dados que estão no usuario
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
