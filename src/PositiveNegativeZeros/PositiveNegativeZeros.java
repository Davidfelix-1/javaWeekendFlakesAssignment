package PositiveNegativeZeros;

import java.util.Scanner;
public class PositiveNegativeZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int positiveNumber = 0;
        int negativeNumber = 0;
        int zeros = 0;

        while(true){
            System.out.print("Enter a number (input 0 to stop):");
            int number = scanner.nextInt();

            if (number ==0){
                break;
            }
            else if ( number > 0){
                positiveNumber++;
            }
            else {
                negativeNumber++;
            }
        }
        System.out.println("positive number" +positiveNumber);
        System.out.println(" negative number" + negativeNumber);
        System.out.println(" zeros"+ zeros);

        scanner.close();
    }
}
