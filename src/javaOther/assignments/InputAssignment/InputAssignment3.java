package javaOther.assignments.InputAssignment;

import java.util.Scanner;

public class InputAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] list = new char[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
        }
        System.out.println();
    }
}
