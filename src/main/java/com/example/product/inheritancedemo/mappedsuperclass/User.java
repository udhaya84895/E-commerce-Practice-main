package com.example.product.inheritancedemo.mappedsuperclass;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class User {

    @Id
    private Long id;
    private String name;
    private String email;
    private String password;
}
