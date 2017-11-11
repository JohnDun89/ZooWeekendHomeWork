package com.example.johnduncan.weekendhomeworkzoo;

import java.util.ArrayList;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class Zoo {

    ArrayList enclosures;

    public Zoo(){
        this.enclosures = new ArrayList();
    }


    public ArrayList getEnclosures() {
        return this.enclosures;
    }

    public void addEnclosure(Enclosure enclosure) {
         this.enclosures.add(enclosure);

    }
}
