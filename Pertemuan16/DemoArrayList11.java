import java.util.ArrayList;

public class DemoArrayList11 {
    public static void main(String[] args) {
        ArrayList<Customer11> customers = new ArrayList<>(2);

        Customer11 customer1 = new Customer11(1, "Zakia");
        Customer11 customer2 = new Customer11(2, "Budi");

        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer11(4,"Cica"));
        customers.add(2, new Customer11(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer11 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        ArrayList<Customer11> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer11(201, "Della"));
        newCustomers.add(new Customer11(202, "Victor"));
        newCustomers.add(new Customer11(203, "Sarah"));

        customers.addAll(newCustomers);
        
        System.out.println(customers);
    }
}