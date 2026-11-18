package javaClass.polymorphism.Customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer() {
        super(); //상위 클래스의 생성자를 호출하여 생성 (컴파일러가 자동으로 추가해줌)
        initVIP();
    }

    public VIPCustomer(int id, String name, int agentID) {
        super(id, name); //매개변수가 있을 시 꼭 명시를 해야함
        initVIP();
        this.agentID = agentID;
    }

    void initVIP() {
        grade = "VIP";
        bsRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bsPoint += price * bsRatio;
        return price - (int)(price * saleRatio);
    }

    public String showCustomerInfo() {
        //return showCustomerInfo() + "\n상담원 아이디는 " + getAgentID();
        return super.showCustomerInfo()+ "\n상담원 아이디는 " + getAgentID();
    }


}
