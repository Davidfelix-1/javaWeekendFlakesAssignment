package MrChiClassTwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    @Test
    public void testIfAccountHasAName(){
        Account account = new Account();
        account.setName("baba","ijebu");
        assertNotNull(account.getName());
    }



    @Test
    public void testIfAccountCanDeposit(){
        Account account = new Account();
        account.deposit(400);
        assertEquals(400,account.getBalance());

    }
    @Test
    public void testIfAccountCanWithdraw(){
        Account account =new Account();
        account.deposit(400);
        assertEquals(400,account.getBalance());
        account.withdraw(100);
        assertEquals(100,account.getBalance());
    }


}