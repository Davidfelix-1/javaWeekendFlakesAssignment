import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompoundInterestTest {

    @Test
    public void testForThePrincipalAmount(){
        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.setPrincipal(1000);
        assertEquals(1000,compoundInterest.getPrincipal());
    }
    @Test
    public void testForTheInterestRate(){
        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.setPrincipal(1000);
        assertEquals(1000,compoundInterest.getPrincipal());
        compoundInterest.setRate(7);
        assertEquals(7,compoundInterest.getRate());
    }
    @Test
    public void testForTheAccumulatedInterestAnnually(){
        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.setPrincipal(1000);
        assertEquals(1000,compoundInterest.getPrincipal());
        compoundInterest.setRate(7);
        assertEquals(7,compoundInterest.getRate());
        compoundInterest.setYear(10);
        assertEquals(10,compoundInterest.getYear());
    }
    @Test
    public void testForTheRateOfTwelveYears(){
        CompoundInterest compoundInterest = new CompoundInterest();
        compoundInterest.setAccumulatedInterest(12);
        assertEquals(12,compoundInterest.getAccumulatedInterest());
    }

}
