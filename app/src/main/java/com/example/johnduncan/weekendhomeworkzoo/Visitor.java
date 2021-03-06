package com.example.johnduncan.weekendhomeworkzoo;

/**
 * Created by John Duncan on 12/11/2017.
 */

public class Visitor {

     String name;
     String postcode;
     Integer funds;

    public Visitor(Integer funds, String name) {
        this.name = name;
        this.postcode = postcode;
        this.funds = funds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFunds() {
        return funds;
    }

    public void buyTicket(Integer charge) {
        this.funds -= charge;
    }
}
