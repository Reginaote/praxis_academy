package contohkasus; 
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

public class App {

    public static void main(String[] args) {
        Customer customer1 = new Customer("regina", "lombok");
        Order order1 = new Order("baju", 50000, 2);
        customer1.order(order1);

        Customer customer2 = new Customer("reg", "jogja");
        Order order2 =  new Order("celana", 25000, 4);
        customer2.order(order2);

    }
}
