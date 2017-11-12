package com.example.johnduncan.weekendhomeworkzoo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 12/11/2017.
 */

public class VisitorTest {




    @Test
    public void visitorHasName(){
        Visitor visitor = new Visitor(30,"Mark");
        assertEquals(null,visitor.getName());
    }

    @Test
    public void canSetVisitorName(){
        Visitor visitor = new Visitor(85,null);
        visitor.setName("Sophie");
        assertEquals("Sophie",visitor.getName());

    }

    @Test
    public void visitorCanBuyTicket(){
        Visitor visitor = new Visitor(100,"Arnold");
        Zoo zoo =new Zoo();
        visitor.buyTicket(zoo.getTicket());
        assertEquals(92,visitor.getFunds(),0.1);
        assertEquals(150008, zoo.getFunds(),0.1);
    }

//    @Test
//    public void (){
//        Visitor visitor = new Visitor(60,)
//    }


}
