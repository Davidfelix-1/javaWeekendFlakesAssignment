package MrChibuzoClass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomerInventoryTest {
    CustomerInventory customerInventory = new CustomerInventory();

    @Test
    public void testForCustomerName(){
        CustomerInventory customerInventory = new CustomerInventory();
        customerInventory.setName("CustomerOne");
        Assertions.assertNotNull(customerInventory.getName());
    }
   // @Test
    //public void testForNumbersOfItems(){
     //   CustomerInventory customerInventory = new CustomerInventory();
      //  customerInventory.setNumbersOfItems(new int[]{1});
        //Assertions.assertArrayEquals([1],customerInventory.getNumbersOfItems());
    }

