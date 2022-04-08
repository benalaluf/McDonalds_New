package Meal;

import IndividualDishes.Dish;
import Meal.MealType.ChipsType;
import Meal.MealType.DrinkType;
import Meal.MealType.MealSizeType;

import java.util.Scanner;

public class MealBase implements Meal {

    //protected Scanner scn = new Scanner(System.in);

    private DrinkType drink;
    private ChipsType chips;
    private MealSizeType mealSize;

    public MealBase(Dish dish, DrinkType drink, ChipsType chips, MealSizeType mealSize) {
        this.drink = drink;
        this.chips = chips;
        this.mealSize = mealSize;
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

    /** meal ordering basic ignore */
    private void orderCrisps() {
        System.out.println("pls chose crisps - ");
    //    setChips();
    }

    private void orderDrink() {
        System.out.println("pls chose drink - ");
    //    setDrink();
    }

    private void chooseMealSize() {
        System.out.println("pls chose meal size - ");
    //   setMealSize();
    }
}
