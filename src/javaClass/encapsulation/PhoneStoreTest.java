package javaClass.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone phone = new Phone("갤럭시", 300000);
        PhoneStore store = new PhoneStore(phone);
        Customer customer = new Customer("조현미", "아이폰", 2000000);

        customer.buyPhone(store);
    }
}