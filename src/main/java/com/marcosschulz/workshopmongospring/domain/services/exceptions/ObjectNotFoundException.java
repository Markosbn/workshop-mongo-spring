package com.marcosschulz.workshopmongospring.domain.services.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    public ObjectNotFoundException (String msg){
        super(msg);
    }
}
