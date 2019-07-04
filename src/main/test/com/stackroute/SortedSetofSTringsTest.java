package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SortedSetofSTringsTest {

    SortedSetofSTrings sortedSetExample;
    @Before
    public void setUp() throws Exception {
        sortedSetExample=new SortedSetofSTrings();
    }

    @After
    public void tearDown() throws Exception {
        sortedSetExample=null;
    }

    @Test
    public void sortArrayListUsingSortedSet() {

        String expected="[Alice, Bluto, Eugene, Harry, Olive]";
        String actual=sortedSetExample.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");

        assertEquals(expected,actual);

    }

    @Test
    public void sortNUmberArrayListUsingSortedSet() {

        String expected="[1234, 6, Alice, Eugene, Harry]";
        String actual=sortedSetExample.sortArrayListUsingSortedSet("Harry 1234 Alice 6 Eugene");

        assertEquals(expected,actual);

    }

    @Test
    public void sortSpecialArrayListUsingSortedSet() {

        String expected="[#, $, %, &, 0]";
        String actual=sortedSetExample.sortArrayListUsingSortedSet("0 0 0 & % # $ 0");

        assertEquals(expected,actual);

    }

    @Test
    public void sortArrayListUsingSortedSetNull() {

        String actual=sortedSetExample.sortArrayListUsingSortedSet(null);
        assertNull(actual);
    }

}