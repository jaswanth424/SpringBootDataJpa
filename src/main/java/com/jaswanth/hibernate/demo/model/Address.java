package com.jaswanth.hibernate.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Address {
    @Id
    private int id;
    @Column(name = "street_number")
    private Integer streetNumber;
    @Column(name = "stree_name")
    private String streetName;
}
