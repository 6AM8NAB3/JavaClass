package javaClass.inheritance;

public class CustomerTest3 {
    static void main() {
        Customer vc = new VIPCustomer(10030, "나몰라", 1102);
        vc.bsPoint = 1000;

        System.out.println(vc.name + "님이 지불해야 할 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }

}
