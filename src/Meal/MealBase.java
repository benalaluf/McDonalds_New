package Meal;

import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

import java.util.Scanner;

public abstract class MealBase implements Meal {

    protected Scanner scn = new Scanner(System.in);

    private DrinkType drink;
    private ChipsType chips;
    private MealSizeType mealSize;

//    protected double price;
//    private double totalPriceMealSize = 0;
//    private double totalPrice = 0;

    public MealBase() {
    }

    /** set basic-meal things */
    public DrinkType setDrink(DrinkType drinkType) {
        switch (drink) {
            case COLA -> {
                return DrinkType.COLA;
            }
            case SPRITE -> {
                return DrinkType.SPRITE;
            }
            case FANTA -> {
                return DrinkType.FANTA;
            }
            default -> {
                return DrinkType.LEAN;
            }
        }
    }

    public ChipsType setChips(ChipsType chipsType) {
        switch (chips) {
            case POTATO -> {
                return ChipsType.POTATO;
            }
            default -> {
                return ChipsType.FRENCH;
            }
        }
    }

    public MealSizeType setMealSize(MealSizeType mealSizeType) {
        switch (mealSize) {
            case BIG -> {
                return MealSizeType.BIG;
            }
            case ENORMOUS -> {
                return MealSizeType.ENORMOUS;
            }
            default -> {
                return MealSizeType.REGULAR;
            }
        }

    }

    /** meal ordering basic */
    private void orderCrisps() {
        System.out.println("pls chose crisps - ");
        setCrisps(scn.next());
    }

    private void orderDrink() {
        System.out.println("pls chose drink - ");
        setDrink(scn.next());
    }

    private void chooseMealSize() {
        System.out.println("pls chose meal size - ");
        setMealSize(scn.next());
    }

    //TODO its very bad need to change
    @Override
    public void orderMeal() {
        System.out.println("--------------------------");
        this.orderType();
        orderCrisps();
        orderDrink();
        chooseMealSize();
    }

//    private double setTotalPriceMealSize() {
//        return switch (mealSize) {
//            case "regular" -> 1 * totalPriceMealSize;
//            case "big" -> 1.5 * totalPriceMealSize;
//            case "enormous" -> 1.8 * totalPriceMealSize;
//            default -> -1 * totalPriceMealSize;
//        };
//    }
//
//    public void addToTotalPrice() {
//        totalPrice += price;
//    }
//
//    private double getTotalPrice() {
//        return totalPrice + setTotalPriceMealSize();
//    }
//
//    public void recipe() {
//        System.out.println("------------------------");
//        System.out.println("the total price is - $" + getTotalPrice());
//        System.out.println("------------------------");
//
//    }
}
