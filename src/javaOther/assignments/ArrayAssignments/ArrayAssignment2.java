package javaOther.assignments.ArrayAssignments;

public class ArrayAssignment2 {
    public static void main(String[] args) {

        char[] arr = new char[10];
        char ch = 'A';

        for (int i = 0; i < arr.length; i++) {
            System.out.print(ch);
            arr[i] = ch++;
        }
    }
}

