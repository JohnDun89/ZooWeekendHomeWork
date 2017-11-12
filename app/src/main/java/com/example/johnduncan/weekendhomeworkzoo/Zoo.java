package com.example.johnduncan.weekendhomeworkzoo;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Animal;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Zoo <E extends Enclosure>{

    ArrayList<E> enclosures;

    public Zoo(){
        this.enclosures = new ArrayList();
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


}
