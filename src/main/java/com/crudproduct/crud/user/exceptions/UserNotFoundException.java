package com.crudproduct.crud.user.exceptions;


/*
* Criação da exeção usuario não encontrado
* */
public class UserNotFoundException extends  RuntimeException {

    public UserNotFoundException(){super("Nenhum usuario encontrado!");}

    public UserNotFoundException(String message){super(message);}
}
