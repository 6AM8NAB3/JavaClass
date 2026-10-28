package javaOther.assignments.InputAssignment;

import java.util.Scanner;

public class InputAssignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += sc.nextInt();
        }

        double average = sum / 10.0;
        System.out.printf("합: %d 평균: %.1f%n", sum, average);
        sc.close();
    }
}
