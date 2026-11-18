package javaClass.polymorphism.Customer;

public class Customer {
    protected int id; // 고객 아이디
    protected String name; //고객 이름
    protected String grade; //고객 등급
    int bsPoint; //보너스 포인트
    double bsRatio; //포인트 적립 비율

    public Customer() {
        initCustomer();
    }

    public Customer(int id, String name) {
        initCustomer();
        this.id = id;
        this.name = name;
    }

    void initCustomer() {
        this.grade = "SILVER";
        this.bsRatio = 0.01;
    }

    public int calcPrice(int price) {
        bsPoint += price * bsRatio;
        return price;
    }

    public String showCustomerInfo() {
        return name + "님의 등급은 " + grade + "이며, 보너스 포인트는 " + bsPoint + "입니다.";
    }
}
