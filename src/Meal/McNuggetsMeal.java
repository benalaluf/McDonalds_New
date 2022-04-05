package Meal;

import java.util.Scanner;

public class McNuggetsMeal extends MealBase {

    public McNuggetsMeal(String mealName) {
        this.mealName =mealName;
    }

    private int orderNuggets(int pieces) {
        switch (pieces) {
            case 4 -> {
                price = 4;
                addToTotalPrice();
                return 4;
            }
            case 6 -> {
                price = 6;
                addToTotalPrice();
                return 6;
            }
            case 10 -> {
                price = 10;
                addToTotalPrice();
                return 10;
            }
            case 20 -> {
                price = 20;
                addToTotalPrice();
                return 20;
            }
            default -> {
                System.out.println("pls enter valid number!");
                return -1;
            }
        }
    }

    @Override
    public void orderType() {
        int pieces;
        do {
            System.out.println("pls enter amount of nuggets - ");
            pieces = orderNuggets(scn.nextInt());
        } while (isValid(pieces));
    }
}