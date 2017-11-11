package com.example.johnduncan.weekendhomeworkzoo.Animal;

/**
 * Created by John Duncan on 11/11/2017.
 */

public abstract class Animal {


    Integer cashValue;
    String type;

    public Animal(){
        this.cashValue = cashValue;
        this.type = type;

    }

    public Integer  getValue(){
        return this.cashValue;
    }


    public void setValue(Integer value){
        this.cashValue =+ value;
    }

    public String getAnimalType() {
        return this.type;
    }
}
