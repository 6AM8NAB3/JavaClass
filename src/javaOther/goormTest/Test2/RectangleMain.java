package javaOther.goormTest.Test2;

import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    public int getRerimeter() {
        return 2* (width + height);
    }

    public void showInfo() {
        System.out.println("가로: " + width);
        System.out.println("세로: " + height);
        System.out.println("넓이: " + getArea());
        System.out.println("둘레: " + getRerimeter());
    }

}

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();

        Rectangle rect = new Rectangle(width, height);

        rect.showInfo();
    }
}

