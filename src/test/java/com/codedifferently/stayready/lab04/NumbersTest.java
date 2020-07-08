package com.codedifferently.stayready.lab04;


import org.junit.Assert;
import org.junit.Test;

public class NumbersTest {

    @Test
    public void oneToTenTest(){
        //: Given
        Numbers numbers = new Numbers();
        String expected = "oneToTen()\n*** Output ***\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest(){
        //: Given
    	Numbers numbers = new Numbers();
    	String expected ="oddNumbers()\n*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";
        //: When

    	String actual = numbers.oddNumbers();
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void squaresTest(){
    	Numbers numbers = new Numbers();
    	String expected ="squares()\n*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";
        //: When

    	String actual = numbers.squares();
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void random4Test(){
    	
    	
    }

    @Test
    public void evenTest(){
    	Numbers numbers = new Numbers();
    	String expected ="even()\n*** Output ***\n2\n4\n6\n8\n10";
        //: When

    	String actual = numbers.even(10);
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test
    public void powersTest(){
    	Numbers numbers = new Numbers();
    	String expected ="powers()\n*** Output ***\n2\n4\n8";
        //: When

    	String actual = numbers.powers(3);
        //: Then
    	
    	Assert.assertEquals("The two strings are equal",expected,actual);
    }

}
