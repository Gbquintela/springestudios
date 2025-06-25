package com.crudproduct.crud.user.dto.request;

import com.crudproduct.crud.user.service.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

public record userRequest (
        @NotBlank(message = "Nome não pode ser vazio! ")
        @Size(min = 3, max = 60)
        String name,

        @NotBlank(message = "Campo CPF não pode ser vazio! ")
        @CPF( message = "CPF Inválido!")
        String CPF,

        @NotBlank(message = "Campo E-mail não pode estar vazio! ")
        @Email(message = "Email inválido!")
        String email,

        @NotBlank(message = "Nome de usuario não pode estar vazio! ")
        @Size(min = 4, max = 50)
        String username,

        @NotBlank(message = "Senha não pode ficar em branco! ")
        @Size(min = 8)
        String password,

        @NotBlank(message = "Confirmação de senha não pode ficar em branco!")
        @Size(min = 8)
        String confirmPassword
){

    public User toUser(){
        User user = new User();

        user.setName(name);
        user.setCPF(CPF);
        user.setEmail(email);
        user.setUsername(username);
        if(password.equals(confirmPassword)){
            user.setPassword(password);
        }

        return user;
    }


}
