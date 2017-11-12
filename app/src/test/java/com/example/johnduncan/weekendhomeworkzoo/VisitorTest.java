package com.example.johnduncan.weekendhomeworkzoo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by John Duncan on 12/11/2017.
 */

public class VisitorTest {




    @Test
    public void visitorHasName(){
        Visitor visitor = new Visitor();
        assertEquals(null,visitor.getName());
    }

    @Test
    public void canSetVisitorName(){
        Visitor visitor = new Visitor();
        visitor.setName("Sophie");
        assertEquals("Sophie",visitor.getName());

    }
}
