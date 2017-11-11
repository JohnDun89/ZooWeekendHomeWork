package com.example.johnduncan.weekendhomeworkzoo;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Zoo<T> {

    ArrayList< T > enclosures;

    public Zoo(){
        this.enclosures = new ArrayList<T>();
    }


    public ArrayList<T> getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(T enclosure) {
         this.enclosures.add(enclosure);

    }
}
