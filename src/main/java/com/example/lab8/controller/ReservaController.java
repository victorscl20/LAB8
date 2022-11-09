package com.example.lab8.controller;

import com.example.lab8.entity.Reserva;
import com.example.lab8.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/reserva")


public class ReservaController {

    @Autowired
    ReservaRepository reservaRepository;

    @GetMapping("/listarReserva")
    public List<Reserva> listaReservas() {
        return reservaRepository.findAll();
    }

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

    @GetMapping("/eliminarReserva")
    public ResponseEntity<HashMap<String,String>> eliminarReserva( @RequestParam("id") Integer id){
        HashMap<String,String> hashMap = new HashMap<>();

        reservaRepository.deleteById(id);
        hashMap.put("ReservaEliminada", "Reservaeliminada");

        return ResponseEntity.status(HttpStatus.CREATED).body(hashMap);
    }

    @GetMapping("/actualizarReserva")
    public ResponseEntity<HashMap<String,String>> actualizarReserva( @RequestParam("id") Optional<Integer> id,
                                                                     @RequestParam("idpel") Optional<Integer> idpel,
                                                                     @RequestParam("fecha") Optional<String> fecha,
                                                                     @RequestParam("horain") Optional<String> horain,
                                                                     @RequestParam("horafin") Optional<String> horafin
                                                                     ){
        HashMap<String,String> hashMap = new HashMap<>();
        reservaRepository.actualizar_reserva(id.get(),idpel.get(),fecha.get(),horain.get(), horafin.get());
        hashMap.put("Reservaactualizada", "ReserAct");

        return ResponseEntity.status(HttpStatus.CREATED).body(hashMap);
    }


}
