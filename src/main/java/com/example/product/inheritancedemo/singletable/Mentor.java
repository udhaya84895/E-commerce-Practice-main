package com.example.product.inheritancedemo.singletable;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("1")
@Entity(name = "st_mentor")
public class Mentor extends User {

    private String company;
    private Float avgRating;
}
