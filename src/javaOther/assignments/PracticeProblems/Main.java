package javaOther.assignments.PracticeProblems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WasteManager WM = new WasteManager();

        int foodCnt = sc.nextInt();

        for (int i = 0; i< foodCnt; i++) {
            int type = sc.nextInt();
            sc.nextLine();

            String name = sc.nextLine();
            double servedGrams = sc.nextDouble();
            double wasteGrams = sc.nextDouble();

            Food food = null;
            if (type == 1) {
                food = new RiceFood(name, servedGrams, wasteGrams);
            } else if (type == 2) {
                food = new SideDish(name, servedGrams, wasteGrams);
            }

            WM.addFood(food);
        }
        System.out.println("\n생성된 음식 객체 수: " + Food.getFoodCount() + "\n");
        WM.printReport();
    }
}
