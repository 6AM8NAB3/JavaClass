package javaOther.CloudeTest;

public class TestEx17 {
    public static void main(String[] args) {

        String[] cafeMenu = {"Americano", "CaffeLatte", "MileTea", "IceCream", "GreenTea"};

        cafeMenu[1] = "VanillaLatte";

        for (int i = 0; i < cafeMenu.length; i++){
            System.out.println(cafeMenu[i]);
        }
    }
}
