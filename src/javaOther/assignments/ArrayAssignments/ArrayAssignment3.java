package javaOther.assignments.ArrayAssignments;

public class ArrayAssignment3 {
    public static void main(String[] args) {

        int arr[] = new int[5];

        for (int i = 1, j = 0; i < 11; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                System.out.printf("%d ", arr[j]);
            }
        }
    }
}