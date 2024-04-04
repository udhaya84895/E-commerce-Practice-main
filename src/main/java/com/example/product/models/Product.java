package com.example.product.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Product extends BaseModel{

    private String name;
    private String description;
    private int price;
    private String image;

    // every product will have only one category
    // 1P : 1C
    // MP : 1C
    @ManyToOne(cascade = {CascadeType.PERSIST})
//    //PERSIST means saving, creating something new
    private Category category;


}

// in the product table
// pid -> cid
// category_id column in products is enough
