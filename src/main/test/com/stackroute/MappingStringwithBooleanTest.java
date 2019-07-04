package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MappingStringwithBooleanTest {

    MappingStringwithBoolean mappingStringwithBoolean;

    @Before
    public void setUp() throws Exception {
        mappingStringwithBoolean = new MappingStringwithBoolean();
    }

    @After
    public void tearDown() throws Exception {
        mappingStringwithBoolean = null;
    }

    @Test
    public void givenStringShouldREturnBooleanValueswithString() {

        String expected = "{a : true, b : false, c : true, d : false}";

        String arr[] = {"a", "b", "c", "d", "a", "c", "c"};

        String actual = mappingStringwithBoolean.mappwithBoolean(String.join(" ", arr)).replaceAll("=", " : ");

        assertEquals(expected, actual);
    }

    @Test
    public void givenNUmberStringShouldREturnBooleanValueswithString() {

        String expected = "{a : true, b : false, c : false, 3 : false, 4 : true}";

        String arr[] = {"4", "b", "c", "3", "a", "4", "a"};

        String actual = mappingStringwithBoolean.mappwithBoolean(String.join(" ", arr)).replaceAll("=", " : ");

        assertEquals(expected, actual);
    }

    @Test
    public void givenNullShouldREturNull() {

        String actual = mappingStringwithBoolean.mappwithBoolean(null);
        assertNull(actual);

    }
}