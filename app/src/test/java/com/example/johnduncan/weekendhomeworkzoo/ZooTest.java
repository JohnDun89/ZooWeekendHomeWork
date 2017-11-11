package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.BigCat;
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
        BigCat bigcat = new BigCat();
        Zoo zoo = new Zoo();
        zoo.addEnclosure(bigcat);
        assertEquals(bigcat,zoo.getEnclosures().get(0));
    }
}
