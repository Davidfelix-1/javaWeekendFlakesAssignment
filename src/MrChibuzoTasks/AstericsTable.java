package MrChibuzoTasks;

public class AstericsTable {
    public static void main(String[] args) {

        System.out.print("(A)\t\t\t(B)\t\t\t(C)");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <i ; j++) {
                j++;
            }
            System.out.println("*");

        }
    }
}
