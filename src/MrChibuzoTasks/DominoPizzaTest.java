package MrChibuzoTasks;
//
//import java.util.Scanner;
//import java.uti
//
//public class DominoPizza {
//
//    public DominoPizza(ArrayList<DominoPizza> pizzas) {
//    }
//
//    public static void printWelcomeMessage() {
//        System.out.println("------------------------------------");
//        System.out.println("Welcome to the Pizza Order Program!");
//        System.out.println("------------------------------------");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        printWelcomeMessage();
//
//        ArrayList<DominoPizza> pizzas = new ArrayList<>();
//
//        System.out.println("Enter the total pizzas you would like to order: ");
//        int totalPizzas = scanner.nextInt();
//
//
//        for (int i = 0; i < totalPizzas; ++i) {
//            DominoPizza pizza = new DominoPizza();
//
//            ArrayList<String> toppings = new ArrayList<>();
//
//            String pizzaSize;
//            System.out.println("Enter the size of the pizza Large, Medium, Small: ");
//            pizzaSize = scanner.next();
//            pizza.setSize(pizzaSize);
//
//            int totalToppings;
//            System.out.println("Enter the total amount of toppings on the pizza: ");
//            totalToppings = scanner.nextInt();
//
//            for (int j = 0; j < totalToppings; ++j) {
//                System.out.println("Enter the topping: ");
//                String topping = scanner.next();
//                toppings.add(topping);
//            }
//
//            pizza.setToppings(toppings);
//            pizzas.add(pizza);
//        }
//
//
//
//        DominoPizza order = new DominoPizza(pizzas);
//        order.calculateTotalOrderCost();
//        order.printOrderSummary();
//
//
//        scanner.close();
//    }
//}