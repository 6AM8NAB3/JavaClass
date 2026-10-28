package javaOther.assignments.InputAssignment;

import java.util.Scanner;

public class InputAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(num[i]);
        }
        System.out.println();
        sc.close();
    }
}
