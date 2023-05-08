package com.example.book.apointment.countryHierachy.repository;

import com.example.book.apointment.countryHierachy.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,Integer> {
}
