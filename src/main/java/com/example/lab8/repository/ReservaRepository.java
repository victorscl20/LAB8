package com.example.lab8.repository;

import com.example.lab8.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

    @Transactional
    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE `dblab8`.`reserva` SET `idpelicula` = ?2, `fecha` = ?3, `hora_inicio` = ?4, `hora_fin` = ?5 WHERE (`idreserva` = ?1);")
    void actualizar_reserva(Integer idreserva, Integer idpel, String fecha, String horain, String horafin);
}