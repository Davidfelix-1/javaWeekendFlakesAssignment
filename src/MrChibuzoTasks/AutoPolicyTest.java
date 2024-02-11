package MrChibuzoTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoPolicyTest {

    AutoPolicy autoPolicy = new AutoPolicy(11111111, "Toyota Camry ","Nj");



    @Test

    public void testForAutoPolicyAccount(){
        AutoPolicy autoPolicy = new AutoPolicy();
        autoPolicy.setAccountNumber(123456);
        assertEquals(123456,autoPolicy.getAccountNumber());
    }


//    @Test
//    public void testForAutoPolicyBrandName(){
//        AutoPolicy autoPolicy = new AutoPolicy();
//        autoPolicy.setMakeAndModel("Audi","kk");
//        assertNotNull("Audi","kk");
//    }

}