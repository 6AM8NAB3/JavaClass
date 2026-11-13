package javaClass.inheritance;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerLee = new Customer();

        customerLee.id = 10010;
        customerLee.name = "이정연";
        customerLee.bsPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());
        System.out.println();

        VIPCustomer customerMoon = new VIPCustomer();
        customerMoon.id = 20010;
        customerMoon.name = "문성준";
        customerMoon.bsPoint = 10000;

        System.out.println(customerMoon.showCustomerInfo());
        System.out.println();

        VIPCustomer customerHa = new VIPCustomer(20011, "하강호", 1101);
        customerHa. bsPoint = 20000;
        //System.out.println(customerHa.showCustomerInfo());
        System.out.println(customerHa.showCustomerInfo());
    }
}
