package NaturalNumbers;

public class NaturalNumbers {
    public static void main(String[] args) {

        int num=10 , count, total =0;

        for (count = 1;  count<=10 ; count++) {
            total=total+count;

            System.out.println("sum of the first 10 natural numbers = "+total);
        }
    }
}