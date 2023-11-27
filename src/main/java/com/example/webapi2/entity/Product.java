package com.example.webapi2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
@Table(name = "product_t")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_f", nullable = false)
    private String title;

    @Column(name="price_f", nullable = false)
    private Double price;

    @Column(name="available_f", nullable = false)
    private Integer available;

    public Product() {
        id = 0;
        title = "";
        price = 0.0;
        available = 0;
    }
}
