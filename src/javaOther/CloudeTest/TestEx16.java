package javaOther.CloudeTest;

public class TestEx16 {
    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((i+j) == 8) {
                    System.out.printf("%d + %d = 8\n", i, j);
                }
            }
        }
    }
}
