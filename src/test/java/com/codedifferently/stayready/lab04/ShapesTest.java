package com.codedifferently.stayready.lab04;
import org.junit.Test;
import org.junit.Assert;

public class ShapesTest {
    @Test
    public void triangleTest(){
    	
    	Shapes test = new Shapes();
    	
        //Given
        String expected =
        "*\n" +
        "**\n" +
        "***\n" +
        "****\n" +
        "*****\n";
        //When
        String actual = test.triangle();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void tableSquareTest(){
    	
    	Shapes test = new Shapes();
    	
        //Given
        String expected =
                        "  1 |  2 |  3 |  4 |\n" +
                        "  2 |  4 |  6 |  8 |\n" +
                        "  3 |  6 |  9 | 12 |\n" +
                        "  4 |  8 | 12 | 16 |\n";
        //When
        String actual = test.tableSquare();
        //Then
        Assert.assertEquals(expected, actual);
    }
}