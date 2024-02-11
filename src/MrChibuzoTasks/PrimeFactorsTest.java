package MrChibuzoTasks;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {
    PrimeFactors primeFactors = new PrimeFactors(){};

   @Test
   void testForPrimeNumbers(){
       int[] digits = {1, 2, 3, 4, 5};
       int grab = digits.length;
       int[] products = new int[grab];

       int product = 1;
       for (int i = 0; i < grab; i++) {
           products [i]=product;
           product*= digits[i];
           System.out.println("This array product of number is   "+ Arrays.toString(products));
       }
   }
   @Test
   void testForSingleDigit(){
       int[] num ={20};
       int n = num.length;
       int[] result = new int[n];


   }



   }

