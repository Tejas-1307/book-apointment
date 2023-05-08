package com.example.book.apointment.countryHierachy.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Tahsil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Tehsil cannot be null")
    private String tehsilName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "district_id")
    private District district;
}
