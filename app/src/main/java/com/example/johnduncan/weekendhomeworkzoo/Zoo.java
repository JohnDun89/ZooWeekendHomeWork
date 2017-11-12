package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Zoo <E extends Enclosure>{

    ArrayList<E> enclosures;
    Integer funds;

    public Zoo(){
        this.enclosures = new ArrayList();
        this.funds = 150000;
    }



    public ArrayList getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(E enclosure) {
         this.enclosures.add(enclosure);
    }

    public void removeEnclosure(E enclosure){
        this.enclosures.remove(enclosure);
    }

    public int getTotalNumberOfAnimals() {
        int total = 0;
        for(E pen : enclosures) {
           total += pen.countAnimals();
        }
        return total;
    }

    public Integer getFunds() {
        return this.funds;
    }

    public int addAnimalValueToFunds(Animal animal){
        int amount = animal.getValue();
        int result = this.funds += amount;
        return result;
    }

    public boolean isAnimlaInPen(Animal animal) {
        for (E pen : enclosures) {
            if (pen.contains(animal)) {
                pen.removeAnimal(animal);
                return true;
            }
            else break;
        }
        return false;
    }

    public void sellAnimal(Animal animal){
        if (isAnimlaInPen(animal) == true){
            enclosures.remove(animal);
            addAnimalValueToFunds(animal);




        }

    }



//(enclosures.contains(animal))

}
