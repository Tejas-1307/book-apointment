package com.example.book.apointment.countryHierachy.repository;

import com.example.book.apointment.countryHierachy.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,Integer> {
}
