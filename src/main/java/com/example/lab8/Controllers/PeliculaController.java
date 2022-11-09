package com.example.lab8.Controllers;

import com.example.lab8.Entities.Pelicula;
import com.example.lab8.Repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/peliculas")
public class PeliculaController {
    @Autowired
    PeliculaRepository peliculaRepository;

    @ResponseBody
    @GetMapping(value = "/listar")
    public List<Pelicula> listarUsuario(){ return peliculaRepository.findAll(); }




}
