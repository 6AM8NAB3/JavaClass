package javaClass.polymorphism.Customer;

public class GoldCustomer extends Customer{
    private double saleRatio;

    public GoldCustomer() {
        super();
        initGold();
    }

    public GoldCustomer(int id, String name) {
        super(id, name); //매개변수가 있을 시 꼭 명시를 해야함
        initGold();
    }

    void initGold() {
        grade = "Gold";
        bsRatio = 0.02;
        saleRatio = 0.1;
    }

    @Override
    public int calcPrice(int price) {
        bsPoint += price * bsRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
