package com.example.lab8.Entities;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
@Getter
@Setter
public class Coin {
    private String id;
    private String icon;
    private String name;
    private String symbol;
    private int rank;
    private double price;
    private int priceBtc;
    private double volume;
    private long marketCap;
    private long availableSupply;
    private long totalSupply;
    private double priceChange1h;
    private double priceChange1d;
    private double priceChange1w;
    private String websiteUrl;
    private String redditUrl;
    private String twitterUrl;
    private ArrayList<String> exp;


}
