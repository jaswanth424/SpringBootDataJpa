package com.jaswanth.hibernate.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Person {
    @Id
    private Integer id;
    private String name;
    private String country;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
}
