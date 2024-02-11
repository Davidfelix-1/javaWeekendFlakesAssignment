package MrChibuzoTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingFrequencyTest {

    @Test
    public void testPrintingCharactersFrequency(){

        String input = "semicolon";
        String expectedResult = "c: 1\n" + "e: 1\n" + "i: 1\n" + "l: 1\n" + "m: 1\n" + "n: 1\n" + "o: 2\n" + "s: 1\n" ;
       String actualOutput = expectedResult;
        assertEquals(expectedResult);


    }


}