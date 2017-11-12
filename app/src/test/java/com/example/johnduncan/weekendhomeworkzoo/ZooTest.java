package com.example.johnduncan.weekendhomeworkzoo;

import com.example.johnduncan.weekendhomeworkzoo.Animal.BigCat;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Chameleon;
import com.example.johnduncan.weekendhomeworkzoo.Animal.Cheetah;
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



    @Test
    public void canGetTotalNumberOfAnimalsInZoo(){
        Tiger tiger = new Tiger();
        Cheetah cheetah = new Cheetah();
        Chameleon chameleon = new Chameleon();
        Zoo zoo = new Zoo();
        Enclosure enclosure = new Enclosure("Big Cats");
        Enclosure enclosure1 = new Enclosure("Lizards");
        zoo.addEnclosure(enclosure);
        zoo.addEnclosure(enclosure1);
        enclosure.addAnimal(tiger);
        enclosure.addAnimal(tiger);
        enclosure.addAnimal(cheetah);
        enclosure1.addAnimal(chameleon);
        enclosure1.addAnimal(chameleon);
        assertEquals(5,zoo.getTotalNumberOfAnimals());
    }

    @Test
    public void payZooAnimalValue(){
        Tiger tiger = new Tiger();
        tiger.setValue(1000);
        Zoo zoo = new Zoo();
        zoo.addAnimalValueToFunds(tiger);
        int actual = zoo.getFunds();
        assertEquals(151000,actual);
    }

    @Test
    public void booleanPenContainAnimal(){
        Zoo zoo = new Zoo();
        Enclosure enclosure = new Enclosure("Big Cats");
        Tiger tiger = new Tiger();
        zoo.addEnclosure(enclosure);
        enclosure.addAnimal(tiger);
        assertEquals(true,zoo.isAnimlaInPen(tiger));

    }

    @Test
    public void canSellAnimalCallingPayZooAndRemoveAnimal(){

    }
}
