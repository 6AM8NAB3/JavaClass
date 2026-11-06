package javaOther.goormTest.Test2;

import java.util.Scanner;

class VendingMachine {
    private String name;
    private int price;
    private int stock;

    public VendingMachine(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void sell(int qty) {
        if (qty > 0 && qty <= stock) {
            stock -= qty;
        }
        else {
            System.out.println("음료를 판매할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("음료 이름: " + name);
        System.out.println("가격: " + price + "원");
        System.out.println("남은 재고: " + stock + "개");
    }
}

public class VendingMachineMain{
    public static void main(String[] args) {
        VendingMachine vend = new VendingMachine("콜라", 1500, 10);
        Scanner sc = new Scanner(System.in);

        int qty = sc.nextInt();
        vend.sell(qty);
        System.out.println("==판매 후==");
        vend.showInfo();
    }
}