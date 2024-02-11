package MrChibuzoTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautfulStringTest {

    @Test
    void fullStopCanBeAddedTest(){
        String result = BeautfulString.addFullStop("jingoza");
        assertEquals("jingoza",result);
    }

    @Test
    void fullStopAtTheEndOfTheWord(){
        String result =BeautfulString.addFullStop("Chroma.");
        assertEquals("Chroma.",result);
    }
    @Test
    void fullStopInTheMiddleOfTwoWords(){

    }



}