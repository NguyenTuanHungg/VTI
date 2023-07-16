package com.example.vti.Entity;


import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name="id")

    private Integer id;


    @Column(name = "title")
    private String title;

    @Column(name = "alias")
    private String alias;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;


}
