package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Enclosure<T extends Animal> {

    ArrayList<T> animals;
    String name;




    public Enclosure(String name){
        this.animals = new ArrayList<T>();
        this.name = name;
    }

    public void addAnimal(T animal){
        this.animals.add(animal);
    }

    public ArrayList getAnimal(){
        return this.animals;
    }

    public String getName(){
        return this.name;
    }

    public void removeAnimal(T animal){
      this.animals.remove(animal);
    }

}
