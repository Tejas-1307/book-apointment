package com.example.book.apointment.countryHierachy.entity;

import com.example.book.apointment.entity.Prefix;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @NotNull(message = "area cannot be null")
    private String areaName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pinCode_id")
    private Pincode pincode;

}
