package com.example.smartPos.repositories.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Product {

    @Id
    private String productId;

    private String catId;

    private String name;

    private String price;

    private String descriptiom;

    private String qty;


}
