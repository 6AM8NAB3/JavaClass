package javaClass.otherStream;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("이름: ");
     String name = sc.nextLine();

     System.out.println("직업: ");
     String job = sc.nextLine();

     System.out.println("사번: ");
     int id = sc.nextInt();
     sc.nextLine();

     System.out.println("전화번호: ");
     String phoneNum = sc.nextLine();

     System.out.println("이름: " + name + "\n직업: " + job + "\n사번: " + id + "\n전화번호: " + phoneNum);
    }
}
