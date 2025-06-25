package com.crudproduct.crud.user.service;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    /*
    * Criação das entidades da classe usuario, com a primary key user_id
    *  */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    @Column
    private String name;

    @Column
    private String CPF;

    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;


}
