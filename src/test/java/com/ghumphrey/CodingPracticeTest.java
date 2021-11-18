package com.ghumphrey;
import org.junit.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CodingPracticeTest 
{
    private CodingPractice target;

    @Before
    public void init(){
        target = new CodingPractice();
    }
    /**
     * Given an integer @param limit return all prime numbers up to the limit in a string, values 
     * should be separated by a comma
     */    
    @Test
    public void primeNumberCount_GivenALimit_ShouldReturnTheCountOfPrimeNumbersUptoLimit()
    {
        //Setup
        int limit = 100;
        //Act
        //Assert
        Assert.assertEquals(25, null);
    }

    /**
     * Given an integer @param limit return all prime numbers up to the limit a string, values 
     * should be separated by 
     */    
    @Test
    public void primeNumberRange_GivenALimit_ShouldReturnAllPrimeNumbersUptoLimit()
    {
        //Setup
        int limit = 100;
        String expected = "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97";
        //Act
        //Assert
        Assert.assertEquals(expected, null);

    }
    /**
     * Given a String @param input and @param delimeter, it should remove all non letter values 
     * and add the delimiter where appropriate to produce the expected output
     */  
    @Test
    public void manipulateText_GivenInputAndDelimiter_ShouldRemoveAllNonWordCharactersAndReplaceWithDelimiter(){
        //Setup
        String input = "Time%%@#%&4Time6893Time 34354Time";
        String delimiter = "Peanut Butter Jelly";
        String expected = "Peanut Butter Jelly Time Peanut Butter Jelly Time Peanut Butter Jelly Time Peanut Butter Jelly Time";
        //Act
        //Assert
        Assert.assertEquals(expected, null);
    }

    @Test
    public void rightTriangleArea_GivenHeightAndWidth_ShouldReturnTheAreaOfARightTriangle(){
        //Setup
        int height = 3;
        int width = 4;
        double expected = 6;
        //Act
        //Assert
        Assert.assertEquals(expected, null);
    }

    @Test
    public void rightTriangleHypotenuse_GivenHeightAndWidth_ShouldReturnTheHypotenuseOfARightTriangle(){
        //Setup
        int height = 3;
        int width = 4;
        double expected = 5;
        //Act
        //Assert
        Assert.assertEquals(expected, null);
    }
}
