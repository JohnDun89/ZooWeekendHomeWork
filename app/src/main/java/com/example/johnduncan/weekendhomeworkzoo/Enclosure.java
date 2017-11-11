package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Enclosure<T extends Animal> {

    ArrayList<T> animals;

    public Enclosure(){
        this.animals = new ArrayList<T>();
    }

    public void addAnimal(T animal){
        this.animals.add(animal);
    }

    public ArrayList getAnimal(){
        return this.animals;

    }

}
