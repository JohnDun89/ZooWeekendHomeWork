package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.KomonoDragon;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Tiger;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

/**
 * Created by John Duncan on 11/11/2017.
 */

public class EnclosuresTest {


    @Test
        public void canAddAnAnimalToEnclosure() {
        Tiger tiger = new Tiger();
        Enclosure pen = new Enclosure();
        pen.addAnimal(tiger);
        assertNotNull(pen.getAnimal().get(0));

    }

    @Test public void canGetAnimalFromPen(){
        KomonoDragon evilLizard = new KomonoDragon();
        Enclosure pen = new Enclosure();
        pen.addAnimal(evilLizard);
        assertEquals(evilLizard,pen.getAnimal().get(0));

    }



}


