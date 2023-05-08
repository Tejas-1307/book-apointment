package com.example.book.apointment.countryHierachy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Pincode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Pincode cannot be null")
    private Long pinCode;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tahsil_id")
    private Tahsil tehsil;

}
