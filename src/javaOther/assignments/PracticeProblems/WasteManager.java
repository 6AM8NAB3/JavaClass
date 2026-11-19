package javaOther.assignments.PracticeProblems;

import java.util.ArrayList;

public class WasteManager {
    private ArrayList<Food> foods = new ArrayList<>();
    public static final double TARGET_RATE = 20.0;

    public void addFood(Food food) {
        foods.add(food);
    }

    public void printReport() {
        if (foods.isEmpty()) {
            System.out.println("등록된 음식이 없습니다.");
            return;
        }

        double totalServed = 0;
        double totalWaste = 0;

        System.out.println("=== 학교 급식 잔반 분석 결과 ===" + "\n");
        for (Food food : foods) {
            double wasteRate = food.getWasteRate();

            System.out.println("음식명: " + food.getName());
            System.out.println("배식량(g): " + food.getServedGrams() + "g");
            System.out.println("잔반량(g): " + food.getWasteGrams() + "g");
            System.out.printf("잔반율(%%): %.2f%%\n", wasteRate);
            System.out.println("개선 안내: " + food.getAdvice() + "\n");

            totalServed += food.getServedGrams();
            totalWaste += food.getWasteGrams();
        }

        double totalWasteRate = (totalWaste / totalServed) * 100.0;

        System.out.println("===== 전체 잔반 분석 =====");
        System.out.println("전체 배식량: " + totalServed + "g");
        System.out.println("전체 잔반량: " + totalWaste + "g");
        System.out.printf("전체 잔반율: %.1f%%\n", totalWasteRate);

        if (totalWasteRate <= TARGET_RATE) {
            System.out.println("목표 잔반율을 달성했습니다.");
        } else {
            System.out.println("잔반을 줄이기 위한 개선이 필요합니다.");
        }
    }
}
