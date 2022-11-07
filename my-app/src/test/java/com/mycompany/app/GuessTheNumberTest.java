package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class GuessTheNumberTest {
    private GuessTheNumber guessthenumber = new GuessTheNumber();
    //Test halfableCount Method
    @Test
    public void testhalfableCountValid(){
        var result = guessthenumber.halfableCount(10);
        assertEquals(4, result);
    }

    @Test
    public void testhalfableCountNull(){
        assertThrows(NullPointerException.class, () -> {
            guessthenumber.halfableCount(null);
        });
    }

    @Test
    public void testhalfableCountInvalid(){
        assertThrows(NumberFormatException.class, () -> {
            guessthenumber.halfableCount(Integer.parseInt("ten"));
        });
    }

    //Test createRange Method
    @Test
    public void testcreateRangeValid() {
        var result = GuessTheNumber.createRange(1, 19);
        assertEquals(19, result.length);
    }

    @Test
    public void testcreateRangeNull() {
        assertThrows(NullPointerException.class, () -> {
            GuessTheNumber.createRange(null, null);
        });
    }

    @Test
    public void testcreateRangeInvalid() {
        assertThrows(NumberFormatException.class, () -> {
            GuessTheNumber.createRange(Integer.parseInt("one"), Integer.parseInt("twenty"));
        });
    }

    //Test findMiddleVal Method
    @Test
    public void testfindMiddleValValid() {
        var result = guessthenumber.findMiddleVal(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(5, result);
    }

    @Test
    public void testfindMiddleValNull() {
        assertThrows(NullPointerException.class, () -> {
            guessthenumber.findMiddleVal(null);
        });
    }

    @Test
    public void testfindMiddleValInvalid() {
        assertThrows(NumberFormatException.class, () -> {
            guessthenumber.findMiddleVal(new int[]{Integer.parseInt("one"), Integer.parseInt("two"), Integer.parseInt("three")});
        });
    }

    //Test average Method
    @Test
    public void testaverageValid() {
        var result = guessthenumber.average(1, 10);
        assertEquals(5, result);
    }

    @Test
    public void testaverageNull() {
        assertThrows(NullPointerException.class, () -> {
            guessthenumber.average(null, null);
        });
    }

    @Test
    public void testaverageInvalid() {
        assertThrows(NumberFormatException.class, () -> {
            guessthenumber.average(Integer.parseInt("one"), Integer.parseInt("ten"));
        });
    }

    //Test turnRange Method
    @Test
    public void testturnRangeValid() {
        int result[] = guessthenumber.turnRange("1","100");
        assertEquals(2, result.length);
    }
    
    @Test
    public void testturnRangeNull() {
        assertThrows(NumberFormatException.class, () -> {
            guessthenumber.turnRange(null, null);
        });
    }

    @Test
    public void testturnRangeInvalid() {
        assertThrows(NumberFormatException.class, () -> {
            guessthenumber.turnRange("one","hundred");
        });
    }
    

    
}
