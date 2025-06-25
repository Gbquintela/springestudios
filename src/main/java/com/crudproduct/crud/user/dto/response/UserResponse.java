package com.crudproduct.crud.user.dto.response;

public record UserResponse (
        String name,
        String CPF,
        String email,
        String username,
        String password
){

}
