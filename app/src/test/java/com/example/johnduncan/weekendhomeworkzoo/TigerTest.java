package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Tiger;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class TigerTest {

    @Test
    public void testTigerCanReturnValue(){
        Tiger tiger = new Tiger();
        tiger.setValue(1000);
        int actual = tiger.getValue();
        assertEquals(1000,actual);

    }
    
}
