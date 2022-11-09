package com.example.lab8.Repositories;

import com.example.lab8.Entities.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository<Pelicula,Integer> {
}
