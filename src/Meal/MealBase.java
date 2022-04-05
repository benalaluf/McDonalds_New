package Meal;

import java.util.Objects;
import java.util.Scanner;

public abstract class MealBase implements Meal {

    protected Scanner scn = new Scanner(System.in);

    private String drink;
    private String crisps;
    private String mealSize;

    public String mealName;
    protected double price;
    private double totalPriceMealSize = 0;
    private double totalPrice = 0;

    public MealBase() {
        this.mealName = mealName;
    }

    boolean isValid(String valid) {
        return Objects.equals(valid, "invalid");
    }

    boolean isValid(int valid) {
        return valid == -1;
    }

    private String getMealName() {
        return mealName;
    }

    public String setDrink(String drink) {
        switch (drink) {
            case "coke" -> {
                totalPriceMealSize += 3;
                return "coke";
            }
            case "sprite" -> {
                totalPriceMealSize += 3;
                return "sprite";
            }
            case "lean" -> {
                totalPriceMealSize += 69;
                return "lean";
            }
            default -> {
                System.out.println("you entered invalid drink try coke/sprite/lean");
                return "invalid";
            }
        }
    }

    public String setCrisps(String crisps) {
        switch (crisps) {
            case "french" -> {
                totalPriceMealSize += 2;
                return "French";
            }
            case "potato" -> {
                totalPriceMealSize += 5;
                return "Potato";
            }
            default -> {
                System.out.println("you entered invalid crisps try french/potato");
                return "invalid";
            }
        }
    }

    public String setMealSize(String size) {
        switch (size.charAt(0)) {
            case 'r' -> {
                return "regular";
            }
            case 'b' -> {
                return "big";
            }
            case 'e' -> {
                return "enormous";
            }
            default -> {
                System.out.println("you entered invalid meal size try regular/big/enormous");
                return "invalid";
            }
        }

    }

    private void orderCrisps() {
        do {
            System.out.println("pls chose crisps - ");
            crisps = setCrisps(scn.next());
        } while (isValid(crisps));
    }

    private void orderDrink() {
        do {
            System.out.println("pls chose drink - ");
            drink = setDrink(scn.next());
        } while (isValid(drink));
    }

    private void chooseMealSize() {
        do {
            System.out.println("pls chose meal size - ");
            mealSize = setMealSize(scn.next());
        } while (isValid(mealSize));
    }

    @Override
    public void orderMeal() {
        System.out.println(getMealName());
        System.out.println("--------------------------");
        this.orderType();
        orderCrisps();
        orderDrink();
        chooseMealSize();
    }

    private double setTotalPriceMealSize() {
        return switch (mealSize) {
            case "regular" -> 1 * totalPriceMealSize;
            case "big" -> 1.5 * totalPriceMealSize;
            case "enormous" -> 1.8 * totalPriceMealSize;
            default -> -1 * totalPriceMealSize;
        };
    }

    public void addToTotalPrice() {
        totalPrice += price;
    }

    private double getTotalPrice() {
        return totalPrice + setTotalPriceMealSize();
    }

    public void recipe() {
        System.out.println("------------------------");
        System.out.println("the total price is - $" + getTotalPrice());
        System.out.println("------------------------");

    }
}
