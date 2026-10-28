package javaOther.assignments.InputAssignment;

import java.util.Scanner;

public class InputAssignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alp = new char[10];

        for (int i = 0; i < alp.length; i++) {
            alp[i] = sc.next().charAt(0);
        }

        for (int i = 0; i < alp.length; i++) {
            System.out.print(alp[i]);
        }
        System.out.println();
        sc.close();
    }
}
