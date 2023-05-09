package com.example.book.apointment.manytomany.repository;

import com.example.book.apointment.manytomany.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Students,Integer> {
}
