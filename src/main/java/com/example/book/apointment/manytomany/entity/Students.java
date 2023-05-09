package com.example.book.apointment.manytomany.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "Address cannot be null")
    private String address;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "stud_course",joinColumns = {@JoinColumn(name = "students_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "courses_id",referencedColumnName = "id")})
    private List<Courses>courses;

}
