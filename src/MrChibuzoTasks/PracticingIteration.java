package MrChibuzoTasks;
import java.util.Scanner;
public class PracticingIteration {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number for Initial Deposit: ");
        double principal = scanner.nextInt();
        double rate= 0.05;

        System.out.printf("%s%20s%n","year", "amount on deposit");


        for (int year = 1; year <=10 ; ++year) {
            double amount =principal* Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);

        }





    }
}
