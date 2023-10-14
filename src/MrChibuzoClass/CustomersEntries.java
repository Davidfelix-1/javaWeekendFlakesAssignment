package MrChibuzoClass;

public class CustomersEntries {
    public static void main(String[] args) {
        int numOfCustomers =4;
        int numOfPurchases =3;


        int [][]customersInventory = new int[numOfCustomers][numOfPurchases];

        customersInventory[0]= new int[]{2500, 1200,  800};
        customersInventory[1]= new int[]{11500, 850,  720};
        customersInventory[2]= new int[]{8000, 1200,  135};
        customersInventory[3]= new int[]{200,  120,   122};

        System.out.println("CustomerInventory Table");
        System.out.println("customer\tItem 1\tItem 2\tItem 3");
        for (int i = 0; i < numOfCustomers; i++) {
            System.out.print("Customer"+(i+1)+  "\t");
            for (int j = 0; j < numOfPurchases; j++) {
                System.out.print(customersInventory[i][j]+  "\t");
            }
            System.out.println();

        }
    }
}
