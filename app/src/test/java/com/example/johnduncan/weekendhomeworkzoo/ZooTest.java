package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Tiger;

import junit.framework.Assert;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class ZooTest {

    @Test
    public void canGetAnimalsFromEnclosure(){
        Tiger tiger = new Tiger();
        Zoo zoo = new Zoo();
        zoo.addEnclosure(tiger);
        assertEquals(tiger,zoo.getEnclosures().get(0));
    }
}
