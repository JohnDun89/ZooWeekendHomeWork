package com.example.johnduncan.weekendhomeworkzoo;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Zoo <T extends >{

    ArrayList<T> enclosures;

    public Zoo(){
        this.enclosures = new ArrayList();
    }


    public ArrayList getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(T enclosure) {
         this.enclosures.add(enclosure);
    }

    public void removeEnclosure(T enclosure){
        this.enclosures.remove(enclosure);
    }

    public int getTotalNumberOfAnimals() {
        for (T pen : enclosures) {
        for ( Animal animal : enclosures ) {
            animal.getAnimal();

        }
        }
    return enclosures.size();
    }
}
