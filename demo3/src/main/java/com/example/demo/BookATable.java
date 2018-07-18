package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

public class BookATable{


    int id;
    private int numberofPeople;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberofPeople() {
        return numberofPeople;
    }

    public void setNumberofPeople(int numberofPeople) {
        this.numberofPeople = numberofPeople;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}