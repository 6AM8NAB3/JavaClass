package javaOther.assignments.ArrayAssignments;

public class ArrayAssignment5 {
    public static void main(String[] args) {

        char[][] arr = new char[3][4];
        char alpha = 'A';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = alpha++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%c ", arr[i][j]);
            }
            System.out.println();
        }
    }
}

