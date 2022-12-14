package com.example.lab8.controller;


import com.example.lab8.Daos.Ejercicio2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/ejercicio2")
public class Ejercicio2Controller {

    @Autowired
    Ejercicio2Dao ejercicio2Dao;
    @GetMapping("/lista")
    public String lista(Model model){
        model.addAttribute("listaCoin",ejercicio2Dao.listarCoin());
        return "static/ejercicio2";
    }

    @GetMapping({"/news/list","/news"})
    public String listarNoticias(Model model){
        model.addAttribute("listaNews",ejercicio2Dao.listarNews());
        return "static/ejercicio2p2";
    }

}
