package com.secondProject.fullstackbackend.exception;

public class UserlNotFoundException  extends  RuntimeException{
    public UserlNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
