package Scount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class StringCountTest {


    @Test
    public void testNumberOfRows() {
        //Arange

        StringCount sc = new StringCount();


        //Act
        int actual = sc.numberRows();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    public void testAddOneRow() {
        //Arange

        StringCount sc = new StringCount();


        //Act
        sc.AddOneRow();
        int actual = sc.numberRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);


    }



    @Test
    public void testNumberOfCharacters() {
        //Arange
        StringCount sc = new StringCount();


        //Act
        int actual = sc.numberCharacters();

        //Assert
        int expected = 0;

        assertEquals(expected, actual);


    }
    @Test
    public void testCountNumberOfCharacters() {
        //Arange
        StringCount sc = new StringCount();


        //Act
        sc.countCharacters("jag heter robin");
        sc.countCharacters("golfare är jag");
        int actual = sc.numberCharacters();


        //Assert
        int expected = 29;

        assertEquals(expected, actual);


    }
    @Test
    public void testCount3Rows() {
        //Arange

        StringCount sc = new StringCount();


        //Act

       sc.AddOneRow();
       sc.AddOneRow();
       sc.AddOneRow();

        int actual = sc.numberRows();

        //Assert
        int expected = 3;

        assertEquals(expected, actual);


    }

   /* @Test
    public void testIsStop() {
        //Arange

        StringCount sc = new StringCount();


        //Act


        sc.isInputStop("stop");
        boolean actual = sc.getStop();

        //Assert
        boolean expected = true;

        assertEquals(expected, actual);


    }

    */
    @Test
    public void testIsNotStop() {
        //Arange

        StringCount sc = new StringCount();


        //Act


        sc.isInputStop("halloj");
        boolean actual = sc.getStop();

        //Assert
        boolean expected = false;

        assertEquals(expected, actual);


    }





}






