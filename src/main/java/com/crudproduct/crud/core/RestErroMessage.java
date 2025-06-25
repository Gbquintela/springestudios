package com.crudproduct.crud.core;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestErroMessage {
    /*
    * Criação da classe global para tratar as mensagens da execeções
    * */
    private HttpStatus status;
    private String message;


}
