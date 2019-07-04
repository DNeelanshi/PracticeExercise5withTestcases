package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringSaveKeyValuePAIRTest {

    CountStringSaveKeyValuePAIR countStringSaveKeyValuePAIR;

    @Before
    public void setUp() throws Exception {
        countStringSaveKeyValuePAIR=new CountStringSaveKeyValuePAIR();
    }

    @After
    public void tearDown() throws Exception {
        countStringSaveKeyValuePAIR=null;
    }

    @Test
    public void givenStringShouldReturnCountofWords() {

        String expected="{one=5, two=2, three=2}";

        String actual=countStringSaveKeyValuePAIR.checkFrequency("one one -one___two,,three,one @three*one?two");

        assertEquals(expected,actual);

    }

    @Test
    public void givenNullShouldReturnNUll() {

        String actual=countStringSaveKeyValuePAIR.checkFrequency(null);
        assertNull(actual);

    }
    @Test
    public void givennonNullShouldReturnstring() {

        String actual=countStringSaveKeyValuePAIR.checkFrequency("i am WonderWoman");
        assertNotNull(actual);
    }

}