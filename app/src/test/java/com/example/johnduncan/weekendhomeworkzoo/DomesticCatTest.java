package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.DomesticCat;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class DomesticCatTest {

    @Test
    public void testDomesticCatCanGetValue(){
         DomesticCat cat = new DomesticCat();
        cat.getValue();
    }

    @Test
    public void testDomesticCatCanSetValue(){
        DomesticCat cat = new DomesticCat();
        cat.setValue(100);
        Integer actual = cat.getValue();
        Integer expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testCanGetDomesticCatType(){
        DomesticCat cat = new DomesticCat();
        assertEquals("Big Cat",cat.getAnimalType());
    }
}
