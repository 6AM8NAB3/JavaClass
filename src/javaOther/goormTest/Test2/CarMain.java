package javaOther.goormTest.Test2;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    private static int serialNum = 101;

    private int num;
    private String carNum;
    private String carType;
    private int dailyPrice;
    private boolean rented;

    public Car(String carNum, String carType, int dailyPrice) {
        this.num = serialNum++;
        this.carNum = carNum;
        this.carType = carType;
        this.dailyPrice = dailyPrice;
        this.rented = false;
    }

    public int rent(int daily) {
        rented = true;
        return dailyPrice * daily;
    }

    public void showInfo() {
        System.out.println("관리번호: " + num);
        System.out.println("차량번호: " + carNum);
        System.out.println("차종: " + carType);
        System.out.println("1일 대여 요금: " + dailyPrice);
        System.out.println("대여 상태: " + rented);
        System.out.println();
    }
}

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("234하5678", "teslar", 100000));
        cars.add(new Car("555허2158", "sonata", 70000));
        cars.add(new Car("123호4567", "genesis", 90000));

        int totalPrice = 0;

        System.out.println("대여 차량(1.teslar, 2.sonata, 3.genesis)와 대여일수를 입력하세요.");
        int choice = sc.nextInt();
        int days = sc.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("잘못된 입력입니다.");
        } else {
            totalPrice = cars.get(choice - 1).rent(days);
        }

        for (Car car : cars) {
            car.showInfo();
        }

        System.out.println("총 대여금액: " + totalPrice);
    }
}
