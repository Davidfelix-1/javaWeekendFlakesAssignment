package MrChibuzoTasks;

import java.util.Arrays;

public class PrimeFunctions {
    public static void main(String[] args) {
                int[] numbers = { 1, 2, 3, 4, 5 };
                int n = numbers.length;
                int[] products = new int[n];

                int product = 1;
                for (int i = 0; i < n; i++) {
                    products[i] = product;
                    product *= numbers[i];
                }

                product = 1;
                for (int i = n - 1; i >= 0; i--) {
                    products[i] *= product;
                    product *= numbers[i];
                }

                System.out.println("The array of products of the numbers is: " + Arrays.toString(products));
            }
        }


