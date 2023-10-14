package FactorialOfAnyNumber;
import java.util.Scanner;
public class FactorialOfAnyNumber {
    public static void main(String[] args) {
        Scanner fac = new Scanner(System.in);
        System.out.print(" Enter a number to check for it factorial : ");
        int num = fac.nextInt();
        int i = 1 , fact=1;

        while (i<=num){
            fact= fact*i;
            i++;
        }
        System.out.println("the factorial is " +fact);
    }
}
