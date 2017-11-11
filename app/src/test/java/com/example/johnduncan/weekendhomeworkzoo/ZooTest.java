package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.BigCat;
import com.example.johnduncan.weekendhomeworkzoo.Animal.ColdBloodedReptile;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Tiger;

import junit.framework.Assert;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class ZooTest {

    @Test
    public void canGetTypeFromEnclosure(){
        BigCat bigcat = new BigCat();
        Enclosure enclosure = new Enclosure<>("Big Cats");
        Zoo zoo = new Zoo();
        zoo.addEnclosure(enclosure);
        assertEquals(enclosure,zoo.getEnclosures().get(0));
    }

    @Test
    public void canRemoveEnclosureFromZoo(){
        Zoo zoo = new Zoo();
        Enclosure enclosure = new Enclosure("Big Cats");
        Enclosure enclosure1 = new Enclosure("Lizards");
        zoo.addEnclosure(enclosure);
        zoo.addEnclosure(enclosure1);
        zoo.removeEnclosure(enclosure);
        assertEquals(1,zoo.getEnclosures().size());
    }
}
