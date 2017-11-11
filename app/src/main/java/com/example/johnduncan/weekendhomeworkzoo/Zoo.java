package com.example.johnduncan.weekendhomeworkzoo;

import android.os.Build;
import android.support.annotation.RequiresApi;

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

    public void removeEnclosure(Enclosure enclosure){
        this.enclosures.remove(enclosure);
    }
}
