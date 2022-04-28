package com.crud.democrud.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "ROL")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "NAME")
    private String name;


}
