package com.example.book.apointment.repository;

import com.example.book.apointment.entity.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender,Integer> {
}
