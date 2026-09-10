package javaOther.assignments.ArrayAssignments;

public class ArrayAssignment4 {
    public static void main(String[] args) {

        int[] arr = new int[]{89, 76, 100, 68, 48, 98, 56, 77, 95};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.printf("점수의 합: %d\n점수의 평균: %.1f", sum, (float) sum / arr.length);
    }
}