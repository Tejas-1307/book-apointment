package com.example.book.apointment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prefix {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String prifix;

    @Transient
    private Integer gender;
}
