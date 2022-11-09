package com.example.lab8.Daos;

import com.example.lab8.Entities.Coin;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class Ejercicio2Dao {
    public List<Coin> listarCoin(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Coin[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/coins?limit=70", Coin[].class);

        return Arrays.asList(response.getBody());

    }
}
