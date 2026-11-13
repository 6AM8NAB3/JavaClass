package javaClass.inheritance;

public class CustomerTest2 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10011, "이순신");
        Customer customerKim = new VIPCustomer(20011, "김좌진", 2011);

        int price = customerLee.calcPrice(40000);
        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerLee.name + "님이 지불해야 할 금액은 " + price + "원입니다.");

        System.out.println();

        int priceVip = customerKim.calcPrice(40000);
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKim.name + "님이 지불해야 할 금액은 " + priceVip + "원입니다.");

    }
}
