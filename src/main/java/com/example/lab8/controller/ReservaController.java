package com.example.lab8.controller;

import com.example.lab8.entity.Reserva;
import com.example.lab8.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@RestController
@CrossOrigin
@RequestMapping("/reserva")


public class ReservaController {

    @Autowired
    ReservaRepository reservaRepository;

    @PostMapping("/guardar")
    public ResponseEntity<HashMap<String,String>> crearReserva(
            @RequestBody Reserva reserva
    ){

        HashMap<String,String> hashMap = new HashMap<>();
        //prueba
        reservaRepository.save(reserva);
        hashMap.put("idCreado", String.valueOf(reserva.getId()));

        return ResponseEntity.status(HttpStatus.CREATED).body(hashMap);
    }
}
