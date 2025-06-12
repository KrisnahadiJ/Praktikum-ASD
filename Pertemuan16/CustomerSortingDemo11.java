import java.util.ArrayList;
import java.util.List;

public class CustomerSortingDemo11 {
    static class Customer {
        String name;

        Customer(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Zainab"));
        customers.add(new Customer("Andi"));
        customers.add(new Customer("Rara"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(customers);
    }
}