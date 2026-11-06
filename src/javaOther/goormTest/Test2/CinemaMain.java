package javaOther.goormTest.Test2;

import java.util.Scanner;

class Customer {
    private String name;
    private int reservedSeats;

    public Customer(String name) {
        this.name = name;
        reservedSeats = 0;
    }

    public void addReservation(int cnt) {
        reservedSeats += cnt;
    }

    public void showInfo() {
        System.out.printf("%s : %d석\n", name, reservedSeats);
    }
}

class Cinema {
    private String title;
    private int availableSeats;

    public Cinema(String title, int availableSeats) {
        this.title = title;
        this.availableSeats = availableSeats;
    }

    public void reserve(Customer customer, int cnt) {
        if (cnt <= 0) {
            System.out.println("올바른 좌석 수를 입력하세요.");
        }
        else if(cnt > availableSeats) {
            System.out.println("예약 가능한 좌석이 부족합니다.");
        }
        else {
            availableSeats -= cnt;
            customer.addReservation(cnt);
        }
    }

    public void showInfo() {
        System.out.println("영화 제목: " + title);
        System.out.println("남은 좌석: " + availableSeats + "석");
    }
}

public class CinemaMain {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("어벤저스", 10);
        Scanner sc = new Scanner(System.in);

        Customer a = new Customer("홍길동");
        Customer b = new Customer("김철수");

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        cinema.reserve(a, s1);
        cinema.reserve(b, s2);

        System.out.println("===예약 결과===");
        a.showInfo();
        b.showInfo();
        cinema.showInfo();
    }
}
