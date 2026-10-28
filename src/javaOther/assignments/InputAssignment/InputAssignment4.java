package javaOther.assignments.InputAssignment;

import java.util.Scanner;

public class InputAssignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            for (int k = 1; k <= i - j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= j * 2 - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
