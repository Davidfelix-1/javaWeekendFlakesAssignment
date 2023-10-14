package RepeatOperation;
import java.util.Scanner;

public class RepeatOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne, numberTwo , sum = 0;


        do{
            System.out.print(" enter a numner : ");
            numberOne = sc.nextInt();
            System.out.print(" enter second number: ");
            numberTwo= sc.nextInt();
            sum =  numberOne + numberTwo;
            System.out.println("sum of two entries =" + sum);
        }
        while(numberOne +numberTwo == sum);




    }
}
