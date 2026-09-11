package javaOther.CloudeTest;

public class TestEx15 {
    public static void main(String[] args) {

        int num = 10;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.printf("%d ", num);
                num--;
            }
            System.out.println();
        }
    }
}
