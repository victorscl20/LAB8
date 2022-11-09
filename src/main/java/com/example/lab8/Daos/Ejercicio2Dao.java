package com.example.lab8.Daos;

import com.example.lab8.Entities.Coin;
import com.example.lab8.Entities.News;
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

    public List<News> listarNews(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<News[]> response = restTemplate.getForEntity(
                "https://api.coinstats.app/public/v1/news?skip=0&limit=20&toDate=1555508420000&fromDate=1555508420000", News[].class);

        return Arrays.asList(response.getBody());

    }
}
