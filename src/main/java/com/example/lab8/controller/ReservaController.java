package com.example.lab8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;

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
