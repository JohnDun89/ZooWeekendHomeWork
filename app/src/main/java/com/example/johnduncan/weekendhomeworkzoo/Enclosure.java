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

    public int countAnimals(){
        return this.animals.size();
    }

    public Integer valueOfAnimalsInPen(){
       Integer total = 0;
      for ( T animal : animals){
          total += animal.getValue();
      }return total;
    }

    public boolean contains(Animal animal) {
        if (this.animals.contains(animal))
            return true;
        return false;
    }


}
