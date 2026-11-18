package javaClass.polymorphism.Customer;

import java.util.ArrayList;

public class CustomerTest2 {
    public static void main(String[] args) {
        System.out.println("==== 그냥 배열 버전 ====");

        Customer[] name = new Customer[5];

        name[0] = new VIPCustomer(1, "A", 01);
        name[1] = new GoldCustomer(2, "B");
        name[2] = new GoldCustomer(3, "C");
        name[3] = new Customer(4,"D");
        name[4] = new Customer( 5, "E");

        int price = 10000;

        for (Customer customer : name) {
            int priceI = customer.calcPrice(price);

            System.out.println(customer.name + "님이 지불해아히는 금액은 " + priceI + "원 입니다.");
            System.out.println(customer.showCustomerInfo());
            System.out.println();
        }





        System.out.println("==== ArrayList 버전 ====");

        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(new VIPCustomer(1, "A", 01));
        customerList.add(new GoldCustomer(2, "B"));
        customerList.add(new GoldCustomer(3, "C"));
        customerList.add(new Customer(4, "D"));
        customerList.add(new Customer(5, "E"));

        //int price = 10000;

        for (Customer customer : customerList) {
            int priceI = customer.calcPrice(price);

            System.out.println(customer.name + "님이 지불해야 하는 금액은 " + priceI + "원 입니다.");
            System.out.println(customer.showCustomerInfo());
            System.out.println();
        }
    }
}
