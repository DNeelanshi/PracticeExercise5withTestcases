package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayElementModificationTest {

    ArrayElementModification  arrayElementModification;

    @Before
    public void setup(){

        arrayElementModification = new ArrayElementModification();
    }

    @After
    public void teardown(){

        arrayElementModification = null;
    }

    @BeforeClass
    public static void setupBeforeClass(){


    }

    @AfterClass
    public static void teardownAfterClass(){


    }

    @Test
    public void givenArrayShouldReturnNewArray() {

        String expected="[Kiwi, Grape, Mango, Berry]";
        String actual=arrayElementModification.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected,actual);

    }

    @Test
    public void givenNewvalueShouldUpdateArray() {

        String expected="[Kiwi, Grape, Mango, Berry]";
        arrayElementModification.addArray("Apple Grape Melon Berry".split(" "));
        arrayElementModification.update(0,"Kiwi");

        String actual=arrayElementModification.update(2,"Mango").toString();
        assertEquals(expected,actual);

    }
    @Test
    public void givenvalueShouldremoveAllvaluesfromArray() {

        String expected="[]";
        arrayElementModification.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual=arrayElementModification.removeAll().toString();
        assertEquals(expected,actual);

    }




}