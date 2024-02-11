import java.awt.*;
import java.util.Scanner;
import java.util.Arrays;
public class PracticingArray {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter array number from 1- 10:   ");
        int requirement = input.nextInt();
        int[] grades = new int[requirement];

        for (int i = 0; i < grades.length; i++) {
            int x = input.nextInt();
            grades[i]=x;
        }
        System.out.println(Arrays.toString(grades));


    }

}
