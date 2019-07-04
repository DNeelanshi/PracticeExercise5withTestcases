package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MappingStringsTest {

    MappingStrings mappingStrings;

    @Before
    public void setUp() throws Exception {
        mappingStrings = new MappingStrings();
    }

    @After
    public void tearDown() throws Exception {
        mappingStrings = null;
    }

    @Test
    public void givenMapShouldReturnReplacedValuesinPair() {

        String expected="{val2=java, val1= }";

        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");

        String actual = mappingStrings.MappingStrings(map);

        assertEquals(expected,actual);

    }

    @Test
    public void givenMapShouldReturnReplacedValueinPair() {

        String expected="{val2=Mars, val1= }";

        Map<String, String> map=new HashMap<>();
        map.put("val1","Mars");
        map.put("val2","Saturn");

        String actual = mappingStrings.MappingStrings(map);

        assertEquals(expected,actual);

    }

    @Test
    public void givenEmptyShouldReturnReplacedValueinPair() {

        String expected="{val2= , val1= }";

        Map<String, String> map=new HashMap<>();
        map.put("val1"," ");
        map.put("val2"," ");

        String actual = mappingStrings.MappingStrings(map);

        assertEquals(expected,actual);

    }

    @Test
    public void givenNUllShouldReturnNUll() {

        String actual = mappingStrings.MappingStrings(null);

        assertNull(null);

    }
}