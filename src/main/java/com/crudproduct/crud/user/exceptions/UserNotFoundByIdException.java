package com.crudproduct.crud.user.exceptions;

/*
 * Criação da exeção usuario não encontrado pelo id!
 * */
public class UserNotFoundByIdException extends RuntimeException{

    public UserNotFoundByIdException(){super("Nenhum usuario encontrado pelo id! ");}

    public  UserNotFoundByIdException(String message){super(message);}


}
