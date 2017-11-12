package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.Cheetah;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Cheetah;
import com.example.johnduncan.weekendhomeworkzoo.Animal.KomonoDragon;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Tiger;

import org.junit.Before;
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
        Enclosure pen = new Enclosure("African Big Cats");
        pen.addAnimal(tiger);
        assertNotNull(pen.getAnimal().get(0));

    }

    @Test
    public void canGetAnimalFromPen(){
        KomonoDragon evilLizard = new KomonoDragon();
        Enclosure pen = new Enclosure("Rare lizards");
        pen.addAnimal(evilLizard);
        assertEquals(evilLizard,pen.getAnimal().get(0));

    }

    @Test
    public void testCountAnimals() {
        KomonoDragon evilLizard = new KomonoDragon();
        KomonoDragon evilLizard1 = new KomonoDragon();
        Enclosure pen = new Enclosure("Rare lizards");
        pen.addAnimal(evilLizard);
        pen.addAnimal(evilLizard1);
        assertEquals(2,pen.countAnimals());

    }

    @Test
    public void canRemoveAnimalFromPen(){
        Tiger tiger = new Tiger();
        Cheetah cheetah = new Cheetah();
        Enclosure pen = new Enclosure("African Big Cats");
        pen.addAnimal(cheetah);
        pen.addAnimal(tiger);
        pen.removeAnimal(tiger);
        assertEquals(1,pen.getAnimal().size());


    }




}


